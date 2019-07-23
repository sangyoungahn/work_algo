
public class Array2Test {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++ ) {
				arr[i][j] = ++cnt;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
