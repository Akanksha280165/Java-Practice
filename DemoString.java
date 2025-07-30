

public class DemoString
{
	public static void main(String[] args)
	{
		String s1=new String("maa");
		String s2=new String("maa");
		
		System.out.println("abc "+(s1==s2));
		System.out.println("HEAP "+s1.equals(s2));
		
		
	}
}