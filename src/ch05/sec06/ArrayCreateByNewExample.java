package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		for(int i = 0; i< arr1.length; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + " ");
		}
		System.out.println();
		
		arr1[0] = 30; 
		arr1[1] = 40; 
		arr1[2] = 50; 

		for(int i = 0; i< arr1.length; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + " ");
		}
		System.out.println();
		System.out.println();
	
		double[] arr2 = new double[3];
		
		for(int i = 0; i< arr2.length; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + " ");
		}
		System.out.println();

		arr2[0] = 0.1;
		arr2[1] = 3.1;
		arr2[2] = 5.134;
		
		for(int i = 0; i< arr2.length; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		String[] arr3 = new String[3];
		for(int i = 0; i< arr3.length; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + " ");
		}
		System.out.println();

		arr3[0] = "jk";
		arr3[1] = "kim";
		arr3[2] = "woon";
		
		for(int i = 0; i< arr3.length; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		
		
	}

}
