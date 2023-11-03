package LogicalPracticeProg;

public class VowelsConsonantsProg {

	public static void main(String[] args) {

			String str1 = "I am an Automation Engineer";
			System.out.println("My String is = " + str1);
			System.out.println("String Length is = " + str1.length());
			
			String str = str1.toLowerCase();
			int vCount=0,cCount=0;
			
			for(int i=0;i<str.length();i++)
			{
					if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
					{
							vCount++;
					}
					else
					{
							cCount++;
					}
			}
			System.out.println("Number of Vowels = " + vCount);
			System.out.println("Number of Consonants = " + cCount);
	}

}
