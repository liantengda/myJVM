package com.zvm.test.classworkflow;

/**
 * 类运行流程
 * @author Ted
 * @version 1.0
 * @date 2020/7/26 20:52
 */
public class ClassWorkFlow {
    public static void main(String[] args) {
        System.out.println(PrePareBefore.count);
        System.out.println(PrePareAfter.count);
    }
}


class PrePareAfter {
    public static int count = 2;
    public static PrePareAfter c = new PrePareAfter();
    private PrePareAfter(){
        count++;
    }
}

class PrePareBefore {

    public static PrePareBefore t = new PrePareBefore();
    public static int count = 2;

    private PrePareBefore(){
        count++;
    }

}