package Project1;

public class Project1 {
	
	public static void main(String[] args) {
		
	String Result = reverse("HELLO"); 
		
	System.out.println(Result);
		
	}

	
	
	public static String reverse(String str) { 
		
		StringBuilder Reverse = new StringBuilder(str); 
		
		return Reverse.reverse().toString(); 
		
		
		
	}
	
	
}
