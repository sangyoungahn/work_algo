import java.util.Scanner;
/*
 * algorithm 과제
 */

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = {1,2,3,7,9,12,21,23,27};
		int searchValue = sc.nextInt();		//찾고자 하는 값 입력 받기
		
		int low = 0;	//배열의 가장 작은 값의 인덱스
		int high = arr.length - 1;	//배열의 가장 큰 값의 인덱스

		int result = binarySearch(arr, low, high, searchValue);
		
		if(result == -1)
			System.out.println("값이 존재하지 않음");
		else
			System.out.println((result+1) + "번째 수");
	}

	private static int binarySearch(int[] arr, int low, int high, int searchValue) {
		int mid = arr.length/2;		//중간 인덱스 찾기
		
		if(low > high)
			return -1;
		
		if(arr[mid] == searchValue)		//배열의 중간값이 찾고자 하는 값일 경우 해당 위치 반환
			return mid;
		else if(searchValue < arr[mid])		//찾고자 하는 값이 배열의 중간값보다 작을 경우 : 처음부터 중간 앞까지의 인덱스를 다시 탐색
			return binarySearch(arr, low, mid-1, searchValue);
		else		//찾고자 하는 값이 배열의 중간값보다 클 경우 : 중간 뒤부터 마지막 인덱스를 다시 탐색
			return binarySearch(arr, mid+1, high, searchValue);
	}
}
