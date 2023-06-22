package com.nosuchfield.shardingsphere.data;

import com.nosuchfield.shardingsphere.common.Constants;
import com.nosuchfield.shardingsphere.common.Utils;

import java.sql.*;

public class Update {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(Constants.ShardingSphereDriver);
        try (Connection conn = DriverManager.getConnection(Constants.ShardingSphereConfig)) {
            String sql = "UPDATE t_order SET user_id = '999' WHERE user_id = '123'";
            try (Statement statement = conn.createStatement()) {
                int i = statement.executeUpdate(sql);
                System.out.printf("更新了 %d 条数据\n", i);
            }
        }
    }

}
