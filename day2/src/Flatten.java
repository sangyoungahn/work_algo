import java.util.Scanner;

public class Flatten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=0; t<10; t++) {			//10���� �׽�Ʈ���̽���ŭ �ݺ�
			int dumpNum = sc.nextInt();		//���� Ƚ��
			int[] boxNum = new int[100];	//������ ����(���� ���� �迭)
			int result = 0;					//�ְ��� ���� - ������ ����
			
			for(int b=0; b<boxNum.length; b++) {	//100���� ���ڸ� �޾ƾ� ��
				boxNum[b] = sc.nextInt();
			}

			//���ڸ� ������������ ����
			for(int i = 0; i < boxNum.length; i++) {
				for(int j = i; j < boxNum.length; j++) {
					if(boxNum[i] > boxNum[j]) {
						int temp = boxNum[i];
						boxNum[i] = boxNum[j];
						boxNum[j] = temp;
					}
				}
			}

			//��������ŭ ù��° �迭���� 1�� ���ϰ�, ������ �迭���� 1�� ����
			for(int d=0; d < dumpNum; d++) {
				boxNum[0]++;
				boxNum[99]--;

				//�ٽ� ����
				for(int i = 0; i < boxNum.length; i++) {
					for(int j = i; j < boxNum.length; j++) {
						if(boxNum[i] > boxNum[j]) {
							int temp = boxNum[i];
							boxNum[i] = boxNum[j];
							boxNum[j] = temp;
						}
					}
				}
			}
			
			//�ִ���� - �ּҳ��� ���
			result = boxNum[99] - boxNum[0];
			System.out.println("#" + (t+1) + " " + result);
		}
	}
}