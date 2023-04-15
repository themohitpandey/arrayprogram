package abc;

 class Example {
	public static void main(String[] args) {
		Object array[]= {125,"sujit",65.5448,'a'};
		Student1 s1= new Student1();
		Sudent2 s2= new Sudent2();
		Student3 s3= new Student3();
		Jsp oArray[]= {s1,s2,s3};
		System.out.println( oArray[0].leg);
		for(int i=0;i<oArray.length;i++) 
		{
 
			if(oArray[i] instanceof Student1) 
   			   {
			   Student1 a1=(Student1)oArray[i];
			   System.out.println(a1.id);
			   }
			if(oArray[i] instanceof Sudent2) 
			   {
			   Sudent2 a2=(Sudent2)oArray[i];
			   System.out.println(a2.id);
			   }
			if(oArray[i] instanceof Student3) 
			   {
			   Student3 a3=(Student3)oArray[i];
			   System.out.println(a3.id);
			   }
	   }
	}

}
