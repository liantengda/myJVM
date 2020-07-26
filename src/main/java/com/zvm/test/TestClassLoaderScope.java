package com.zvm.test;

/**
 *
 * 每个类加载器的加载范围
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 9:06
 */
public class TestClassLoaderScope {
    public static void main(String[] args) {
        String pathBoot = System.getProperty("sun.boot.class.path");
        System.out.println(pathBoot.replaceAll(";",System.lineSeparator()));

        System.out.println("------------------------");
        String pathExt = System.getProperty("java.ext.dirs");
        System.out.println(pathExt.replaceAll(";",System.lineSeparator()));


        System.out.println("-------------------------");
        String pathApp = System.getProperty("java.class.path");
        System.out.println(pathApp.replaceAll(";",System.lineSeparator()));
    }
}
