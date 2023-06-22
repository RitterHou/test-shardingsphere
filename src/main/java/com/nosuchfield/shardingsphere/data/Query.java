package com.nosuchfield.shardingsphere.data;

import com.nosuchfield.shardingsphere.common.Constants;

import java.sql.*;

public class Query {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(Constants.ShardingSphereDriver);
        try (Connection conn = DriverManager.getConnection(Constants.ShardingSphereConfig)) {
            String sql = "SELECT * FROM t_order WHERE user_id=? OR order_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, "123");
                ps.setString(2, "abc");
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        System.out.printf("查询到数据，用户ID：%s，订单ID：%s，ID：%s%n", rs.getString("user_id"),
                                rs.getString("order_id"), rs.getString("id"));
                    }
                }
            }
        }
    }

}
