
import java.util.Scanner;
// code to print entire series if fibonacci
public class Fibonacci_series {public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int pos=sc.nextInt();
	System.out.println("Fibonacci series at is ");
	for(int i=0;i<=pos;i++) {
		System.out.print(fib(i)+" ");
	}
	
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
