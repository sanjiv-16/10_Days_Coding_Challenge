import java.util.*;
public class Factorial {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Factorial of "+a+" = "+ fact(a));
		
	}
	public static int  fact(int a) {
		int result =1;
		if(a==0) {
			return result=1;
		}
		result=a*fact(a-1);
		return result;
		
	}

}
