package com.zvm.test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 20:59
 */
public class HelloGC {
    public static void main(String[] args) {
        System.out.println("Hello GC!");
        List list = new LinkedList<>();
        for (;;){
            byte[] b = new byte[1024*1024];
            list.add(b);
        }
    }
}
