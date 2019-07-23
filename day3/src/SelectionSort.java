import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {43, 23, 46, 75, 65, 34, 21};
		
		SelectionSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	static void SelectionSort(int[] arr, int size) {
		int temp;
		int min;
		
		for(int i=0; i<arr.length-1; i++) {
			min = i + 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;	//min의 위치에 비교되는 j의 위치를 넣어줌.
								//i와 비교하는 게 아니라 작은 값이 있던 곳과 비교하는 것(i를 돌면서 가장 작은 값을 찾아서 min에 넣어둠)
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
				}
			}
			
			if(min != i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	 }

}
