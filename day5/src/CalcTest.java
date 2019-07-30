import java.util.Stack;

public class CalcTest {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		
		String s = "(6+5*(2-8)/2)";
		char[] ch = s.toCharArray();
		int icp=0;	//들어가는 것의 우선순위
		int isp=0;	//스택의 가장 위에 있는 것의 우선순위
		char pop ='\u0000';
		
		for(int i=-0; i<ch.length; i++) {
			//'('를 만났을 경우
			if(ch[i]=='(' ) {
				stack.push(ch[i]);
				isp=0;
			}
			//+,-를 만났을 경우
			else if(ch[i]=='+' || ch[i]=='-') {
				icp=1;	//+,-는 스택에 들어갈 때 우선순위가 1
				if(icp>isp) {
					stack.push(ch[i]);
					isp=1;	//스택에 +,-가 들어갔으므로 가장 높은 위치에 있는 것의 우선순위가 1로 변경
				}
				else {
					pop = stack.pop();
					System.out.print(pop);
					//pop하고 난 뒤 스택의 가장 위에 있는 것이 +,-일 경우 isp는 1
					if(!stack.isEmpty() && (stack.peek()=='+' || stack.peek()=='-')) {
						isp=1;
					}
					else	isp=0;
				}
			}
			//*,/를 만났을 경우
			else if(ch[i]=='*' || ch[i]=='/') {
				icp=2;	//*,/는 스택에 들어갈 때 우선순위가 2
				if(icp>isp) {
					stack.push(ch[i]);
					isp=2;	//스택에 *,/가 들어갔으므로 가장 높은 위치에 있는 것의 우선순위가 2로 변경
				}
				else {
					pop = stack.pop();
					System.out.print(pop);
					//pop하고 난 뒤 스택의 가장 위에 있는 것이 *,/일 경우 isp는 2
					if(!stack.isEmpty() && (stack.peek()=='*' || stack.peek()=='/')) {
						isp=2;
					}
					//pop하고 난 뒤 스택의 가장 위에 있는 것이 +,-일 경우 isp는 1
					else if(!stack.isEmpty() && (stack.peek()=='+' || stack.peek()=='-')) {
					}
					else	isp=0;
				}
			}
			//')'를 만났을 경우
			else if(ch[i]==')') {
				while(true) {
					if(!stack.isEmpty() && (stack.pop()=='('))	//pop을 계속 하다가 '('를 만나면 멈춘다
						break;
					else {		//'('가 아닐 경우 계속 pop을 함
						if(!stack.isEmpty()) {
							pop = stack.pop();
							System.out.print(pop);
						}
					}
				}
			}
			//연산자일 경우 무조건 출력
			else {
				System.out.print(ch[i]);
			}
		}
	}
}
