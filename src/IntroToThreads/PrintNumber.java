package IntroToThreads;

public class PrintNumber implements Runnable {
    private int num;

    public PrintNumber(int num) {
        this.num = num;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.print("");
//        }
        System.out.println(num + " Printing using " + Thread.currentThread().getName());
    }
}
