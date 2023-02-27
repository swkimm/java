package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExampleArrayscopyOf {
	public static void main(String[] args) {
		
	String[] oldStrArray = { "java", "react", "vue" };
	String[] newStrArray = Arrays.copyOf(oldStrArray, 5);
	
	System.out.println(Arrays.toString(newStrArray));
	
	for(String n : newStrArray) {
		System.out.print(n + ", ");
	}
	
	
	
	
	}
	
}
