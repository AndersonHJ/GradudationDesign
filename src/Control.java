import java.util.*;
import java.io.*;

public class Control{
    Timer timer;
	public int num=0;
	Creat[] ps = new Creat[20];
	
	public class Creat extends Thread {
		
		public void run() {
			Runtime r= Runtime.getRuntime();
		    Process p = null;
		    Process q = null;
	        try{
	        	q = r.exec("notepad");
	            p = r.exec("cmd.exe /c start test9.exe");
	        } catch (Exception e) { 
	            System.out.println("Error executing notepad.");
	        } 
		}
	}
	
	
    public Control(int seconds){
        timer = new Timer();
        timer.schedule(new TimerTestTask(), seconds*1,10000);
    }
    class TimerTestTask extends TimerTask{
    	public void run(){
    		if(num<20){
//    			System.out.println("a new");
    			ps[num] = new Creat();
    			ps[num++].run();
    			System.out.println("In TimerTestTask, execute run method.");
    		}
        }
    }
    
    public static void main(String args[]) {
        System.out.println("Prepare to schedule task.");
        new Control(2);
        System.out.println("Task scheduled.");
    }
}

