public class StringConcept6
{
	public static void main(String[] args)
	{
		String s1= new String("KODEWALA");
		String s2= new String("kodewala");
		boolean b=s1.equalsIgnoreCase(s2);
		System.out.println("the result is : "+b);
		System.out.println();
		
		char ch1= s1.charAt(0);
		System.out.println(ch1);
		char ch2= s1.charAt(3);
		System.out.println(ch2);
		char ch3= s1.charAt(5);
		System.out.println(ch3);
		System.out.println();
		
		
		char ch4= s2.charAt(0);
		System.out.println(ch4);
		char ch5= s2.charAt(3);
		System.out.println(ch5);
		char ch6= s2.charAt(5);
        System.out.println(ch6);
		System.out.println();
		
		char[] arr=s1.toCharArray();
		int length=arr.length;
		System.out.println("the length of the String is : "+length);
		System.out.println();
		
	}
}