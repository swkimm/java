package codetest.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzArray3Test {

	@Test
	void fizzArray3test() {
		Array2 o1 = new Array2 ();
		int[] res1 = o1.fizzArray3(5, 10);
		
		assertArrayEquals(new int[] {5,6,7,8,9}, res1);
		
	
	}

}
