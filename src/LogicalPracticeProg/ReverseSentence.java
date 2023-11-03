package LogicalPracticeProg;

public class ReverseSentence {

	public void revSentence()
	{
		String sentence  =  "I am an Automation Test Engineer";
		String splitArray [] =  sentence.split(" ");
		
		for(int i=0;i<splitArray.length;i++)
		{
					System.out.print(splitArray[i] + " ");
		}
		
		System.out.println("\n---------------------------------------------------------------");
		// reverse sentence
		
		for(int i=splitArray.length-1;i>=0;i--)
		{
					System.out.print(splitArray[i] + " ");
		}
	}
	
	public void reverseEachWordofSentence()
	{
		System.out.println("\n--------------------------------------------------------------------");
		String sentence  =  "I am an Automation Test Engineer";
		String splitArray [] =  sentence.split(" ");
	//	String revWord = "";
		char ch;
		String revEachWord [] =  new String[6];
		
		for(int i=0;i<splitArray.length;i++)
		{
			String	revWord = "";
			for(int j=0;j<splitArray[i].length();j++)
			{
				 	ch = splitArray[i].charAt(j);
				 	revWord = ch + revWord ;
			}
			revEachWord[i]  = revWord;
		}
		
		for(int k=0;k<revEachWord.length;k++)
		{
				System.out.print(revEachWord[k] + "  ");
		}
	}
	
	public static void main(String[] args) {

		ReverseSentence r = new ReverseSentence();
//		r.revSentence();
			
		r.reverseEachWordofSentence();
	}

}
