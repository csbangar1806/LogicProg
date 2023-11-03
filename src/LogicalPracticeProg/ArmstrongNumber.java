package LogicalPracticeProg;

public class ArmstrongNumber {

	public static void main(String[] args) {

			int num = 371;
			int rem,sum = 0;
			int num1 = num;
			
			while(num>0)
			{
					rem = num % 10;
					sum = sum + rem * rem * rem ;
					num = num/10;
			}
			if(num1==sum)
			{
					System.out.println("Armstrong Number");
			}
			else 
			{
					System.out.println("Not a Armstrong Number");
			}
	}

}
