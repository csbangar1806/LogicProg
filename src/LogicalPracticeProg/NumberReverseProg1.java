package LogicalPracticeProg;

public class NumberReverseProg1 {

	public static void main(String[] args) {

			int num = 12345;
			String revNum = Integer.toString(num);
			String rev="";
			char ch;
			
			for(int i=revNum.length()-1; i>=0; i--)
			{
					ch = revNum.charAt(i);
					rev = rev + ch ; 
			}
			System.out.println("Reverse Number = " + rev);
			
	}

}
