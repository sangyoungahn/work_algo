import java.util.Scanner;

public class Workshop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int studentNum = 1000;
		int[] arr = new int[1000];	//학생수 배열
		
		for(int i = 0; i < T; i++) {	// 테스트케이스만큼 반복
			int num = sc.nextInt();
			for(int j = 0; j < 1000; j++) {		// 학생수만큼 반복
				int score = sc.nextInt();
				arr[j] = score;
			}
			int[] counting = new int[100+1];	//점수 배열
			int answer = countingSort(arr, counting, studentNum);
			
			System.out.print("#" + (num)+" ");
			System.out.println(answer);
		}
		
	}
	
	static int countingSort(int[] arr, int[] counting, int K) {
		int maxCount = 0;
		int maxScore = 0; //점수
		
		for(int i = 0; i < arr.length; i++) {
			int idx = arr[i];	// 데이터가 첨자로 사용
			counting[idx]++;
		}
		
		for(int i = 0; i <= 100; i++) {
			if(counting[i] >= maxCount) {
				maxCount = counting[i];	//i는 점수, counting[i]는 횟수
				maxScore = i;	//점수
			}
		}
		
		return maxScore;
		
	}

}
