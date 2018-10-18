
import java.util.Scanner;

public class UserStringManipulator 
{

	public static void main(String[] args) 
	{
		StringManipulator SM  = new StringManipulator();
		Scanner in = new Scanner(System.in);
		String tryStr="y";
		String manString = "";
		
		while (tryStr.equals("y"))
		{
			System.out.print("Which method would you like to use? (Reverse - rev; Replace - rep)"); 
			String methodStr = in.nextLine();
			
			while(!methodStr.equals("rev") && !methodStr.equals("rep"))
			{
				System.out.print("Please enter a valid method");
				methodStr = in.nextLine();
			}
			
			System.out.print("Please enter the string you would like to manipulate: ");
			String origString = in.nextLine();
			if (methodStr.equals("rev"))
			{	
				manString = SM.reverse(origString);
			}	
			else
			{
				manString = SM.noVowels(origString);
			}
			
			System.out.println(manString);
			System.out.print("Do you want to try again? (y / n): ");
			tryStr = in.next();
			
			while(!tryStr.equals("y") && !tryStr.equals("n"))
			{
				System.out.print("Please reenter y or n");
				tryStr = in.next();
			}
			
		}
		
	}

}
