package com.itheima.d4_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("手表",100);
        map.put("手表",220); // 后面重复的数据会覆盖前面的数据（键）
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);



    }
}
