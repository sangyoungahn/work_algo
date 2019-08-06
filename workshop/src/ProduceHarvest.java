import java.util.Scanner;

public class ProduceHarvest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//테스트케이스
		for(int t=0; t<T; t++) {
			int size = sc.nextInt();	//농장의 크기
			int[][] farm = new int[size][size];	//농장 2차원 배열
			int half = size/2;
			int value = 0;	//농작물의 가치
			
			//2차원 배열에 입력받음
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					farm[i][j]=sc.nextInt();
				}
			}
			for(int k=0; k<size; k++) {	//모든 행을 차례로 탐색
				for(int c=1; c<=size; c++) {
					if( (c%2) == 1 ) {
						value += farm[k][half];
					}
				}
			}
			
		}
	}

}
