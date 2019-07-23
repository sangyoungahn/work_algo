

public class BitTest2 {

	public static void main(String[] args) {
		int a = 100;
		System.out.println(a);
		a=0x100;	//16진수 - 0xcafe라고 써도 에러 안남(16진수는 문자도 가능)
		System.out.println(a);
		a=0100;		//8진수 - 0900이면 에러남
		System.out.println(a);
		a=0b100;	//2진수
		System.out.println(a);
		
//		int a = 7;
//		00000111
//		00001000
//		00000100
		
		//자리수 검사
		System.out.println(a & 0b00000100);
		
		//3번째 자리 검사
		int n = 3;	//2개 이동하면 됨
		System.out.println(a & 1 <<(n-1));
	}

}
