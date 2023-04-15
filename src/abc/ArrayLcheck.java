package abc;

import java.util.ArrayList;

public class ArrayLcheck {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(3);
		System.out.println("ans"+al.add(4));
		al.add(5);
		al.add(6);
		al.set(1,2);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
	}

}
