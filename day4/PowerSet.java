/*
 * 파워셋 + 재귀(알고 있어야 됨)
 */

public class PowerSet {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		flags = new boolean[arr.length];
		doPowerSet(arr,0,arr.length);
		
		System.out.println("-----------------");
		
	}
	static boolean[] flags = null;		//static에서는  static만 접근 가능
	static void doPowerSet(int[] arr, int depth, int max) {
		if(depth == max) {
//			작업 수행, 출력
			printArr(arr);
			return;
		}
		flags[depth] = true;	//선택된 경우
		doPowerSet(arr, depth +1, max);
		flags[depth] = false;	//선택 안 된 경우
		doPowerSet(arr, depth +1, max);
	}
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(flags[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

}
