import java.util.Scanner;

public class CheckHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t = 0; t < T; t++) {	//�׽�Ʈ ���̽���ŭ �ݺ�
			int studentNum = sc.nextInt();	//������ ��
			int submitNum = sc.nextInt();	//���������� ����� ��
			
			int[] submitArr = new int[studentNum+1];
			for(int i = 1; i < submitNum+1; i++) {	//���������� ����� �ִ� �迭
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
