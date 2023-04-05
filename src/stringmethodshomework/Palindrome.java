package stringmethodshomework;

public class Palindrome {

	static boolean ispalindrome(String name)
	{
		String rev = "";
		boolean b = false;
		 for (int i = name.length()-1;i>=0;i--)
			{
				rev = rev+name.charAt(i);
						}
			 if (name.equals(rev)) {
		            b = true;
		        }
	        return b;
	}
	
	public static void main(String[] args) {
	
		System.out.println("Given string is palindrome: "+ispalindrome("madam"));
	}

}
