import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,1,1,2,1,0,4};
		
		final int K = 4;
		int[] counting = new int[K+1]; 
		int[] brr = new int[arr.length]; 
		countingSort(arr,brr,counting,K); 
		System.out.println(Arrays.toString(brr)); 
	} 

	static void countingSort(int arr[], int[] brr, int[] counting, int K) { 
		for(int i = 0;i<arr.length;i++) { 
			int idx = arr[i]; 
			counting[idx]++; 
		} 
		for(int i =1;i<counting.length;i++) { 
			counting[i] += counting[i-1]; 
		} 
		for(int i = 0;i<arr.length;i++) { 
			int idx = arr[i];
			int idx1 = counting[idx]; 
			brr[idx1-1] = arr[i]; 
			counting[idx]--; 
		} 
	} 
}
