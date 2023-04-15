package abc;

 class Stringg {
public static void main(String[] args) {
	String s1="true";
	String s2="true";
	System.out.println(s1==s2);
	
	
	String s3=new String("true");
    String s4=new String("true");
    System.out.println(s3==s4);
    System.out.println(s3.equals(s4));



}

}
