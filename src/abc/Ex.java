package abc;

import java.util.Scanner;

public class Ex {

   public static void main(String[] args) {
  
   int d=10;
   int e=0;
   int[] ar= {1,2,3,4};
  
   
   
   
   try {
	  
	   ar[5]=2; 
	   int f=d/e;
   
   
   
   }
  catch(ArithmeticException h){
	   System.out.println("ho gya exception handle");
	System.out.println(ar[0]);    
	   
   }
   catch(ArrayIndexOutOfBoundsException s) {
	   System.out.println("arr wala handle ");
   }
   
   {
    System.out.println("jaiiii sriiii rammmmmmmmmmmmmmmm");
   }
   
   System.out.println("jaiiii mataaaa diiiiii");
   }
    {
	   System.out.println("mai static hu");
   }
}
