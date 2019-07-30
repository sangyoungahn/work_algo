
public class NQueenTest {

	public static void main(String[] args) {
		int n = 4;
		int[] arr = new int[n];
		backtracking(arr, 0);	//0,1,2,3(첨자값을 사용)
	}
	static int cnt = 0;
	static boolean sw = true;
	static void backtracking(int[] arr, int depth) {
//		boolean flag = true;
		if(depth == arr.length) {
//			flag = check(arr);
//			if(flag) {
				for(int i =0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println(", " + cnt++);
				sw = false;
//			}
			//			System.out.println(++cnt + " flag " + flag);
			return;
		}
		for(int i=0; i<arr.length; i++) {
			arr[depth] = i;		//0,1,2,3 다 해볼 수 있음(depth = 0)
			if(sw && isPromising(arr, depth)) {	//0부터 
				backtracking(arr, depth+1);
			}
		}
	}
	static boolean isPromising(int[] arr, int depth) {
		boolean flag = true;
		cnt++;
		for(int i=0; i<depth; i++) {	//수평, 수직, 대각에 있는지 없는지 검사하기 위해 이중 for문 사용
			if(arr[i] == arr[depth]) {
				flag = false;
				break;
			}
			if((arr[depth] - arr[i]) == (depth-i)) {	//으론쪽 아래로 향하는 것 있는지 확인
				flag = false;
				break;
			}
			if((arr[i] - arr[depth]) == (depth-i)) {	//오른쪾 위로 향하는 것 있는지 확인
				flag = false;
				break;
			}
		}
		return flag;
	}

	static boolean check(int[] arr) {
		boolean flag = true;
		outer : for(int i=0; i<arr.length-1; i++) {	//수평, 수직, 대각에 있는지 없는지 검사하기 위해 이중 for문 사용
			for(int j=0; j<arr.length; j++) {	//같은 열에 있는지 확인
				if(arr[i] == arr[j]) {
					flag = false;
					break outer;
				}
				if((arr[j] - arr[i]) == (j-i)) {	//으론쪽 아래로 향하는 것 있는지 확인
					flag = false;
					break outer;
				}
				if((arr[i] - arr[j]) == (j-i)) {	//오른쪾 위로 향하는 것 있는지 확인
					flag = false;
					break outer;
				}
			}
		}
		return flag;
	}
}
