public class InstanceVariable2
{
	public void display()
		{
			InstanceVariable1 in= new InstanceVariable1();//instance variable can be called only by object creation
			String s2=in.s1;
			System.out.println("name is : "+s2);
			
		}
}