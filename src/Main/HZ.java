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

        main.incr();
    }
}
