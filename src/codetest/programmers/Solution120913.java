package codetest.programmers;

//문제 설명
//문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

// 선생님 진행 
//public class Solution120913 {
//	public String[] solution(String my_str, int n) {
//		int len = my_str.length();
//
//		int answerLength = (len - 1) / n + 1;
//
//		String[] answer = new String[answerLength];
//
//		int start = 0;
//		int end = n;
//
//		int i = 0;
//		while (start < len) {
//			if (end > len) {
//				end = len;
//			}
//
//			// 부분문자열 잘라서
//			String sub = my_str.substring(start, end);
//
//			// 배열에 넣고
//			answer[i++] = sub;
//
//			// start, end 변경
//			start += n;
//			end += n;
//
//		}
//
//		return answer;
//	}
//}

class Solution913 {
	public String[] solution(String my_str, int n) {
		int len = my_str.length();
		int end = n;
		int cnt = 0;
		int answerArrayLen = (len - 1) / n + 1;
		String[] answer = new String[answerArrayLen];

		for (int i = 0; i < len; i++) {
			if (len < end) {
				end = len;
			} else {
				answer[i] = my_str.substring(cnt, end);
				cnt += n;
				end += n;
			}
			
		}
		return answer;
	}
}

public class Solution120913 {

	public static void main(String[] args) {
		Solution913 sol = new Solution913();
		String str = "abc1Addfggg4556b";
		System.out.println(sol.solution(str, 6));
		str.substring(12, 6);
	}

}
