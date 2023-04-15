package abc;
//import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s=sc.next();
     int n=sc.nextInt();
    
     System.out.printf("%-2s",s);
     System.out.printf("%04d\n",n);
	}


}

