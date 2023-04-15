package abc;

import java.util.Scanner;

public class AbcAbc {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the string value");
String str=sc.next();
	System.out.println(countAbc(str));
	}

	private static int countAbc(String str) {
		int count=0;
		String str2= str.toLowerCase();
			for (int i = 0; i < str2.length(); i++) {
				
				if (str2.charAt(i) == 'c'
		              && str2.charAt(i-1) == 'b'
						&& str2.charAt(i-2) == 'a')
						
				{
					count++;
				}
			} 
		return count;
	}
}
