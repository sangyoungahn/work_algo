import java.util.Stack;

public class PostfixCalc {

	public static void main(String[] args) {
		String str = "6528-*2/+";
		int result = calcPostOrder(str);
		System.out.println(result);
	}
	static int calcPostOrder(String s) {
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
		case '/':
			result = pop1 / pop2;
			break;
		case '+':
			result = pop1 + pop2;
			break;
		case '-':
			result = pop1 - pop2;
			break;
		}
		
		return result;
	}
}
