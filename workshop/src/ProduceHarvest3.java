import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
    int i;
    int j;
    public pair(int i, int j) {
        this.i = i;
        this.j = j;
    }

}
 
public class ProduceHarvest3 {
    static Scanner in=new Scanner(System.in);
     
    static int di[]= {-1,1,0,0};
    static int dj[]= {0,0,-1,1};
     
    public static void main(String[] args) {
        int T=in.nextInt();
        for(int test=1;test<=T;test++) {
            problem(test);
        }
    }
    private static void problem(int test) {
        int N=in.nextInt();
        int[][] mmap=new int[N][N];
        boolean[][] visited=new boolean[N][N];
         
        for(int i=0;i<N;i++) {
            String temp=in.next();
            for(int j=0;j<N;j++) {
                mmap[i][j]=temp.charAt(j)-'0';
            }
        }
         
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(N/2,N/2));
        int sum=0;
         
        for(int i=0,fin=N/2;i<=fin;i++) { //seed end level
            
            //qSize까지
            for(int k=0,size=q.size();k<size;k++) {
                pair item=q.poll();
                 
                if(visited[item.i][item.j])
                    continue;
                 
                visited[item.i][item.j]=true; //방문
                sum+=mmap[item.i][item.j];
                //4방향탐색
                for(int z=0;z<4;z++) {
                    int ii=item.i+di[z];
                    int jj=item.j+dj[z];
                    if(0<=ii && ii<N && 0<=jj && jj<=N)
                        q.offer(new pair(ii,jj));
                }
            }
             
             
        }//end for
         
        System.out.println("#"+test+" "+sum);
         
         
    }
 
}