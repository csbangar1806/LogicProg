package LogicalPracticeProg;

public class PalindromeStringProg {

	public static void main(String[] args) {

			String originalString = "nitin";
			
			String duplicateString = originalString;
			String rev = "";
			char ch;
			System.out.println("Original String  = " + originalString) ;
			
			for(int i=originalString.length()-1;i>=0;i--)
			{
//				ch =	originalString.charAt(i);
//				rev = rev + ch;
				rev = rev + originalString.charAt(i);
			}
			System.out.println("Reverse String  = " + rev);
			
			if(duplicateString.equals(rev))
			{
						System.out.println("String is Palindrome");
			}
			else
			{
				System.out.println("String is Not Palindrome");
			}
	}

}
