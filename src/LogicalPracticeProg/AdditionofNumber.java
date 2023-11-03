package LogicalPracticeProg;

public class AdditionofNumber {

	public static void main(String[] args) {

		int num = 123456789;
		int temp,sum=0;
		while(num>0)
		{
				temp = num % 10;
				num = num / 10;
				sum = sum + temp;
		}
		System.out.println("Addition of all Digits = " + sum);
	}

}
