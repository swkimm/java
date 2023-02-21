package codetest.programmers;

public class Solution120891 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Solution s = new Solution();
//		int res = s.solution(369);
//		System.out.println(res);
	
	}

}

class Solution1 {
	public int solution(int order) {
		int clap = 0;

		do {
			int right = order % 10;

			if (right == 3 || right == 6 || right == 9) {
				clap++;
			}

//        	clap += switch(right) {
//        	case 3, 6, 9 -> 1;
//        	default -> 0;
//        	};

			order /= 10;

		} while (order != 0);

		return clap;

//        while (true) {
//            String str = Integer.toString(order);
//            if(str.indexOf("3")==1) {
//            	answer += 1;
//            } else if(str.indexOf("6") ==1) {
//            	answer += 1;
//            } else if(str.indexOf("9") == 1) {
//            	answer += 1;
//            }
//        }
	}
}