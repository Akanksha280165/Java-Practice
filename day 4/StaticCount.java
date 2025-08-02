import java.util.Scanner;

public class StaticCount
{
	public void  employeeInfo()
	{
		EmployeeDetails emp= new EmployeeDetails();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the employee name : ");
		emp.empName=sc.nextLine();
		System.out.println();
		
		
		System.out.print("enter the employee age : ");
		emp.empAge=sc.nextInt();
		System.out.println();
		
		sc.nextLine();
		
		System.out.print("enter the employee department : ");
		emp.empDepartment=sc.nextLine();
		System.out.println();
		System.out.println();
		
		
		System.out.println("employee Id is : "+EmployeeDetails.companyId);
		System.out.println("the name is : "+emp.empName);
		System.out.println("the age is : "+emp.empAge);
		System.out.println("the department is : "+emp.empDepartment);
	
	}
}