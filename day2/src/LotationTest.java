import java.util.Arrays;

public class LotationTest {

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		lotate(arr);
//		System.out.println(Arrays.toString(arr));
		
		int[][] arr = new int[4][4];
		int[][] brr = new int[4][4];
		
		int cnt = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = ++cnt;
			}
		}
		
//		90도 회전한 것처럼 arr배열의 값을 brr 배열에 넣어라
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				brr[j][3-i] = arr[i][j];
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(brr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static void lotate(int[] arr) {
		int temp;
		
		temp = arr[0];
		
//		arr[0] = arr[1];
//		arr[1] = arr[2];
//		arr[2] = arr[3];
//		arr[3] = arr[4];
//		arr[4] = arr[5];
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		
//		arr[5] = temp;
		arr[arr.length-1] = temp;
		
	}
}