package LogicalPracticeProg;

public class PrimeNumberProg {

		public static void main(String[] args) {
			
			int num = 87;
			int count = 0;
			
			for(int i=2;i<num/2;i++)  // for(int i=2;i<87;i++)
			{
					if(num % i==0)
					{
							count ++;
							break;
					}
			}
			if(count==1)
			{
					System.out.println("Not a Prime Number");
			}
			else
			{
				System.out.println("Prime Number");
			}
		}
}
