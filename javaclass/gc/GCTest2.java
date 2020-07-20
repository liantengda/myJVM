package gc;
public class GCTest2 {

    private static final int SIZE = 3;


    public static void main(String[] args){
        test0();
        test1();
        test2();
    }


    private static void test0() {
        /*字符串会创建22byte的数组*/
        System.out.println("test0 start");
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            arr[i] = 100 + i;
        }
        System.out.println("test0 start");
    }

    private static void test1() {
        System.out.println("test1 start");
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            arr[i] = 100 + i;
        }
        System.out.println("test1 start");
    }

    private static void test2() {
        System.out.println("test2 start");
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            arr[i] = 100 + i;
        }
        System.out.println("test2 start");
    }
}

