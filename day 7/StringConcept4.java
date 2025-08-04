public class StringConcept4
{
	public static void main(String[] args)
	{
		String s1="Bangalore";
		String s2=new  String("Bangalore");
		String s3=s2.intern();
		System.out.println("is s1 nd s2 same wrt address : "+s1==s2);
		System.out.println("is s3 nd s2 same wrt address : "+s3==s2);
		System.out.println("is s3 nd s1 same wrt address : "+s3==s1);//why sir 
		
		
		
		//String s4="bangalore";
		/*String s5=new  String("bangalore");
		String s6=s5.intern();
		System.out.println("is s5 nd s6 same wrt address : "+s5==s6);//why sir*/
		
		
		
	}
}