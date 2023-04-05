package stringmethodshomework;

public class StringWithoutDuplicateChars {
	
//string without duplicates
	
	public static void main(String[] args) {
		
		 String s = "Sripriya";
		  int length = s.length();
	      StringBuilder sb = new  StringBuilder(); 
	       
	        for (int i = 0;i<length;i++)
	        	
	        {
	        	
	        		char ch = s.charAt(i);//s
	        		int idx = s.indexOf(ch, i+1);//s,0+1
	        		System.out.println(s.indexOf(ch, i+1)); //index of ch after 0+1 index 
	        		if (idx == -1 ) // -1 means character not available
	        		{
	        			sb.append(ch);
	        		}
	        	}
	        	System.out.println("String after removing  duplicate chars:"+sb);
	        }

	}


