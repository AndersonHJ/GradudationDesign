import java.util.*;


public class routine {
    Timer timer;
    public routine(int seconds) {
        timer = new Timer();
        timer.schedule(new TimerTestTask(), seconds*1);
    }
    class TimerTestTask extends TimerTask {
    	public void run() {
            System.out.println("In TimerTestTask, execute run method.");
//            timer.cancel(); 
        }
    }
    public static void main(String args[]) {
        System.out.println("Prepare to schedule task.");
        new routine(2);
        System.out.println("Task scheduled.");
    }
}