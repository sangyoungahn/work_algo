import java.util.Scanner;
import java.util.Stack;

public class StackCalc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int t=0; t<10; t++) {		//테스트케이스만큼 반복
			int num = sc.nextInt();		//문자열의 길이 입력
			String str = sc.next();		//문자열 입력

			String postOrder = doPostOrder(str);	//중위 표기식을 후위 표기식으로 변경
			int calcValue = doCalc(postOrder);		//후위 표기식을 계산
			System.out.println("#" + (t+1) + " " + calcValue);
		}
	}

	static int doCalc(String s) {
		char[] srr = s.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int num1, num2, result = 0;
		
		for(char ch : srr) {
			if(ch >= '0' && ch <= '9') {
				stack.push(new Integer(ch+""));	//ch-'0'
			} else {
				num2 = stack.pop();		//처음 pop한 피연산자가 뒤에 옴
				num1 = stack.pop();
				result = calc(ch, num1, num2);
				stack.push(result);
			}
		}
		return result;
	}

	static int calc(char ch, int num1, int num2) {
		int result = 0;
		
		switch(ch) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		return result;
	}

	static String doPostOrder(String s) {
		String result = "";
		char[] srr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		char temp;	//pop을 하고 임시로 저장하는 변수(pop연산이 중복될 수도 있음르ㅗ)
		
		for(char ch : srr) {
			if(ch == '(') {
				stack.push(ch);
			}else if(ch >= '0' && ch <= '9') {
				result += ch;
			}else if(ch == ')') {
				while(!stack.isEmpty() && ((temp = stack.pop()) != '(')) {
					result += temp;
				}
			} else {
				//stack이 비어있지 않고, 현재 우선순위가 stack의 우선순위보다 높으면
				while(!stack.isEmpty() && getPrioirty(ch) <= getPrioirty(stack.peek())) {
					result += stack.pop();
				}
				stack.push(ch);
			}
		}

		return result;
	}
	
	//우선순위 정하는 함수
	static int getPrioirty(char ch) {
		int result = 0;
		switch(ch) {
		case '*':	case '/':
			result = 2;
			break;
		case '+':	case '-':
			result = 1;
			break;
		}

		return result;
	}
}
