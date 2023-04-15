package abc;

import java.awt.SystemColor;

class A{
int i;
}
class B extends A{
	int j;
	void disp() {
		System.out.println(i);
	}
	
	
}

 class Bc  {

	public static void main(String[] args) {
A obj=new B();
	System.out.println(obj.i);
	System.out.println(obj.j);

	}

}
