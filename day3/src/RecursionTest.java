
public class RecursionTest {

	public static void main(String[] args) {
//		1부터 10까지의 숫자를 차례로 출력하라
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		printNum(1);
		//1부터 10까지의 합을 구하여 출력하라
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		doSum(10);
		System.out.println(sum);
		
		doSum1(100);	//??
		System.out.println(sum1);
		
//		1부터 n까지의 곱의 결과를 구하여라
//		5 => 5 * 4 * 3 * 2 * 1(5!)
		int result = 1;
//		for(int i=5; i>=1; i--) {
//			result *= i;
		
		result = factory(5);
		System.out.println(result);
//		1! = 1, 0! = 1
		
//		숫자의 각 자릿수의 합을 구하여 출력하라
		int num = 12346;
		result = 0;
//		int nam;
//		while(num > 10) {	//기저대역
//			nam = num % 10;	//해야될 일
//			result += nam;
//			num /= 10;
//		}
		result = digitSum(123456788,0);
		System.out.println(result);		//15
		
//		피보나치 수열
//		1, 1, 2, 3, 5, 8, 13, 21, 34 ~~~~~~~
//		8번째 수는?
		result = fibo(45);
		System.out.println(result);
		
//		자릿수를 입력받아서 모든 가능한 이진수 문자열을 출력하라(재귀로)
//		3 
//		000 001 010 011 100 101 110 111
		doMakeBinary(3, "");	//for문 3번 쓴것과 같은 효과
	}
	
	static void doMakeBinary(int size, String result) {		//??
		if(size == 0) {
			System.out.println(result);
			return;
		}
		size--;
		doMakeBinary(size, result + "0");
		doMakeBinary(size, result + "1");
		
		
	}
	
	static int fibo(int num) {
		if(num == 1) {
			return 1;
		}
		if(num == 2) {
			return 1;
		}
		int sum = fibo(num - 1) + fibo(num - 2) % 987654321;	//넘어가지 않는 큰 양의 정수를 구하기 위해 %연산해줌
		return sum;
	}
	
	static int digitSum(int num, int sum) {	//sum - 중간값을 출력하기 위한 변수
		//10보다 작으면 그대로 숫자를 리턴(종료조건)
		if(num < 1) {	//???
			return sum;
		}
		
		//해야할일
		int nam = num % 10;
		int mok = num / 10;
		sum += nam;
//		digitSum(mok, sum);
//		return digitSum(mok, sum);
		
		return nam + digitSum(mok, sum);
	}
		
	static int factory(int n) {
//		종료 조건
		if(n == 0 || n == 1)	return 1;
		if(n < 0) return -1;
		if(n <= 0) {
			return 1;
		}
		int result = n * factory(n-1);
//		한번에 한번씩 실행할 내용
//		같은 이름의 메소드 재호출
		return 1;
	}
	
	static void doSum1(int a) {
		if(a <= 0) {
			return;
		}
		sum1 += a;
		doSum1(a-1);
		
	}
	
	static int sum1 = 0;
	static int doSum(int a) {
		if(a <= 0) {
			return 0;
		}
		
		return a + doSum(a-1);
	}
	
	static void printNum(int num) {
//		기저대역(base case) - 메소드가 완료될 수 있는 범위를 정해줘야 됨
		if(num > 10) {
			return;
		}
		System.out.println(num);
		
		printNum(num + 1);		//자기가 자기 자신 호출 - 재귀
	}

}
