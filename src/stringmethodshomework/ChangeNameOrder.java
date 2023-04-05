package stringmethodshomework;

public class ChangeNameOrder {
	
	// program to change string name from name midname surname to surname name midname.
	
	static String  changename(String name,String midname,String surname )
	{
		String arr[]= {name,midname,surname};
				return arr[2]+" "+ arr[0]+" "+arr[1] ; 
	}
	
	
	public static void main(String[] args) {
		
	
		
			System.out.println(changename("Sukumar","Achary","Bonala"));

	}

}
