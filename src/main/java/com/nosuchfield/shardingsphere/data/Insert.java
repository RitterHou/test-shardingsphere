package com.nosuchfield.shardingsphere.data;

import com.nosuchfield.shardingsphere.common.Constants;
import com.nosuchfield.shardingsphere.common.Utils;

import java.sql.*;

public class Insert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(Constants.ShardingSphereDriver);
        try (Connection conn = DriverManager.getConnection(Constants.ShardingSphereConfig)) {
            String sql = "INSERT INTO t_order (`user_id`, `order_id`) VALUES (?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                for (int i = 0; i < 20; i++) {
                    ps.setString(1, Utils.getUserId());
                    ps.setString(2, Utils.getOrderId());
                    int num = ps.executeUpdate();
                    System.out.println(num);
                }
            }
        }
    }

}
