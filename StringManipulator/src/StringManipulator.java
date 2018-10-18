/**
 * 
 * @author mshanker22
 *
 */
public class StringManipulator 
{
	public String reverse(String str)
	{
		
		String retStr = "";
		for (int i=str.length()-1; i >= 0; i--)
	     {
	         char tempstring = str.charAt(i);
	         retStr = retStr + tempstring;
	     }
		 return retStr;
	}
	
	public String noVowels(String str)
	{
		
		String retStr = "";
		for (int i=0; i < str.length(); i++)
	     {
	         char tempstring = str.charAt(i);
	         if (tempstring == 'a' || tempstring == 'A'|| tempstring == 'e' || tempstring == 'E' || tempstring == 'i'|| tempstring == 'I' || tempstring == 'o'|| tempstring == 'O'|| tempstring == 'u'||tempstring == 'U')
	         {
	             retStr = retStr + "*";
	         }
	         else
	         {
	             retStr = retStr + tempstring;
	         }
	         
	     }
		 return retStr;
	}
}


