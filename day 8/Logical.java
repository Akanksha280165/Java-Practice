import java.util.Scanner;

class LogicalOperator
{
 public static void main(String []args)
 {
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the age of candidate");
   int age= sc.nextInt();
   
   System.out.println("enter the state of domicile of candidate");
   String state= sc.next();
   
   
   if(age>=18 && age<60)
   {
    if(state.equals("karnataka") || state.equals("kerala"))
	{
	 System.out.println("candidate is eligible for the license");
	}
	
	else
	{
	 System.out.println("candidate doesnot belongs to respective state");
	 System.out.println("candidate not eligible for license");
	 }
	 
   }
   
   
	 else
	 {
	 System.out.println("candidate is not within age limit");
	  
	 }
   
   }
}