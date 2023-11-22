package com.itheima.d10_reflect;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception, IllegalAccessException {
        Class c = Student.class;

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+" "+method.getParameterCount()+ " "+method.getReturnType());
        }

        Student s = new Student();
        Method eat1 = c.getDeclaredMethod("eat");
        String invoke1 = (String) eat1.invoke(s);
        System.out.println(invoke1);


        Method eat2 = c.getDeclaredMethod("eat",String.class,int.class);
        eat2.setAccessible(true);
        String invoke2 = (String) eat2.invoke(s,"文龙",1000);
        System.out.println(invoke2);

    }
}
