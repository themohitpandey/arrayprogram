package abc;

import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter each elements of array one by one:");
	int [] array= new int[n];
	for(int i=0;i<n;i++)
	{
	   array[i]= sc.nextInt();
	}
	
	System.out.println("enter the index u want to delete");
	int ind= sc.nextInt();
	array = deleteOpr(array,ind);
	System.out.println("new array after deletion");
	for(int i=0;i<array.length;i++)
	System.out.println(array[i]);
	}
	public static int[] deleteOpr(int []array,int ind)
	   {
		  int [] array2= new int[array.length-1];
		  for(int i=0;i<ind;i++) {
			  array2[i]=array[i];
		  }
		  for(int i=ind+1;i<array.length;i++) {
			  array2[i-1]=array[i];
		  }
		  return array2;
       
	   }
}
