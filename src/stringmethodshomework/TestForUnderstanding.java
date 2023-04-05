package stringmethodshomework;

public class TestForUnderstanding {
	
	//change name order
	String changename (String name,String Midname,String Surname)
	{
		String arr[]= {name,Midname,Surname};
		return arr[2]+" "+arr[0]+" "+arr[1];

	}
	
//palindrome
	


	 static boolean ispalindrome(String name)
	 {
		 String rev1 = "";
		 boolean f = false;
		 for (int j =name.length()-1;j>=0;j-- )
			{
				rev1=rev1+name.charAt(j);
			}
						System.out.println("Reverse String: "+rev1);
			if (name.equals(rev1))
			{
			 f = true;
			}
			return f;
		
			
					
	 }	
	
	public static void main(String[] args) {
//Change name order
		TestForUnderstanding tf = new TestForUnderstanding();
		System.out.println(tf.changename("Sripriya","Sukumar","Aruru"));
		
//duplicate characters
		
		String s1 = "Srseepriya ";
		int len = s1.length();
		char ch[] = s1.toCharArray();//string s1. converted into to a char arry
		
		for (int i = 0;i<len;i++)
		{
			
			for (int j = i+1;j<len;j++)
			{
		//	System.out.println("i = "+ch[i]+"j = "+ch[j]);	
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate char are: "+ch[j]);
					break;
				}
			}
		}
		
//reverse string
		
	String rev = "";
	
	for (int i =len-1;i>=0;i-- )
	{
		rev=rev+s1.charAt(i);
	}
				System.out.println("Reverse String: "+rev);
				
//palindrome
				
		System.out.println(ispalindrome("madam"));			 
						
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}



			}				
				
				
				
//		String n = "SripriyaS";
//		char ch = n.charAt(1);
//		System.out.println(ch);//s
//		int ind = n.indexOf(ch, 5);
//		if (ind != -1)
//		{
//		System.out.println("Found ch at given index:"+ind);
//		}
//		String n = "Sripriyias";
//		StringBuffer sb = new  StringBuffer();
//		
//		for (int i=0;i<n.length();i++)
//		{
//			char ch = n.charAt(i);
//			int ind = n.indexOf(ch, i+1);
//			if (ind == -1)//-1 means ch not found
//			{
//				sb.append(ch);
//			}
//			
//			
//		}
//		System.out.println(sb);

		
	
		
	
