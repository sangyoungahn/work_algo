import java.util.Scanner;

public class Flatten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=0; t<10; t++) {			//10번의 테스트케이스만큼 반복
			int dumpNum = sc.nextInt();		//덤프 횟수
			int[] boxNum = new int[100];	//상자의 개수(가로 길이 배열)
			int result = 0;					//최고잡 높이 - 최저점 높이
			
			for(int b=0; b<boxNum.length; b++) {	//100개의 상자를 받아야 함
				boxNum[b] = sc.nextInt();
			}

			//상자를 오름차순으로 정렬
			for(int i = 0; i < boxNum.length; i++) {
				for(int j = i; j < boxNum.length; j++) {
					if(boxNum[i] > boxNum[j]) {
						int temp = boxNum[i];
						boxNum[i] = boxNum[j];
						boxNum[j] = temp;
					}
				}
			}

			//덤프수만큼 첫번째 배열에서 1을 더하고, 마지막 배열에서 1을 빼줌
			for(int d=0; d < dumpNum; d++) {
				boxNum[0]++;
				boxNum[99]--;

				//다시 정렬
				for(int i = 0; i < boxNum.length; i++) {
					for(int j = i; j < boxNum.length; j++) {
						if(boxNum[i] > boxNum[j]) {
							int temp = boxNum[i];
							boxNum[i] = boxNum[j];
							boxNum[j] = temp;
						}
					}
				}
			}
			
			//최대높이 - 최소높이 출력
			result = boxNum[99] - boxNum[0];
			System.out.println("#" + (t+1) + " " + result);
		}
	}
}
