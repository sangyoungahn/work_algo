
public class MemoizationTest {

	public static void main(String[] args) {
//		피보나치 수열에서 45번째 수를 구하여라
		System.out.println("start");
		int su = 45;
		fibos = new int[su + 1];	//배열 첨자와 맞추기 위해 "+1" 해줌
//		배열의 초기값 fibos 0으로 기본값 채워있다
		fibos[1] = 1;
		fibos[2] = 1;
		int num = fibo1(su);
		System.out.println(num);
		System.out.println("end");
	}
	static int[] fibos = null;
	
	static int fibo1(int num) {
		if(num == 1 || num == 2) {
			return fibos[num];
		}
		if(fibos[num] == 0) {	//한번도 채워진 적이 없으면
			fibos[num] = fibo1(num-1) + fibo1(num-2);
		}
		return fibos[num];
		
//		if(fibos[num] == 0) {	//한번도 채워진 적이 없으면
//			fibos[num] = fibo1(num-1) + fibo1(num-2);
//		}
//		
//		return fibos[num];
	}

}
