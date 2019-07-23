import java.util.Scanner;
import java.util.Stack;

public class Sum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		
		
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			if(str1.length() < str2.length()) {
				String temp = str1;
				str1 = str2;
				str2 = temp;
			}
			
			char[] ch1 =str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			
			for(int i=0; i<ch1.length; i++) {
				stack1.push(ch1[i] - '0');
			}
			
			for(int i=0; i<ch2.length; i++) {
				stack2.push(ch2[i] - '0');
			}
			
			int sum = 0;
			int carry = 0;
			for(int s=0; s<ch1.length; s++) {
				
				
				if(stack2.isEmpty()==true)
					sum = stack1.pop() + carry;
				else
					sum=stack1.pop() + stack2.pop() + carry;
				
				int nam = sum % 10;					
				carry = sum / 10;
				stack3.push(nam);
				
				
//				if(stack2.isEmpty() == true) {
//					sum = stack1.pop() + carry;
//					int nam = sum % 10;					
//					carry = sum / 10;
//					stack3.push(nam);
//					continue;
//				}
//				sum = stack1.pop() + stack2.pop() + carry;
//				int nam = sum % 10;
//				stack3.push(nam);
//				carry = sum / 10;
				
			}
			//123+128=251
			if(carry==1) { //ch1 + ch2 가 더해져서 두 값의 결과가 자릿수가 바뀌는 경우 ex. 10+90=100
				stack3.push(1);
			}
			System.out.print("#" + (t+1) + " ");
			while(stack3.isEmpty()==false) {
				System.out.print(stack3.pop());
			}
			System.out.println();
		}
	}
}
