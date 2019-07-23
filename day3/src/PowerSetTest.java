
public class PowerSetTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
//		methoda(arr);	//가변처리가 가능한 함수
		methodb(arr);	//정적으로 사용할 수 있는 방법(3개 일때는 사용 불가)
	}
	
	static void methodb(int[] arr) {
		int size = 1 << arr.length;
		for(int i = 0; i<size; i++) {	//왜 15까지 가는건지?
			for(int j = 0; j < arr.length; j++) {
				if( (i & (1<<j)) != 0) {	//i숫자가
					System.out.print(arr[j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	static void methoda(int[] arr) {
		boolean flags[] = new boolean[arr.length];
		for(int i = 0; i < 2; i++) {
			flags[0] = i%2 == 0 ? false:true;
			for(int j=0; j<2; j++) {
				flags[1] = j%2 == 0 ? false:true; {
					for(int k=0; k<2; k++) {
						flags[2] = k%2 == 0 ? false:true; {
							for(int l=0; l<2; l++) {
								flags[3] = l%2 == 0 ? false:true;
								printArray(flags, arr);
							}
						}
					}
				}
				
			}
			
		}
	}
	
	static void printArray(boolean flags[], int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(flags[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

}
