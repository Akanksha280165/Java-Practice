public class StringConcept7
{
	public static void main(String[] args)
	{
		String s1 = new String("!!! Jai Shri Mataji !!!");
		System.out.println("the string inside heap is : "+s1);
		System.out.println("the length of string including space is : "+s1.length());
		System.out.println();
       
	    //indexOf()
  	    int n1=s1.indexOf("s");	
		System.out.println(n1);
		int n2=s1.indexOf("S");	
		System.out.println(n2);
	    int n3=s1.indexOf("i");	
		System.out.println(n3);
	    int n4=s1.indexOf("M");	
		System.out.println(n4);
		System.out.println();
		
		//lastindexOf()
		int l1=s1.lastIndexOf("i");
		System.out.println(l1);
		int l2=s1.lastIndexOf("a");
		System.out.println(l2);
		
		
		//toCharArray()
		char[] arr=s1.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				System.out.print(arr[i]+",");
				count++;
			}
		}
		   System.out.println();	
		   System.out.println("the length of the string without space is : "+count);	
	} 
}