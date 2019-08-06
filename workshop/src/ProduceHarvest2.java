import java.util.Scanner;

public class ProduceHarvest2 {
	static int[] dx =	{0,0,-1,1};
	static int[] dy = 	{-1,1, 0,0};
	static int[][] farm = new int[49][49];	//농장 2차원 배열
	static int value = 0;	//농작물의 가치
	static int half ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//테스트케이스
		for(int t=0; t<T; t++) {
			int size = sc.nextInt();	//농장의 크기
			half = size/2;
			int x=0, y=0;
			
			
			//2차원 배열에 입력받음
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					farm[i][j]=sc.nextInt();
				}
			}
			bfs(half, half);
		}
	}
	
	static void bfs(int x, int y) {
		//종료
		if(x == farm.length-1 && y == farm.length-1) {
			return ;
		}
		
		//실행
		int tx = half;
		int ty = half;
		value = farm[tx][ty];	//초기값 저장
		
		for(int i=0; i<4; i++) {	//4방향이라서 4를 씀
			tx = x + dx[i];
			ty = y + dy[i];		//dy[i]가 -이기 떄문에 더해줘도 되는 것
			value += farm[tx][ty];	//4방향 탐색할떄마다 저장
			
			if(tx < 0 || tx >= farm.length || ty < 0 || ty >= farm.length) {
				return bfs(tx, ty);	//재귀호출
			}
		}
	}
}
