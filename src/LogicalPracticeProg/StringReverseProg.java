package LogicalPracticeProg;

public class StringReverseProg {

	public static void main(String[] args) {

			String originalStr = "HariBhauPatil";
			String reverseStr = "";
			char ch;
			for(int i=originalStr.length()-1   ;   i>=0   ;   i--)
			{
					ch = originalStr.charAt(i);
					reverseStr = reverseStr + ch;
			}
			
			System.out.println("Reverse String = " + reverseStr);
	}

}
