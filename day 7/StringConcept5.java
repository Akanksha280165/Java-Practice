public class StringConcept5
{
	public static void main(String[] args)
	{
		String s1="i am in bangalore";
		int length=s1.length();
		System.out.println("the length of the string using length() including  space is  : "+length);
		
		char ch1=s1.charAt(5);
		System.out.println("the character at index 5 is : "+ch1);
		char ch2=s1.charAt(4);
		System.out.println("the character at index 4 is : "+ch2);
		char ch3=s1.charAt(6);
		System.out.println("the character at index 6 is : "+ch3);
		char ch4=s1.charAt(9);
		System.out.println("the character at index 9 is : "+ch4);
		char ch5=s1.charAt(13);
		System.out.println("the character at index 13 is : "+ch5);
		char ch6=s1.charAt(16);
		System.out.println("the character at index 16 is : "+ch6);
		
		
		
		char[] arr=s1.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
				count++;
		}
		System.out.println("the length of the string without space using for loop is  : "+count);
		
	}
}