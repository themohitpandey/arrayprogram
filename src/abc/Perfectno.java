package abc;

import java.util.Scanner;

public class Perfectno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n/2;i++) {
			if(n%i==0)sum=sum+i;
		}
		if(sum==n)
			System.out.println("its a perfect no.");
		else System.out.println("not a perfect no.");

	}

}
