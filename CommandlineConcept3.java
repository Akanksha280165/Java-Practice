public class CommandlineConcept3
{
	public static void main(String[] ch)
	{
		String s1=ch[0];
		String s2=ch[1];
		String s3=ch[2];
		String s4=ch[3];
		 int length=ch.length;
		
		System.out.println("the length of the array passed is :"+length);
		
		
		boolean b1=Boolean.parseBoolean(s1);
		boolean b2=Boolean.parseBoolean(s2);
		float f1=Float.parseFloat(s3);
		double d1=Double.parseDouble(s4);
		
		System.out.println("the boolean value is :"+b1);
		System.out.println("the boolean value is :"+b2);
		System.out.println("the float  value is :"+f1);
		System.out.println("the double value is :"+d1);
		
		
		
	}
}