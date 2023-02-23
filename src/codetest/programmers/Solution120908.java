package codetest.programmers;
//문제 설명
//문자열 str1, str2가 매개변수로 주어집니다. 
//str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

class Solution908 {
	public int solution(String str1, String str2) {
		int answer = str1.indexOf(str2);
		if (answer == -1) {
			answer = 2;
		} else {
			answer = 1;
		}
		return answer;
	}
}

public class Solution120908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
