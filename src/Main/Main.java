package Main;


public class Main{

    public volatile static int incrmnt;

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        HZ hz = new HZ(main);
            Thread thread1 = new Thread(hz);
            Thread thread2 = new Thread(hz);
            thread1.start();
            thread2.start();
        System.out.println("Whait...");
        thread1.join();
        thread2.join();
        System.out.println(main.incrmnt);

    }

    synchronized void incr(){
        for (int i = 0; i < 2000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Main.incrmnt++;
        }
    }


}
