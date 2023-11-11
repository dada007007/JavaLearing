package com.itheima.d6_system_runtime;

import java.util.Scanner;

/**
 *  目标：了解下Runtime的几个常见方法。
 */
public class RuntimeTest {
    public static void main(String[] args) throws Exception {
        // 1、public static Runtime getRuntime() 返回与当前Java应用程序关联的运行时对象。
        Runtime jre = Runtime.getRuntime();

        // 2、public void exit(int status) 终止当前运行的虚拟机,该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
        // jre.exit(0);

        // 3、public int availableProcessors(): 获取虚拟机能够使用的处理器数。
        System.out.println("处理器数量：" + jre.availableProcessors());

        // 4、public long totalMemory() 返回Java虚拟机中的内存总量。 字节数。
        System.out.println("Java虚拟机中的内存总量：" + jre.totalMemory()/1024.0/1024.0 + "MB");

        // 5、public long freeMemory() 返回Java虚拟机中的可用内存量
        System.out.println("Java虚拟机中的可用内存量：" + jre.freeMemory()/1024.0/1024.0 + "MB");

        // 6、public Process exec(String command)：执行命令,启动程序,返回一个进程对象代表这个软件。
        jre.exec("calc");
        Process p1 = jre.exec("QQ");

//        // 通过按钮关闭程序。
        Scanner sc = new Scanner(System.in);
        System.out.println("是否关闭y/n");
        switch (sc.next()){
            case "y":
                p1.destroy(); // 关闭软件
                break;
            default:
                System.out.println("取消");
        }
    }
}
