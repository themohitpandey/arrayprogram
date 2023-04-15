
package abc;

import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the string");
		  String n=sc.next();
		  display(n);
		  
		  
	}
 public static void display(String s) {
	 for(int i=0;i<s.length();i++) {
		 int k=i;
		 char ch=s.charAt(k);
		 if(ch==0)
		 {
			 for(int j=k;j>=0;j--){
		
				 System.out.println();
				 
				 
			 }
		 }
	 }
	 
 }
}
