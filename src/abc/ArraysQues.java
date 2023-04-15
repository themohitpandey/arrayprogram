package abc;

import java.util.Scanner;

public class ArraysQues {
      public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of the array: ");
      int s=sc.nextInt();
      int[] arr=new int[s];
      System.out.println("Enter the elements in the array: ");
      for(int i=0;i<s;i++) {
    	  arr[i]=sc.nextInt();
      }
      for(int i=0;i<s-1;i++) {
    	  int temp=arr[i];
    	  for(int j=i+1;j<s;j++) {
    		  if(arr[i]>arr[j]) {
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    			  temp=arr[i];
    		  } } }
      for(int i=0;i<s;i++) {
    	  System.out.print(arr[i]+"  ");
      }
      System.out.println();
      System.out.println("First minimum no. in the array: "+arr[0]);
      System.out.println("Second minimum no. in the array: "+arr[1]);
      System.out.println("First maximum no. in the array: "+arr[arr.length-1]);
      System.out.println("Second maximum no. in the array: "+arr[arr.length-2]);
      System.out.println("Last minimum no. in the array: "+arr[0]);
      System.out.println("Last maximum no. in the array: "+arr[arr.length-1]);
	  System.out.println("Sum of first three minimum no.: "+(arr[0]+arr[1]+arr[2]));
	  System.out.println("Sum of first three maximum no.: "+(arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3]));
	  System.out.println("Product of first three minimum no.: "+(arr[0]*arr[1]*arr[2]));
	  System.out.println("Product of first three maximum no.: "+(arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]));
	  
	 System.out.println("hiii this is first changes");
       }

}
