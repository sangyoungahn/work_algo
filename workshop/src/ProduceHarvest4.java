import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//내가 짠 코드

class Data{
	int Y;
	int X;
	public Data(int Y, int X) {
		this.Y = Y;
		this.X = X;
	}
}

public class ProduceHarvest4{
	static int[] dx =	{0,0,-1,1};
	static int[] dy = 	{-1,1, 0,0};
	static int size;		//농장의 크기
	static int value;		//농작물의 가치
	static char[][] farm;	//농장 2차원 배열
	static int half;		//중간 인덱스값 찾는 변수
	static boolean[][] visited;	//방문여부 확인
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//테스트케이스
		for(int t=0; t<T; t++) {
			value = 0;	//value값 초기화!!
			size = sc.nextInt();	//가로, 세로 길이 입력
			half = size/2;
			farm = new char[size][size];
			visited = new boolean[size][size];
			
			//2차원 배열에 입력받음
			for(int i=0; i<size; i++) {
				farm[i]=sc.next().toCharArray();
			}
			
			System.out.print("#" + (t+1) + " ");
			bfs(farm, half);

//			for(int i=0;i<visited.length;i++) {
//				for(int j=0;j<visited.length;j++) {
//					System.out.print(visited[i][j] + " ");
//				}
//				System.out.println();
//			}

		}
	}
	
	static void bfs(char[][] farm2, int half) {
		Queue<Data> q = new LinkedList<Data>();		//데이터를 넣을 큐 생성
		q.add(new Data(half, half));
		visited[half][half] = true;		//이걸 안하면 처음에 중앙값을 못 더함
		
		outer:while(!q.isEmpty()) {
			Data initData = q.poll();
			
			for(int i=0; i<4; i++) {	//4방향이라서 4를 씀
				int ty = initData.Y + dy[i];		//dy[i]가 -이기 떄문에 더해줘도 되는 것
				int tx = initData.X + dx[i];
				
				//범위를 벗어나면 반복문을 나감
				if(tx < 0 || tx >= farm2.length || ty < 0 || ty >= farm2.length) {
					break outer;
				}
				
				//방문을 한 곳은  체크
				else if(!visited[ty][tx]) {	//0이면 가고, 0이 아니면 못 감
					q.add(new Data(ty, tx));
					visited[ty][tx] = true;
				}
			}
		}
		for(int i=0; i<farm2.length; i++) {
			for(int j=0; j<farm2.length; j++) {
				//visited가 ture인 걸 다 더하기
				if(visited[i][j] == true) {
					value += farm2[i][j] - '0';
				}
			}
		}
		System.out.println(value);
		
	}
}

