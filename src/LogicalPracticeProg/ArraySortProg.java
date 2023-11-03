package LogicalPracticeProg;

import java.util.Arrays;

public class ArraySortProg {

	public static void main(String[] args) {

			int a [] = {3,5,6,1,9,2,4,7};
			int temp=0;
/*			
			for(int i=0;i<a.length;i++)
			{
					for(int j=i+1;j<a.length;j++)
					{
							if(a[i]>a[j])
							{
								temp = a[i]  ;
								a[i]  = a[j];
								a[j] = temp;
							}
					}
					System.out.print(a[i] + " ");
			}

			Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			{
					System.out.print(a[i] + " ");
			}
*/
			
			for(int i=0;i<a.length;i++)
			{
					for(int j=i+1;j<a.length;j++)
					{
							if(a[i]<a[j])
							{
								temp = a[i]  ;
								a[i]  = a[j];
								a[j] = temp;
							}
					}
					System.out.print(a[i] + " ");
			}

			
	}

}
