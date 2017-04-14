package Main;


public class Main{

    public static int incrmnt;
    /*private volatile int incrmnt;*/

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        HZ hz = new HZ(main);
        for (int i = 0; i < 1000; i++){
            Thread thread = new Thread(hz);
            thread.start();
        }

        Thread.sleep(100);
        System.out.println(main.incrmnt);

    }

    /*synchronized */void incr(){
        Main.incrmnt++;
    }


}
