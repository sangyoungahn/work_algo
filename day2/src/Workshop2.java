import java.util.Scanner;

public class Workshop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {	//테스트케이스만큼 반복
			int studentNum = sc.nextInt();	//학생수
			int submitNum = sc.nextInt();	//과제제출한 사람수
			
			int[] submit = new int[studentNum+1];	//submit:과제를 제출한 사람을 저장하는 배열
			for(int i = 0; i < submitNum; i++) {
				int idx = sc.nextInt();
				submit[idx] = 1;
			}
			System.out.print("#"+t + " ");
			for(int i = 1; i < submit.length; i++) {
				if(submit[i] == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			
		}
	}

}
