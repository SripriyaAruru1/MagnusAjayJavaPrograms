package stringmethodshomework;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Sripriya Aruru";
		int length = name.length();
		String rev = "";
		
		for (int i = length-1;i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}

		System.out.println("Reverse String is : "+rev);
	}

}
