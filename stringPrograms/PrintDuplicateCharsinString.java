package stringPrograms;

public class PrintDuplicateCharsinString {
	public static void main(String[] args) {
		
		String string1 = "ramsesha";

		int count;
		  //Counts each character present in the string    
		char string[] = string1.toCharArray();
		
		for(int i=0;i<string.length;i++)
		{
			count = 1;
			
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!= ' ') 
				{
					count++;
				string[j] = '0';   //Set string[j] to 0 to avoid printing visited character  
			}
		}
		
		//A character is considered as duplicate if count is greater than 1    
		if(count>1 && string[i]!='0')
		System.out.println("Duplicate characters are:" + string[i]);

		}
		
	}//Main

}//Class
