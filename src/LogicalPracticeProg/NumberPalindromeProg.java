package LogicalPracticeProg;

public class NumberPalindromeProg {

	public static void main(String[] args) {

			int num = 121;
			int num1 = num;
			int rev=0,rem;
			
			System.out.println(1/10);
			System.out.println(1%10);
			while(num>0)
			{
					rem = num % 10;
					rev = rev*10 + rem;
					num = num / 10;
			}
	//		System.out.println(rev);
			
			if(num1==rev)
			{
				System.out.println("Number is Palindrome");
			}
			else
			{
				System.out.println("Number is not Palindrome");
				
			}
	}

}
