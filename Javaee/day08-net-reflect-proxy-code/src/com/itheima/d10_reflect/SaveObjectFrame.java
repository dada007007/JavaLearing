package com.itheima.d10_reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrame {
    /**
     * 必须接收任意对象保存其字段和值
     * @param obj
     */
    public static void saveObject(Object obj) throws Exception {

        PrintStream ps = new PrintStream(new FileOutputStream("day08-net-reflect-proxy-code/src/obj.txt", true));
        // obj = pig employee student teacher
        // 只有反射技术可以做这个通用功能。
        // 1、提取这个对象的Class类。
        Class c = obj.getClass();
        // 2、拿到保存的是哪个信息
        String name = c.getSimpleName(); // 类名就是保存的信息。
        ps.println("===================" + name +"===================");
        // 3、提取这个对象的全部字段（成员变量 ）

        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            String fName = field.getName();
            String fValue = field.get(obj) + "";
            ps.println(fName + "=" + fValue);
        }
        ps.close();
    }
}











