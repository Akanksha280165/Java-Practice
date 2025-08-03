import java.util.Scanner;

class EvenAndOdd
{ 
  public static void main(String args[])
  {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the range");
	int num= sc.nextInt();

    System.out.println("enter the type to print");
	String name = sc.nextLine();
	for(int i=1;i<=num;i++)
	{
    if(name=="even")
	{ 
      if(i%2==0)
	  {
		  System.out.println(i);
	  }
		
	}
	else{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
	}
  } 
}