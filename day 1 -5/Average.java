import java.util.Scanner;

class Average
{
  public static void main(String args[])
  {
	  int s=0,b;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("how many number you want to enter");
    int n= sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	  System.out.println("enter the number");
	  int a=sc.nextInt();
	  s=s+a;
	}
	 b =s/n;
	System.out.println("Average of numbers is" + b);
  }
  
}