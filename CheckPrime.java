 import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int div=2;
		boolean isPrime=true;
		sc.close();
		while(div <= n/2) {
			if(n%div==0) {
				System.out.println("Not Prime");
				isPrime=false;
				return;
			}
			div=div+1;
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
	}

} 
    

