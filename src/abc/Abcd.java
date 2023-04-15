package abc;

 public class Abcd {
	  
			int Sid;
			 String Sname;
			double contactNo;
			static String institute;
			Abcd(int Sid,String Sname, double contactNo,String institute)
			{
				this.Sid=Sid;
				this.Sname=Sname;
				this.contactNo=contactNo;
				this.institute=institute;
			}
			public static void main(String[] args) {
				Abcd e1=new Abcd(123,"MOHIT",8404940675l,"QSP");
			   System.out.println(e1.Sname);
				}
			}	


