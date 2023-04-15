package abc;
import java.util.Scanner;
public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1= sc.next();
		for(int i= str1.length()-1;i>=0;i--) {
		System.out.print(str1.charAt(i));
		}
	}
}
