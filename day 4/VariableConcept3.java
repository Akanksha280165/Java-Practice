public class VariableConcept3
{
	int s1;
	static String s2;
	public static void main(String[] args)
	{
		//static int n1=12;//static variable must be outside the method
		int n2= 13;//this is local variable wrt main() not instance variable becoz it is inside main()
		VariableConcept3 c= new VariableConcept3();
		c.s1=343;
		s2="Adishakti Maa";
		System.out.println("the value of instance variable is : "+c.s1);
		System.out.println("the value of static variable is : "+s2);
		System.out.println("the value of static variable is : "+VariableConcept3.s2);
		System.out.println();
		c.s1=234;
		s2="sahaj yog";
		System.out.println("the value of instance variable is : "+c.s1);
		System.out.println("the value of static variable is : "+s2);
		System.out.println("the value of static variable is : "+VariableConcept3.s2);
		System.out.println();
		
		System.out.println("the value of local variable is : "+n2);
		
		
		
		
		
		
		
	}
}