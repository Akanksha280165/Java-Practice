public class CommandlineConcept2
{
	public static void main(String[] num)
	{
		String num1=num[0];
		String num2=num[1];
		String num3=num[2];
		int length= num.length;
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int n3=Integer.parseInt(num3);
		
		int num4=n1*n2;
		int num5=n1+n2;
		int num6=n1/n2;
		int num7=n1-n2;
		System.out.println("the length of the array passed is :"+length);
		System.out.println("the result of mutiplication is :"+num4);
		System.out.println("the result of addition is :"+num5);
		System.out.println("the result of subtraction is :"+num7);
		System.out.println("the result of division is :"+num6);
		
		
		
		
		
	}
}