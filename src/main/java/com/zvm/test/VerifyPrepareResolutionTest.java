package com.zvm.test;

/**
 * 加载
 * 连接   验证--准备（赋予默认值）--解析
 * 初始化
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 12:19
 */
public class VerifyPrepareResolutionTest {
    public static void main(String[] args) {
        System.out.println(T.count);
        System.out.println(C.count);
    }
}

class T {
    public static T t = new T();
    public static int count = 2;

    private T(){
        count++;
    }
}

class C {
    public static int count = 2;
    public static C c = new C();

    private C(){
        count++;
    }
}
