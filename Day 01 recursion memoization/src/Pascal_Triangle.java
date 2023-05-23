import java.util.*;
public class Pascal_Triangle {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Pascal's Traiangle");
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
				
			}
			System.out.println("");
		}
		
	}
	public static int fact(int a) {
		int val=1;
		if(a==0) {
			return 1;
			
		}
		val=a*fact(a-1);
		return val;
	}
	

}
