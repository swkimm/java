package codetest.programmers;

class Solution839 {
	public String solution(String rsp) {
		String answer = "";
		char[] ch = rsp.toCharArray();

		for (int i = 0; i < rsp.length(); i++) {
			switch (ch[i]) {
			case '2':
				answer += "0";
				break;
			case '0':
				answer += "5";
				break;
			case '5':
				answer += "2";
				break;
//			default :
//				break;
			}
		}
		return answer;
	}
}

public class Solution120839 {

	public static void main(String[] args) {
		
		Solution839 s = new Solution839();
		System.out.println(s.solution("205"));
	}

}
