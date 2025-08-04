public class StringConcept3
{
	public static void main(String[] args)
	{
		//code explaining String is immutable in java
		String s1="SiyaRam";
		String s2="siyaRam";
		String s4="jai!! ";
		System.out.println(s1==s2);//in String when we try to change content value another object is created inside SCP but previous object remains unchanged
		String s3=s1.concat(" ki jai!!");//creates another object inside heap 
		System.out.println(s3==s1);// we tried to concat String s1 with another String, as string is immutable hence another object is created	
		System.out.println(s3);// another object with modified content is created inside SCP
		System.out.println(s1);// String is immutable hence s1 is same
		
		
		String s5=s4.concat(s2);
		System.out.println(s5);
		System.out.println(s4);// String is immutable
		
		
		System.out.println(s5==s4);//we modified s4 using concat hence another object is created inside scp
		System.out.println(s5==s2);
		// String is immutable in java for String literal form of object
		
		
		String s6=new  String("Bangalore");
		String s7=new  String("Bangalore");
		System.out.println(s6==s7);// even though content is same different object is created each time when new keyword is used 
		System.out.println(s6.equals(s7));// content is same (but different object created each time new keyword is used)
		String s8=s6.concat(" city");//creates another object inside heap
		System.out.println(s8==s6);//by using new also when data is changed then different object is created with different address
		System.out.println(s8);
		System.out.println(s6);//content of s6 remains unchanged
		//String is immutable even for new keyword form of object
		
		
		
	}
}