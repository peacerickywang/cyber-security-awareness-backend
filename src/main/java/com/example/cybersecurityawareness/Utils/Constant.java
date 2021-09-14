package com.example.cybersecurityawareness.Utils;

import java.util.HashMap;
import java.util.Map;

public class Constant {
    /**
     * 加密方式
     */
    public static String HASH_ALGORITHM_TYPE = "MD5";
    /**
     * 加密次数
     */
    public static int HASH_ITERATION = 2; //加密的次数
    /**
     * 默认判断题题数
     */
    public static int TRUE_OR_FALSE_NUMBER = 4;
    /**
     * 默认选择题题数
     */
    public static int MULTIPLE_NUMBER = 6;
    /**
     * 题目类型
     */
    public static String TRUE_OR_FALSE = "TRUE_OR_FALSE";
    public static String MULTIPLE = "MULTIPLE";
    /**
     * 题目类型Map
     */
    public static Map<String, Integer> questionTypeMap;
    static {
        questionTypeMap = new HashMap<>();
        questionTypeMap.put(TRUE_OR_FALSE, 0);
        questionTypeMap.put(MULTIPLE, 1);
    }
}
