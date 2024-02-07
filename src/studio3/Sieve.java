package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Find all prime numbers up to:");
		int n = in.nextInt();
		
		boolean[]primes=new boolean[n+1];
		
			for (int i=0;i<primes.length;i++) 
			{
			primes[i]=true;
			}
			
			for(int j=2;j<=n;j++){
			if (primes[j]) {
				for (int i=j+j;i<=n;i=i+j)
				{
					primes[i]=false;
				}
			}
			}
			
			for (int i=2;i<=n;i++) {
				if(primes[i]) {
					System.out.println(i);
				}
			}
			

	}

}
