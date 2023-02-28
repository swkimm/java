package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution120843Test {

	@Test
	void test() {
		Solution120843 sol = new Solution120843();
//		assertEquals(3,sol.solution(new int[]{1,2,3,4},2));
		assertEquals(3,sol.solution(new int[] {1,2,3,4,5,6}, 5));
	
	}

}
