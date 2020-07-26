package com.zvm.test;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 9:13
 */
public class loadClassByHand {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = loadClassByHand.class.getClassLoader().loadClass("com.zvm.test.loadClassByHand");
        System.out.println(aClass.getName());
    }
}
