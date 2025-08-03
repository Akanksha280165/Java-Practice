import java.util.Scanner;

class Table
{
   public static void main(String args[])
   {
    int  a=1;
    Scanner sc =new Scanner(System.in);
	System.out.println("enter the number to print table");
	
	int num=sc.nextInt();
	System.out.println("table of "+  + num + " is ");
	
	for(int i=1;i<=10;i++)
	{
	 a=num*i;
	  System.out.println( num+"*"+i+"="+(a));
	  
	}
	}
}