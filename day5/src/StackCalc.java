import java.util.Stack;

public class StackCalc {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();

		String s = "3+(4+5)*6+7";
		char[] ch = s.toCharArray();
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
						stack.push(ch[i]);
						pop = stack.pop();
						System.out.print(pop);
						if(stack.peek()=='+')	isp=1;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 +일 경우 isp=1
						else	isp=0;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 (일 경우 isp=0
					}

					else if(!stack.isEmpty() && (stack.peek()=='+')) {	//스택이 비어있지 않고, 가장 위에 있는 연산자가 +일 경우
						pop = stack.pop();
						System.out.print(pop);
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
						System.out.print(pop);
						isp=2;	//pop하고 난 뒤 스택의 가장 위에 있는 것이 *일 경우 isp는 2
					}

					//pop하고 난 뒤 스택의 가장 위에 있는 것이 +일 경우 isp는 1
					else if(!stack.isEmpty() && (stack.peek()=='+')) {
						pop = stack.pop();
						System.out.print(pop);
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
					pop=stack.pop();
					if(stack.isEmpty() || (pop=='('))	
						break;
					//'('가 아닐 경우 계속 pop을 함
					else if(!stack.isEmpty()) {
						System.out.print(pop);

					}
				}
			}
			//연산자일 경우 무조건 출력
			else if(ch[i] >= '0' && ch[i] <= '9'){
				System.out.print(ch[i]);
				if(stack.size()==1)
					System.out.println(stack.pop());
			}
		}//for
	}//main
}
