public class StaticVariable
{
	static int count;
	public static void main(String[] args)
	{
		System.out.println(StaticVariable.count);
		
		StaticVariable s = new StaticVariable();
		count++;
		System.out.println(StaticVariable.count);
		//count++;
		//count++;
		Object1 ob = new Object1();
		ob.deposit();
		count++;
		
		ob.deposit();
		count++;
		ob.deposit();
		count++;
		
		System.out.println(StaticVariable.count);
		
		
		
	}
}