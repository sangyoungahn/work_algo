import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("dfsdf" + "\n");
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		for(int i = 0; i < 3; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println( (i + 1) + " : " + c);
		}
	}

}
