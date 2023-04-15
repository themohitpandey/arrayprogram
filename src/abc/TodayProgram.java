package abc;

import java.util.*;

public class TodayProgram 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a sentence: ");
	System.out.println(FindHighestFriquencyWord(sc.nextLine()));
	
}

private static String FindHighestFriquencyWord(String nextLine) {
	String str= nextLine.toLowerCase();
	String[] word= str.split(" ");
	int[] frq_word= new int[word.length];
	for(int i=0;i<word.length;i++) 
	{
		int[] frq = new int[26];
		String curr_word= word[i];
		for(int j=0;j<curr_word.length();j++) 
		{
			int index= (int)curr_word.charAt(j)-97;
			frq[index]++;
		}
		int max_curr_word = frq[0];
		for(int k=0;k<frq.length;k++) 
		{
			if(frq[k]>max_curr_word)
				max_curr_word= frq[k];
		}
		frq_word[i]= max_curr_word;
		
	}
	int max= frq_word[0];
	int ans =0;
	for(int s=0;s<frq_word.length;s++) 
	{
		if(frq_word[s]>max)
		{
			max=frq_word[s];
		}
	}
	for(int m=0;m<frq_word.length;m++) 
	{
		if(max==frq_word[m])
			ans=m;
	}
	return word[ans];
}
}
