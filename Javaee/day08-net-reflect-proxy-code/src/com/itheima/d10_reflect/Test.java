package com.itheima.d10_reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class Test {
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day08-net-reflect-proxy-code\\src\\obj.txt"), true);
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("===========" + simpleName + "==========");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String fname = field.getName();
            Object fvalue = field.get(obj);
            String f = fname + "=" + fvalue;
            ps.println(f);

        }
        ps.close();


    }
}
