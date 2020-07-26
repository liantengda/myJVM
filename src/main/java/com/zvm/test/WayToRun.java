package com.zvm.test;

/**
 *
 * 解释执行  如下代码可以执行好久   速度贼慢
 * 编译执行  对于执行频率比较高的代码，JVM可以将其编译为本地方法，不再进行解释执行。
 * 混合模式  先解释，等到代码段升级为热点代码，就编译为本地方法，进行执行。速度相当快
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 11:00
 */
public class WayToRun {

    public static void main(String[] args) {
        for (int i=0;i<10_0000;i++){
            m();
        }

        long start = System.currentTimeMillis();
        for (int i=0;i<10_0000;i++){
            m();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


    private static void m(){
        for (long i=0;i<10_0000L;i++){
            long j = i%3;
        }
    }
}
