import java.util.Scanner;

public class CheckBracket {

	public static void main(String[] args) {
		SStack1 stack = new SStack1();	//스택 생성
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();	//문자열 받음
		
		char[] ch = new char[10];
		ch = sentence.toCharArray();	//문자열을 문자 하나하나로 나눠줌
		
		//문자열 차례로 조사
		for(int i=0; i<ch.length; i++) {
			//왼쪽 괄호를 만나면 스택에 삽입
			if(ch[i] == '(') {
				stack.push('(');
			}
			//오른쪽 괄호를 만나면 스택에서 top괄호 삭제, 오른쪽 괄호와 짝이 맞는지 검사
			else if(ch[i] == ')') {
				stack.pop();
			}
		}
		if(stack.size() != 0) {
			System.out.println("짝이 맞지 않습니다.");
		}
			
			
	}

}
