package ch04.lecture.p01if;

public class C04Random {

	public static void main(String[] args) {
		// Math.random()
		// 0 <= Math.random() < 1 의 double 값 리턴
		
		// ex> 0, 1, 2,
		int res1 = (int)(Math.random() * 3); 
		System.out.println(res1);
		
		// ex> 1, 2, 3
		int res2 = (int)(Math.random() * 3 + 1); 
		System.out.println(res2);
		
		// ex> 주사위 (1,2,3,4,5,6)
		int res3 = (int)(Math.random() * 6 + 1);
		System.out.println(res3);
		
		// 로또번호 
		for(int i = 1; i < 7; i++ ) {
			int res4 = (int)(Math.random() * 45 + 1);
			System.out.println(i + "번" + res4);
		}
		
	}

}
