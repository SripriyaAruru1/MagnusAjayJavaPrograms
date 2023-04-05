package homework;

import java.util.Scanner;

public class StringHomework {
	//3.To check given string is a palindrome or not//
	static boolean isPalindrome(String p)
	{
		String rev1 = "";
		boolean b = false;
		
			 for (int j = p.length()-1;j>=0;j--)
			{
				rev1 = rev1+p.charAt(j);
						}
			 if (p.equals(rev1)) {
		            b = true;
		        }
	        return b;
		
	}
	public static void main(String[] args) {
	//1.program to reverse string//
		String name = "Sripriya";//index 0-7
		String rev = "";
	for (int i = name.length()-1;i>=0;i--)
	{
		rev = rev+name.charAt(i);
		
	}
	
	System.out.println(rev);
	
		// by using string buffer reverse method//
		StringBuffer Sb = new StringBuffer("Java");
		System.out.println("Stringbuffer reverse method results : "+Sb.reverse());
		
		// 2.String to concatenate to the end of another string//
		String s = "My Name Is";
		String s1 = " Sripriya";
		String s2 = s.concat( s1) ;
		System.out.println("________________________________________");
		System.out.println("Concate of 2 strings IS : "+s2);
		System.out.println("________________________________________");		
		
		
		//if(isPalindrome(p))
		String p = "madam";
			        System.out.println("Given string is a Polindrome: "+isPalindrome(p));
			        System.out.println("________________________________________");
	// progran to change name midname surname to surname name midname
//			        Scanner sc = new Scanner(System.in);
//			        System.out.println("Type the full name with middlename surname: ");
			        String fullname = "Sukumar Achary Bonala";
			                
			        int last_space_index = fullname.lastIndexOf(" ");
			        String surname = fullname.substring(last_space_index+1);
			        String Firstname = fullname.substring(0,last_space_index+1);
			        System.out.println(surname+" "+" "+Firstname);
			        System.out.println("________________________________________");
			        
			        //To findout duplicate char at given string//
			        
			        String st = "sripriyaaruru";
			        int length = st.length();
			        char ch[]= st.toCharArray();
			        for (int i = 0;i<length;i++)
			        {
			        	for (int j = i+1;j<length;j++)
			        	{
			        		if(ch[i]==ch[j])
			        		{
			        			System.out.println("Duplicate chars are: "+ch[j]);
			        			break;
			        		}
			        	}
			        }
			        
	}

	
}
