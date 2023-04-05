package stringmethodshomework;

public class DuplicateChar {
// to find duplicate char in a given string
	
	
	public static void main(String[] args) {
		
		String name = "Srseepriya";
		int length = name.length();
		 char ch[]= name.toCharArray();//string converted into to a char arry
		 
		for (int i = 0;i<length;i++)
		{
			
			for (int j = i+1;j<length;j++)
				
			{
				//System.out.println("i = "+i+"j= " +j);for understanding is s=0 frist compare with j of all numbers
				if (ch[i]==ch[j])
				{
					System.out.println("Duplicate chars are: "+ch[j]);
					break;
				}
			}
		}
		
		
	}

}
