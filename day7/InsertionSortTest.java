import java.util.Arrays;

public class InsertionSortTest {

	public static void main(String[] args) {
		int[] arr = {4,2,9,6,7,8,5,4};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void insertionSort(int[] arr) {
		int num=0;
		int j = 0;
		for(int i=1; i<arr.length; i++) {
			num = arr[i];
			int idx;
			for(j=i-1; j>=0; j--) {
				if(num >= arr[j]) {
					break;
				}
				arr[j+1] = arr[j];
			}
			arr[j+1] = num;
		}
	}

}
