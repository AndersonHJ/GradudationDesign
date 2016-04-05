import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class iorun {
    Timer timer;
    public iorun(int seconds) {
        timer = new Timer();
        timer.schedule(new TimerTestTask(), seconds*10, 1);
        
    }
    class TimerTestTask extends TimerTask {
    	FileOutputStream outio = null;
    	
        public void run() {
        		System.out.println("In TimerTestTask, execute run method.");
 //           timer.cancel(); 
        			
        			try{
        				outio = new FileOutputStream("iore.txt");
        			
        				
        				System.out.println("write done!");
        				outio.write(("raw=1255659457203 | formatted=16-十月-2009 10:17:37:203 | frequency=447674 | delta=16ms"
        	+"raw=1255659457218 | formatted=16-十月-2009 10:17:37:218 | frequency=436583 | delta=15ms"
        	+"raw=1255659457234 | formatted=16-十月-2009 10:17:37:234 | frequency=439379 | delta=16ms"
        	+"raw=1255659457250 | formatted=16-十月-2009 10:17:37:250 | frequency=426547 | delta=16ms"
        	+"raw=1255659457265 | formatted=16-十月-2009 10:17:37:265 | frequency=447048 | delta=15ms"
        	+"raw=1255659457281 | formatted=16-十月-2009 10:17:37:281 | frequency=459522 | delta=16ms"
        	+"raw=1255659457296 | formatted=16-十月-2009 10:17:37:296 | frequency=414816 | delta=15ms"
        	+"raw=1255659457312 | formatted=16-十月-2009 10:17:37:312 | frequency=458826 | delta=16ms").getBytes());
        			}catch(Exception e){
        				e.getMessage();
        			}finally{
        				try{
        					outio.close();
        				}catch(IOException e){
        					e.getMessage();
        				}
        			}
        }
    }
    public static void main(String args[]) {
        System.out.println("Prepare to schedule task.");
        new iorun(2);
        System.out.println("Task scheduled.");
//        while(true){}
    }
}