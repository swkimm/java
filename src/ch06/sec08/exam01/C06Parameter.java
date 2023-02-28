package ch06.sec08.exam01;

public class C06Parameter {
	public static void main(String[] args) {
		
	// 자동형변환 
	int a = 3;
	long b = a;
	double c = b;
	char d = 'a';
	int e = d;
	
	
	MyClass06 mc = new MyClass06();
	mc.method1(33);
	mc.method1('c');
	
	mc.method2(12314334254630L);
	mc.method2(33);
	mc.method2('c');
	
	mc.method4(3.14f);
	mc.method4(298342L);
	mc.method4(99);
//	mc.method4(3.14);
	
	
	
	}
}
