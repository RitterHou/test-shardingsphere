package com.nosuchfield.shardingsphere.data;

import com.nosuchfield.shardingsphere.common.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(Constants.ShardingSphereDriver);
        try (Connection conn = DriverManager.getConnection(Constants.ShardingSphereConfig)) {
            String sql = "DELETE FROM t_order WHERE user_id = '999'";
            try (Statement statement = conn.createStatement()) {
                int i = statement.executeUpdate(sql);
                System.out.printf("删除了 %d 条数据\n", i);
            }
        }
    }

}
