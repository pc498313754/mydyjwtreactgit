package com.example.jwtsecutity.config.redis;

public class RedisConstant {
    public static final Integer DEFAULT_SYNC_LENGTH = 1000;
    /**
     * 默认数据库中存储数据长度为200,后期根据数据库内存使用情况调整(调整步频为200)
     */
    public static final Integer DEFAULT_MAX_LENGTH = 2000;
    /**
     * 数据自增步长为1
     */
    public static final Integer INCREMENT = 1;
    /**
     * 数据自减步长为1
     */
    public static final Integer REDUCTION = -1;
    /**
     * 存储用户信息key
     */
    public static final String USER = "user:";
    public static final String CATEGORY = "CATEGORY123:";
    public static final String FARM = "farm:";

}
