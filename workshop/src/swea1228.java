import java.util.ArrayList;
import java.util.Scanner;

public class swea1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=0; t<10; t++)	{
			int originCipherLeng = sc.nextInt();	//원본 암호문 길이
			int processedCipher = 0;	//처리한 암호문을 저장할 변수
			
			ArrayList<Integer> originCipher = new ArrayList<Integer>();	//원본암호문들을 저장할 배열
			for(int i=0; i<originCipherLeng; i++) {
				originCipher.add(sc.nextInt());		//원본암호문 배열에 값들을 하나씩 저장
			}
			
			int commandNum = sc.nextInt();	//명령어의 개수
			for(int j=0; j<commandNum; j++) {	//명령어 개수를 반복하면서 x위치, y개 숫자, s덧붙일 숫자를 입력 받음
				sc.next(); //'I'
				int x=sc.nextInt();	//x위치
				int y=sc.nextInt();	//y숫자
				int s[]=new int[y];	//덧붙일 숫자를 받아올 배열
				for(int z=0;z<y;z++) {
					s[z]=sc.nextInt();
					originCipher.add(x, s[z]);
					x++;
				}
			}
			System.out.print("#" + (t+1));
			for(int s=0; s<10; s++) {
				System.out.print(" " + originCipher.get(s) + " ");
			}
			System.out.println();
		}
	}

}
