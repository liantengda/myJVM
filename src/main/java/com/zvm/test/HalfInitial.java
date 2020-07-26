package com.zvm.test;

/**
 * 半初始化
 * @author Ted
 * @version 1.0
 * @date 2020/7/25 14:00
 */
public class HalfInitial {

    private static volatile HalfInitial INSTANCE;

    private Integer m = new Integer(100);

    private HalfInitial(){}

    public static HalfInitial getINSTANCE(){
        if(INSTANCE == null){
            synchronized (HalfInitial.class){
                if(INSTANCE==null){
                    INSTANCE = new HalfInitial();
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {

        System.out.println(getINSTANCE()==getINSTANCE());

    }
}
