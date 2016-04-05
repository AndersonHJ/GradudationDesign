
import java.util.*;
import java.math.*;

public class RateCal{
	
	
	public static void main(String[] args){
		long max = 3372036854775807L;
		while(true){
			long i=0;
			for(;i<max;){
				Random one = new Random(System.currentTimeMillis());
				i = Math.abs(one.nextLong()%(max+1000000000000L));
			}
			System.out.println("!!!Done!!!"+ i);
			max -= 1000000L;
		}
	}
	
}