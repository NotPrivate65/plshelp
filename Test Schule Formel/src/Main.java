import java.util.Random;

public class Main {

    public static void main(String[] args) {

        CustomThread t1 = new CustomThread();
        CustomThread t2 = new CustomThread();
        CustomThread t3 = new CustomThread();
        CustomThread t4 = new CustomThread();
        CustomThread t5 = new CustomThread();
        CustomThread t6 = new CustomThread();
        CustomThread t7 = new CustomThread();
        CustomThread t8 = new CustomThread();
        CustomThread t9 = new CustomThread();
        CustomThread t10 = new CustomThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
