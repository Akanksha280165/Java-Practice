import java.util.Scanner;

class PowerOfNumber
{
 public static void main(String args[])
 {
	
   Scanner sc =new Scanner(System.in);
   
   System.out.println("enter the number");
   int num1=sc.nextInt();
   
   System.out.println("enter the base");
   int a=sc.nextInt();
   System.out.println("power of"+  + num1 + "is =");
   
   int result=1;
   
   for(int i=1;i<=a;i++)
   {
	  
      	  result =result*num1;
   }
   System.out.println(result);
   
   
   
 }
}