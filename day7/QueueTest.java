import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		
		pq.add('A');
		pq.add('C');
		pq.add('B');
//		pq.add('D');
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll() + " ");
		}
//		SQueue q = new SQueue();
//		q.add('A');
//		q.add('C');
//		q.add('B');
//		q.add('D');
//		
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.size());
//		
//		SQueue.Node temp = q.getFront() ;
//		while( (temp = q.getFront()) != null ) {
//			System.out.println(temp.data + " ");
//		}
	}

}
