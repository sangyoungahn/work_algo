import java.util.Scanner;

public class CheckHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {	//테스트 케이스만큼 반복
			int studentNum = sc.nextInt();	//수강생 수
			int submitNum = sc.nextInt();	//과제제출한 사람의 수
			
			int[] submitArr = new int[studentNum+1];
			for(int i = 1; i < submitNum+1; i++) {	//과제제출한 사람을 넣는 배열
				int idx = sc.nextInt();
				submitArr[idx] = 1;
			}
			
			System.out.print("#" + "t+1 ");
			for(int i = 0; i < submitNum; i++) {
				if(submitArr[i] == 0)
					System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
