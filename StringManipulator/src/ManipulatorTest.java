/**
 * 
 * @author mshanker22
 *
 */
public class ManipulatorTest 
{

	public static void main(String[] args) 
	{
		StringManipulator SM  = new StringManipulator();
		String ori_str = "shanker";
		
		String rep_str = SM.noVowels(ori_str);
		System.out.println(rep_str);
		
		String rev_str = SM.reverse(ori_str);
		System.out.println(rev_str);
	}

}
