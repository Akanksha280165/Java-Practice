import java.util.Scanner;

public class IdentifiersConcept
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the identifier");
   String string= sc.nextLine();
   
   
   if(string.equals("variable"))
   {
     System.out.println("variable name must follow camelCase");
     System.out.println("variable name cannot be reserved keywords");
     System.out.println("datatype must be defined");
	 
   }
   
  else if(string.equals("method"))
   {
     System.out.println("method name must be camelCase alongwith()");
     System.out.println("method name cannot be reserved keywords");
     System.out.println("return type must be defined");
     
   
   }
   
    else if(string.equals("class"))
   {
     System.out.println("class name must be PascalCase alongwith {}");
     System.out.println("class name cannot be reserved keywords");
     System.out.println("modifier must be defined ,if not then default access modifier is given by java");
	 
    
   }
   
   else
   {
     System.out.println("enter valid identifier ");
	   
   }
 }
}