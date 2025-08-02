public class VariableConcept1
{
	int c=0;
	public static void main(String[] args)
	{
		VariableConcept1 vc=new VariableConcept1();
		vc.counter();
		System.out.println(vc.c);
		vc.counter();
		System.out.println(vc.c);
		vc.counter();
		System.out.println(vc.c);
		
		System.out.println(vc.c);
	}
	public void counter()
	{
		c++;
		System.out.println(c);
		c++;
	}
}