package codetest.programmers;

class Solution854 {

	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}
}

public class Solution120854 {

	public static void main(String[] args) {

		Solution854 sol = new Solution854();
		String[] arr = { "We", "are", "the", "world!" };
//		System.out.println(arr.length);
		System.out.println(arr[1].length());
		String a1 = arr[1];
		System.out.println(a1.length());

//		System.out.println(sol.solution(arr));
	}

}
