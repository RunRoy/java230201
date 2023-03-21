package com.atguigu.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lystart
 * @create 2023-02-26 18:38
 */
public class Exer3 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("浙江省", Arrays.asList("绍兴市", "温州市", "湖州市", "嘉兴市", "台州市",
                "金华市", "舟山市", "衢州市", "丽水市", "杭州市", "宁波市"));
        map.put("海南省", Arrays.asList("海口市", "三亚市"));
        map.put("北京市", Arrays.asList("北京市"));

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
