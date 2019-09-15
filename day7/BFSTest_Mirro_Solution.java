import java.util.LinkedList;
import java.util.Queue;

public class MirroBFS1 {
	static int[][] map;
	public static void main(String[] args) {
		map = new int[][]{  
			{0,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,0,1,1,1,1},
			{1,1,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,0}
		};
		boolean[][] visited = new boolean[map.length][map.length];
		bfs(0,0, visited, 0);
		//		System.out.println(flag?"1":"-1");
		System.out.println(min ==99999999 ?"-1":min);
	}
	static int min = 99999999;
	static boolean flag = false;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static class Point{
		int x;
		int y;
		int cnt;
		Point(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	static void bfs(int x, int y,boolean[][] visited, int cnt) {
		//		큐 활용
		Point p = new Point(x, y, 0);

		Queue<Point> q = new LinkedList<>();
		q.offer(p);
		while( !q.isEmpty() ) {
			Point tp = q.poll();
			visited[tp.y][tp.x] = true;
			//			종료기준
			if(tp.x == map.length -1 && tp.y == map.length-1){
				System.out.println("도착" + tp.cnt);
				if(min > tp.cnt) {
					min = tp.cnt;
				}
				//				flag = true;
				continue;
			}

			int tx, ty;
			for(int i = 0;i < 4; i++) {
				tx = tp.x + dx[i];
				ty = tp.y + dy[i];
				if(tx < 0 || tx >= map.length || ty < 0 || ty >= map.length) {
					continue;
				}
				if(!visited[ty][tx] && map[ty][tx] == 0) {
					//					visited[ty][tx] = true;
					Point tp1 = new Point(tx, ty, tp.cnt + 1);
					q.offer(tp1);

				}

			}
		}



	}

}
















