import java.util.Scanner;

class ConditionalOperator

{
 public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the purchase amount");
	int purchase = sc.nextInt();
	
    int dis,result;
  
  if(purchase>=5000)
  {
   dis=(purchase/100)*10;
   result=purchase-dis;
   System.out.println("you are eligible for the discount");
   System.out.println("final bill of the cart is ="+result);
  }
 
 else if(purchase<5000)
  {
   System.out.println("not eligible for discount");
   System.out.println("final bill of the cart is ="+purchase);
  
  }
 }
}