import java.util.Scanner;
import java.util.Stack;

public class StackCalc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=0; t<10; t++) {	//테스트케이스
			int num = sc.nextInt();		//문자열의 길이를 입력
			String str = sc.next();		//문자열을 읿력
			char[] ch = new char[num];		//문자열을 문자 하나씩 저장할 배열
			ch=str.toCharArray();
			
			String postOrder = doPostOrder(ch);	//후위표기식으로 변환하는 함수
			int calcValue = doCalc(postOrder);		//후위표기식을 계산해주는s 함수
			System.out.print("#" + (t+1) + " " + calcValue);
		}
	}
	
	static String doPostOrder(char[] ch) {
		Stack<Character> stack = new Stack<Character>();
		String result = "";	//결과값을 저장하는 배열
		int icp=0;	//들어가는 것의 우선순위
		int isp=0;	//스택의 가장 위에 있는 것의 우선순위
		char pop ='\u0000';
		
		for(int i=0; i<ch.length; i++) {
			//'('를 만났을 경우
			if(ch[i]=='(' ) {
				stack.push(ch[i]);	
				isp=0;
			}
			//+,-를 만났을 경우
			else if(ch[i]=='+') {
				icp=1;	//+는 스택에 들어갈 때 우선순위가 1
				if(icp>=isp) {	//스택에 들어가는 연산자의 우선순위 >= 스택의 가장 위에 있는 연산자의 우선순위
					stack.push(ch[i]);
					isp=1;	//스택에 +,-가 들어갔으므로 가장 높은 위치에 있는 것의 우선순위가 1로 변경
				}
				else {	//스택에 들어가는 연산자의 5우선순위 < 스택의 가장 위에 있는 연산자의 우선순위
					if(!stack.isEmpty() && (stack.peek()=='*')) {	//스택이 비어있지 않고, 가장 위에 있는 연산자가 *일 경우
						pop = stack.pop();
						result += pop;
						isp=2;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 *일 경우 isp=2
					}

					else if(!stack.isEmpty() && (stack.peek()=='+')) {	//스택이 비어있지 않고, 가장 위에 있는 연산자가 +일 경우
						pop = stack.pop();
						result += pop;
						isp=1;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 +일 경우 isp=1
					}
					else	isp=0;
				}
			}

			//*를 만났을 경우
			else if(ch[i]=='*') {
				icp=2;	//*는 스택에 들어갈 때 우선순위가 2
				if(icp>=isp) {
					stack.push(ch[i]);
					isp=2;	//스택에 *가 들어갔으므로 가장 높은 위치에 있는 것의 우선순위가 2로 변경
				}
				else {
					if(!stack.isEmpty() && (stack.peek()=='*')) {
						pop = stack.pop();
						result += pop;
						isp=2;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 *일 경우 isp는 2
					}

					//pop하고 난 뒤 스택의 가장 위에 있는 것이 +일 경우 isp는 1
					else if(!stack.isEmpty() && (stack.peek()=='+')) {
						pop = stack.pop();
						System.out.println(pop);
						isp=1;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 *일 경우 isp는 1
					}
					else	isp=0;
				}
			}

			//')'를 만났을 경우
			else if(ch[i]==')') {
				while(true) {
					/*pop을 계속 하다가 스택이 비거나, '('를 만나면 멈춤
					 *pop연산 자체만으로도 스택에서 그 연산자가 사라지기 때문에 따로 제거하지 않아도 됨 */
					if(stack.isEmpty() || (pop=='(')) {
						break;
					}
					
					//'('가 아닐 경우 계속 pop을 함
					else if(!stack.isEmpty()) {
						pop=stack.pop();
						result += pop;

					}
				}
			}
			//연산자일 경우 무조건 출력
			else if(ch[i] >= '0' && ch[i] <= '9'){
				result += ch[i];
				if(stack.size()==1)
					result += stack.pop();
			}
		}
		return result;
	}
	
	static int doCalc(String s) {
		char[] srr = s.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int calcValue = 0;
		
		for(char ch:srr) {
			if(ch >= '0' && ch <= '9') {	//피연산자일 경우
				stack.push(new Integer(ch + ""));	//new Integer(ch + "")??????
			}
			else {		//연산자일 경우
				int pop2 = stack.pop();
				int pop1 = stack.pop();
				calcValue = calc(ch, pop1, pop2);
				stack.push(calcValue);
			}
		}
		
		return calcValue;
	}
	
	static int calc(char ch, int pop1, int pop2) {
		int result = 0;
		switch(ch) {
		case '*':
			result = pop1 * pop2;
			break;
		case '+':
			result = pop1 + pop2;
			break;
		}
		
		return result;
	}
}
