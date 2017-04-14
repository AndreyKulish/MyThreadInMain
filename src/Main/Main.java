package Main;


public class Main{
    Object objectMutix = new Object();
    public volatile static int incrmnt;

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        HZ hz = new HZ(main);
            Thread thread1 = new Thread(hz);
            Thread thread2 = new Thread(hz);
            long onTime = System.currentTimeMillis();
            thread1.start();
            thread2.start();
        System.out.println("Whait...");
        thread1.join();
        thread2.join();
        long offTime = System.currentTimeMillis();
        System.out.println("Затраченное время - " + (offTime - onTime));
        System.out.println(main.incrmnt);

    }

     void incr(){

        for (int i = 0; i < 2000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objectMutix){
            Main.incrmnt++;
        }
        }
    }


}
