package com.nosuchfield.shardingsphere.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {

    private static final List<String> userIds = new ArrayList<>(Arrays.asList("123", "456", "789"));

    private static final List<String> orderIds = new ArrayList<>(Arrays.asList("abc", "def", "ghi", "jkl", "mno"));

    private static final Random randomGenerator = new Random();

    public static String getUserId() {
        int index = randomGenerator.nextInt(userIds.size());
        return userIds.get(index);
    }

    public static String getOrderId() {
        int index = randomGenerator.nextInt(orderIds.size());
        return orderIds.get(index);
    }

}
