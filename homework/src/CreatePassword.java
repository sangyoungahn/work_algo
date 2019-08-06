import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreatePassword {
	static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        int T=10;
        for(int test=1;test<=T;test++) {
            problem(test);
        }
    }

    private static void problem(int test) {
        in.nextInt();
        Queue<Integer> q=new LinkedList<Integer>();

        for(int i=0;i<8;i++) {
            q.offer(in.nextInt());
        }

        outer:while(true) {
            //cycle
            for(int i=1;i<=5;i++) {
                int temp=q.poll()-i;
                if(temp<=0) {
                    q.offer(0);
                    break outer;
                }else {
                    q.offer(temp);
                }
            }
        }
        System.out.print("#"+test+" ");
        while(!q.isEmpty()) {
            System.out.print(q.poll()+" ");
        }
        System.out.println();

    }

}
