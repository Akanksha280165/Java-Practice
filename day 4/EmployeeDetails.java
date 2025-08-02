import java.util.Scanner;

public class EmployeeDetails
{
	String empName;
	int empAge;
	String empDepartment;
	static int companyId;
	public static void main(String[] args) throws Exception
	{
		StaticCount  count = new  StaticCount();
		companyId++;
		count.employeeInfo();
		
		companyId++;
		count.employeeInfo();
		
		/*companyId++;
		count.employeeInfo();
		
		companyId++;
		count.employeeInfo();*/
		
		
		
	}
}