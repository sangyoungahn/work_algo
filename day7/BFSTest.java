import java.util.LinkedList;

public class BFSTest {

	public static void main(String[] args) {
		int[][] graph = new int[9+1][9+1];
		graph[1][2] = 1;
		graph[2][1] = 1;
		
		graph[3][1] = 1;
		graph[1][3] = 1;
		
		graph[4][1] = 1;
		graph[1][4] = 1;
		
		graph[2][5] = 1;
		graph[5][2] = 1;
		
		graph[2][6] = 1;
		graph[6][2] = 1;
		
		graph[4][7] = 1;
		graph[7][4] = 1;
		
		graph[4][8] = 1;
		graph[8][4] = 1;
		
		graph[4][9] = 1;
		graph[9][4] = 1;
		visited = new boolean[graph.length];
		bfs(graph, 1);
	}
	static char[] datas = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
	static boolean[] visited;
	static void bfs(int[][] graph, int start) {
		LinkedList<Integer> q = new LinkedList<>();
		q.offer(start);
		while(!q.isEmpty()) {
			int idx = q.poll();
			visited[idx] = true;
			System.out.println(datas[idx]);
			for(int i=1; i<graph.length; i++) {
				if(!visited[i] && graph[idx][i] == 1) {
					q.offer(i);
				}
			}
		}
	}
	
	
	//Wrapper class(boolean => Boolean, float => Float, char => Character)
	void aa() {
		int a =10;
		Integer i1 = a; //new Integer(a);	//Auto Boxing(기본형의 객체를 클래스로 만들어 내는 것)
		
		int b = i1; //i1.intValue();		//Auto UnBoxing(클래스 객체를 다시 기본형으로 바꿔주는 것)
		bb(i1);
	}
	
	void bb(Integer b) {	//기본형을 전달해도 에러 안남(Auto Boxing이 일어나므로)
		
	}
}
