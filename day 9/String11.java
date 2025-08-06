import java.util.Scanner;
public class String1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String s1[]= new String[10];
		System.out.print("enter the words inside string array you want : ");
		
		for(int i=0;i<10;i++){
			s1[i]=scanner.nextLine();
		}
		
		for(int i=0;i<10;i++){
			System.out.print(s1[i]+", ");
		}
	}
}