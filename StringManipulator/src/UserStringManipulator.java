import java.util.Scanner;

public class UserStringManipulator 
{

	public static void main(String[] args) 
	{
		StringManipulator SM  = new StringManipulator();
		Scanner in = new Scanner(System.in);
		String tryStr="Y";
		String manString = "";
		
		while (tryStr.equals("Y"))
		{
			System.out.println("Which method would you like to use? (Reverse - Rev; Replace - Rep)"); 
			String methodStr = in.next();
			System.out.println("Please enter the string you would like to manipulate: ");
			String origString = in.next();
			if (methodStr.equals("Rev"))
			{	
				System.out.println("Working on Rev");
				manString = SM.reverse(origString);
			}	
			else
			{
				System.out.println("Working on Replace");
				manString = SM.noVowels(origString);
			}
			
			System.out.println(manString);
			System.out.println("Do you want to try again? (Y / N): ");
			tryStr = in.next();
		}
		
	}

}
