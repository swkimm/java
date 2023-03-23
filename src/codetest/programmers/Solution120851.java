package codetest.programmers;

class Solution0851 {
	public int solution(String my_string) {
		int answer = 0;
		String str = my_string.toLowerCase();
		String str2 = "";
		
		for (int i =0; i< str.length(); i++) {
			str2 += str.charAt(i);
		}
		
		String[] result = str2.split("");
		
		for (String sum : result) {
			if(sum.matches("^[0-9]*$"))
			answer += Integer.parseInt(sum);
		}
		return answer;
	}
}

public class Solution120851 {
	public static void main(String[] args) {

		Solution0851 sol = new Solution0851();
		int result = sol.solution("aAb1B2cC34oOp");
		System.out.println(result);
	}
}
