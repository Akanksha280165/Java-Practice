public class VariableConcept2
{
   static int c=0;
	public static void main(String[] args)
	{
		VariableConcept2 vc=new VariableConcept2();
		vc.counter();
		System.out.println(c);
		vc.counter();
		System.out.println(c);
		vc.counter();
		System.out.println(c);
		
		System.out.println(c);
	}
	public void counter()
	{
		c++;
		System.out.println(c);
		c++;
	}
}