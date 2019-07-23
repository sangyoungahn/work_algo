
public class Solution1 {
	static int a = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		doSum(10,20,4,5,6,778);
		doSum(10,20);
		doSum(10);
//		aaa(10,20);
//		aaa(10);
	}
	static void doSum(int... a) {	//"int..."으로 받으면 배열이 된다.
		System.out.println(a.length);
//		int a, b, c, d;
//		a = 10;
//		b = 20;
//		a,b = b,a;
//		c, d = a, b;
	}
	
	static void doSum(int v, int... a) {	//하나는 무조건 들어오고 나머지가 배열이 된다.
		System.out.println(a.length);
		
		
//	static void aaa(int aa, int bb) {
//		System.out.println(a);
//		int a, b, c, d;
//		a = 10;
//		b = 20;
//		a,b = b,a;
//		c, d = a, b;
	}
//	static void aaa(int aa) {
//		System.out.println(a);
//		int a, b, c, d;
//		a = 10;
//		b = 20;
//		a,b = b,a;
//		c, d = a, b;
	}

}
