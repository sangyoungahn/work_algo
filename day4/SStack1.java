
public class SStack1 {
	//데이터 저장 공간, 접근 위치
	char[] datas;
	int top = -1;
	int stackSize;
	public SStack1() {
		stackSize = 10;
		datas = new char[stackSize];
//		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public char peek() {
		char ch = '\u0000';		//공백 - \u0000
		if(isEmpty()) {
			System.out.println("Empty");
			return ch;
		}
		ch = datas[top];
		top--;
		return ch;
	}
	
	public char pop() {
		char ch = '\u0000';		//공백 - \u0000
		if(isEmpty()) {
			System.out.println("Empty");
			return ch;
		}
		ch = datas[top];
		top--;
		return ch;
	}
	
	public void push(char ch) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}
		top++;
		datas[top] = ch;
	}
//	삽입, 삭제, 꼭대기 확인, 비워있는지 판단, 꽉차있는지 판단
	public boolean isFull() {
		if(top == stackSize -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		return top == -1 ? true : false;
		
//		if(top == -1) {
//			return true;
//		}else {
//			return false;
//		}
	}
}
