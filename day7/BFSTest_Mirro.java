import java.util.LinkedList;
import java.util.Queue;

public class BFSTest_Mirro {
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
		bfs(0,0,visited,0);
		System.out.println(flag?"1":"-1");
		System.out.println(min == 999999999 ? "-1":min);
	}
	static int min=999999999;
	static boolean flag = false;
	static int[] dx =	{0,0,-1,1};
	static int [] dy = 	{-1,1, 0,0};
	static class Point {
		int x;
		int y;
		int cnt;	//값을 계속 사용해야 된다고 하면 멤버변수에 넣으면 됨
		Point(int x, int y, int cnt) {	//값을 편하게 넣기 위해 생성자 만들어줌
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	static void bfs(int x, int y, boolean[][] visited, int cnt) {
//		큐 활용
		Point p = new Point(x, y, 0);
		
		Queue<Point> q = new LinkedList<>();	//계속적으로 접근할 것을 큐에 넣는다
		q.offer(p);
		while(!q.isEmpty()) {
			Point tp = q.poll();
//			종료기준
			if(tp.x == map.length-1 && tp.y == map.length-1) {
				System.out.println("도착" + tp.cnt);
				if(min > tp.cnt) {
					min = tp.cnt;
				}
//				flag = true;	//여기왔다는 것은 도착한 적이 있다는 것
				continue;
			}
			visited[tp.y][tp.x] = true;
			
//			4방향 탐색
			int tx, ty;
			for(int i=0; i<4; i++) {
				tx = tp.x + dx[i];
				ty = tp.y + dy[i];
				
				//맵을 벗어나면 빼주면 됨
				if(tx <0 || tx >= map.length || ty < 0 || ty >= map.length) {
					continue;
				}
				
				//방문된적이 없고, 이동한 자리가 0이면 가기
				if(visited[ty][tx] && map[tx][ty] == 0) {
					Point tp1 = new Point(tx, ty, tp.cnt+1);		//지금 해야될 일을 집어넣는것
					q.offer(tp1);
//					visited[ty][tx] = true;
				}
				
			}
		}
		
	}
	
}
