import java.util.Scanner;

class Factorial{
public static void main(String args[]){
	int i,result=1;
 Scanner  sc = new Scanner(System.in);
 System.out.println("enter the number");
 int num = sc.nextInt(); 
 for(i=1;i<=num;i++)
 {
   result= result*i;
 }
 System.out.println("the factorial of a number  " +" "+ result);
}
}