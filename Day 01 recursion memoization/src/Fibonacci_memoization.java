import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// here we use map data structure to store value of each position it reduces the every time recursion
//     key value pairs 
public class Fibonacci_memoization {
	
	//
	public static Map<Integer,Integer> cache=new HashMap<Integer,Integer>();
	//
	
	public static void main(String[] args)
	{
	     
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		System.out.println("Fibonacci value at "+pos+" is "+ fib(pos));
		
	}
	public static int  fib(int a) {
		int val=0;
		if(a==0) {
			return 0;
		}
		if(a==1 || a==2) {
			return 1;
		}
		if(cache.containsKey(a)) {
			return cache.get(a);
		}
		val=fib(a-1)+fib(a-2);
		cache.put(a,val);
		
		return val;
		
	}

}
