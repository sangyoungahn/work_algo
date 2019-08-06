import java.util.LinkedList;
import java.util.Scanner;

public class swea1230 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int t=0; t<10; t++)	{
			int originCipherLeng = sc.nextInt();	//원본 암호문 길이

			LinkedList<Integer> originCipher = new LinkedList<Integer>();	//원본암호문들을 저장할 배열
			for(int i=0; i<originCipherLeng; i++) {
				originCipher.add(sc.nextInt());		//원본암호문 배열에 값들을 하나씩 저장
			}

			int commandNum = sc.nextInt();	//명령어의 개수
			for(int j=0; j<commandNum; j++) {	//명령어 개수를 반복하면서 x위치, y개 숫자, s덧붙일 숫자를 입력 받음
				char ch = sc.next().charAt(0); //'I', 'D', 'A'
				int x,y;
				int z;

				switch(ch) {
				case 'I' :
					x=sc.nextInt();	//x위치
					y=sc.nextInt();	//y개의 숫자 삽입
					int attach[]=new int[y];	//덧붙일 숫자를 받아올 배열
					for(z=0;z<y;z++) {
						attach[z]=sc.nextInt();
						originCipher.add(x, attach[z]);
						x++;
					}
					break;
				case 'D' :
					x=sc.nextInt();	//x위치
					y=sc.nextInt();	//y개의 숫자 삭제
					for(z=0;z<y;z++) {
						originCipher.remove(x);
					}
					break;
				case 'A' :
					y=sc.nextInt();	//y개의 숫자 추가
					int add[]=new int[y];	//추가할 숫자를 받아올 배열
					for(z=0;z<y;z++) {
						add[z]=sc.nextInt();
						originCipher.add(add[z]);
					}
					break;
				}

			}
			System.out.print("#" + (t+1));
			for(int s=0; s<10; s++) {
				System.out.print(" " + originCipher.get(s));
			}
			System.out.println();
		}
	}

}
