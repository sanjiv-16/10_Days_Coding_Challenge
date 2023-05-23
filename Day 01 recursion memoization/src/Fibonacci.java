import java.util.*;

// 0 1 1 2 3 5 8 13 21 34 .......
//just send value of position using recursion

public class Fibonacci {
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
		val=fib(a-1)+fib(a-2);
		
		return val;
		
	}

}
