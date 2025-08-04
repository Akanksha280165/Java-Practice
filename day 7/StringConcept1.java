public class StringConcept1
{
	public static void main(String[] args)
	{
		String s1="Renukoot";//creates object in SCP only
		String s2="Renukoot";//same
		String s3=new String("Renukoot");//creates object in heap
		String s4=new String("Renukoot");//same
		String s5="Renukoot";//creates object in SCP only
		String s6=" is a town in district Sonebhadra.";//same 
		
		System.out.println(s1==s2);// SCP doesnot allows duplicacy of object with same content both, s1 nd s2 are pointing to same object inside SCP
		System.out.println(s1==s3);//both objects have different location ie different references
		System.out.println(s1==s4);//same as above
		System.out.println(s2==s3);//same as above
		System.out.println(s2==s4);//same as above
		System.out.println(s3==s4);//with new keyword everytime distinct object is created, even for object with same content
		
		System.out.println(s1.equals(s2));//.equals() for String class objects checks content not address hence true
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		
		System.out.println(s5);
	
		
		
		String s7=s5.concat(s6);// this creates another object inside heap
		System.out.println(s7);
		System.out.println(s5);//object of s5 inside SCP is not changed
		
		
	}
}