
public class SQueue {
	Node front;
	Node rear;
	int size;
	static final boolean DEBUG = true;
	static class Node{
		char data;
		Node next;
	}
	public Node getFront()	{
		return front;
	}
	public void add(char item) {
		Node node = new Node();
		node.data = item;
		if(isEmpty()) {
			front = rear = node;
		}else {
			if(node.data <= front.data) {	//처음에 삽입경우
				node.next = front;
				front = node;
			}
			else {	//중간이나 마지막 삽입하는 경우
				boolean flag = true;
				for(Node temp = front.next; temp.next != null; temp = temp.next) {	//중간인 경우
					if(temp.next.data >= node.data) {
						node.next = temp.next;
						temp.next = node;
						flag = false;
						break;
					}
				}
				if(flag) {
					//마지막인 경우
					rear.next = node;
					rear = node;
				}
			}
		}
		
		size++;
	}
	public char poll() {
		if(DEBUG) {
			System.out.println("poll");
		}
		char temp = peek();
		if(temp != '\u0000') {
			front = front.next;
			if(front == null) {
				rear = null;
			}
			size--;
		}
		return temp;
	}
	public char peek() {
		if(isEmpty()) {
			return '\u0000';
		}
		return front.data;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return front == null;
	}
}
