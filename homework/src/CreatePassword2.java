import java.util.LinkedList;
import java.util.Scanner;

public class CreatePassword2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int num=0;

		
		for(int t=0; t<10; t++) {
			int inputTestCase = sc.nextInt();

			//8개의 숫자를 LinkedList에 넣음
			for(int i=0;i<8;i++) {
				num = sc.nextInt(); 
				list.add(num);	//맨 뒤에 삽입
			}

			outer:while(true) {
				for(int j=0; j<5; j++) {
					int inputData = list.poll() - j;	//list의 맨 앞에 있는 것을 꺼내와서 하나씩 증가하는 인덱스 값을 뺌

					if(inputData<=0) {	//뺀 값이 0이거나 0보다 작다면 종료
						break outer;
					}
					else {
						list.add(inputData);	//0이 아닐 경우 LinkedList의 맨 끝에 삽입
					}
				}
			}

			System.out.print("#"+ (t+1) + " ");
			
			//LinkedList가 비어있을때까지 순서대로 꺼내서 출력
			while(!list.isEmpty())
				System.out.print(list.poll() + " ");
			System.out.println();
		}
	}
}
