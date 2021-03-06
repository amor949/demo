package com.example.demo.logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 日志内容常量
 *
 * @author 郭启帆
 * @create 2019-08-27 11:54
 */
public final class LogConstant {
    /**
     * 测试日志常量内容
     *
     * @return
     */
    public static Map<String, String> testConstant() {
        Map<String, String> map = new HashMap<>(3);
        map.put("测试：0", "测试：正常");
        map.put("测试：1", "测试：删除");
        map.put("测试：2", "测试：审核");
        return map;
    }
}
