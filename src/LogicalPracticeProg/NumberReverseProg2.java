package LogicalPracticeProg;

public class NumberReverseProg2 {

	public static void main(String[] args) {

			 int num = 12345;
			 int r ;
			 while(num>0)
			 {
				 	r = num % 10;
				 	 System.out.print(r);
				 	num = num/10;
			 }
//			 System.out.println("Reverse number = " + r);
/*	 
			 for(int i=0 ; i<5 ; i++)
			 {
				 r = num % 10;
			 	 System.out.print(r);
			 	num = num/10;	
			 }
*/
		//	 System.out.println(12345/10);
	}

}
