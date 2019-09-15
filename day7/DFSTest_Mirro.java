
public class DFSTest_Mirro {
	static int min=999999999;
//	static boolean flag = true;
	static int[] dx =	{0,0,-1,1};
	static int [] dy = 	{-1,1, 0,0};
	
	static int[][] map;
	public static void main(String[] args) {
		map = new int[][]{  {0,0,1,1,1,1,1,1},
							{1,0,0,0,0,0,0,1},
							{1,1,1,0,1,1,1,1},
							{1,1,1,0,1,1,1,1},
							{1,0,0,0,0,0,0,1},
							{1,0,1,1,1,1,1,1},
							{1,0,0,0,0,0,0,0},
							{1,1,1,1,1,1,1,0}
			};
		boolean[][] visited = new boolean[map.length][map.length];	//방문했던 곳은 다시 못가도록 하는 것
//		flag = false;	//못 찾았다고 가정하자
		dfs(0,0,visited,0);	//dfs(시작 x위치,시작 y위치,방문여부,최소거리 저장)
		System.out.println(min == 999999999 ? "-1" : min);	//dfs를 다하고 마지막에 출력
	}
	
	
	static void dfs(int x, int y, boolean[][] visited, int cnt) {
		//종료, 실행, 자기호출
		
		//가장 최소 거리보다 많아지면 찾아도 소용 없으므로 끝냄
		if(cnt >= min) {
			return;
		}
		
		//종료
		if(x == map.length-1 && y == map.length-1) {
//			flag = true;
			if(min > cnt) {
				min = cnt;
			}
			return;
		}
		
		//실행
		int ty;
		int tx;
		for(int i=0; i<4; i++) {	//4방향이라서 4를 씀
			tx = x + dx[i];
			ty = y + dy[i];		//dy[i]가 -이기 떄문에 더해줘도 되는 것
			if(tx < 0 || tx >= map.length || ty < 0 || ty >= map.length) {
				continue;	//상만 안 움직여야 됨  ???????
			}
			//가지치기
			if(!visited[ty][tx] && map[ty][tx] == 0) {	//0이면 가고, 0이 아니면 못 감
				visited[ty][tx] = true;
				dfs(tx, ty, visited, cnt+1);	//재귀호출
				visited[ty][tx] = false;	//??????
			}
		}
	}
}
