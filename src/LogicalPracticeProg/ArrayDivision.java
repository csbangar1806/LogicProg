package LogicalPracticeProg;

public class ArrayDivision {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + "  ");

				if(a[i]%4==0)
				{
						System.out.println();
				}
		}
	}

}
