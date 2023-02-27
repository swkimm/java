package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {

		String[] oldStrArray = { "java", "react", "vue" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String n : newStrArray) {
			System.out.print(n + ", ");
		}

	}
}
