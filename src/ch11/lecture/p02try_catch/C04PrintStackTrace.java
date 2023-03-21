package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		
		// unchecked exception
		
		String a = "java";
		
		try { 
			System.out.println(a.charAt(4)); // unchecked exception			
		} catch (StringIndexOutOfBoundsException e ) {
			e.printStackTrace();
		} 
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
