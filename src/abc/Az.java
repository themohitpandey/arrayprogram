package abc;



public class Az {
   static int a=2;
          int b=3;
  
  
    public static void main(String[] args)
    {
     Az sc=new Az();
     
     System.out.println(sc.b);
     System.out.println(sc.a);//using object reference variable//static variable
	   System.out.println(a);//directly
	   System.out.println(Az.a);//classname
    forMain();
    
       }
      
    
    void disp() {
 	   System.out.println("from disp");
 	   System.out.println();
       }
      
       
     public  static void forMain() {
    	   System.out.println("from forMain");
    	   Object sc;
		System.out.println(sc.a);//using object reference variable//static variable
    	   System.out.println(a);//directly
    	   System.out.println(Az.a);//classname
    	   
    	   
    	
             }
    }
