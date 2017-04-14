package Main;

/**
 * Created by Andrey on 14.04.2017.
 */
public class HZ implements Runnable {
    Main main;
    HZ(Main main){
        this.main = main;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        main.incr();
    }
}
