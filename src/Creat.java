import java.util.*;


public class Creat extends Thread {
	
	public void run() {
		Runtime r= Runtime.getRuntime();
	    Process p = null;
        try{
            p = r.exec("cmd.exe /c start test9.exe");
        } catch (Exception e) { 
            System.out.println("Error executing notepad.");
        } 
	}
	
	public static void main(String args[]) {
        int i=0;
		Creat[] p = new Creat[20];
		long costtime = 0;
		
		p[i] = new Creat();
		p[i++].run();
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		while((end-start)<1000*20)
			end = System.currentTimeMillis();
		p[i] = new Creat();
		p[i++].run();
		
		start = System.currentTimeMillis();
		end = System.currentTimeMillis();
		while((end-start)<1000*20)
			end = System.currentTimeMillis();
		p[i] = new Creat();
		p[i++].run();
    }
}