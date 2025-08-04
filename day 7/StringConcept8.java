public class StringConcept8
{
	public static void main(String[] args)
	{
		String s1="Namma Metro Yellow line";
		String s2= new String("Multi grain atta flour");
		String s3= s1.substring(4);
		System.out.println(s3);
		
		String s5= s1.substring(4,15);
		System.out.println(s5);
		
		String s4= s2.substring(6);
		System.out.println(s4);
		
		String s6= s2.substring(4,18);
		System.out.println(s6);
		
		String s7="saavan k somvaar ki hardik shubhkamanaye";
		String s8= new  String("Happy Monsoon");
		String s11=s7.toUpperCase();
		String s12=s8.toUpperCase();
		System.out.println(s11);
		System.out.println(s12);
		System.out.println();
		
		String s9="CONVERT TO ARRAY FORMAT";
		String s10=new  String("Weather Of Bangalore is Good");
		String s13=s9.toLowerCase();
		String s14=s10.toLowerCase();
		System.out.println(s13);
		System.out.println(s14);
		
		
		
		
		
	}
}