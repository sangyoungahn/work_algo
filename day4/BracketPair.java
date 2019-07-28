import java.util.Scanner;
import java.util.Stack;

public class BracketPair {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();	//문자를 다루는 스택 라이브러리 사용
		Scanner sc = new Scanner(System.in);
		
		for(int t=0; t<10; t++) {	//테스트케이스만큼 반복
			int bracketLength = sc.nextInt();	//괄호의 개수를 입력받음
			String bracket = sc.next();		//괄호를 입력 받음
			char[] bracketArr = bracket.toCharArray();	//여러개의 괄호들을 하나의 문자 배열에 각각 넣음
			int check = 1;	//유효성 여부 확인
			
			for(int i=0; i<bracketLength; i++) {	//괄호의 개수만큼 반복
				if(bracketArr[i]=='(' || bracketArr[i]=='{' || bracketArr[i]=='[' || bracketArr[i]=='<') {
					stack.push(bracketArr[i]);
				}
				else {
					if(bracketArr[i]==')' && stack.pop()=='(' )
						continue;
					else if(bracketArr[i]==']' && stack.pop()=='[')
						continue;
					else if(bracketArr[i]=='}' && stack.pop()=='{')
						continue;
					else if(bracketArr[i]=='>' && stack.pop()=='<')
						continue;
					else {
						check = 0;
						break;
					}
				}
			}
			
			System.out.println("#" + (t+1) + " " + check);
		}
	}

}
