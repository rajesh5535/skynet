import java.util.*;

public class StackUsingQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //enter N numbers e.g., 4
		int size = 0;
		for (int i = 0; i < N; i++) {
			queue.offer(sc.nextInt());//insert N numbers 1,2,3,4
			size++;
			for (int k = 1; k < size; k++)
				queue.offer(queue.poll());//reverse the queue
		}
		while (!queue.isEmpty())
			System.out.print(queue.poll() + " ");//get 4,3,2,1
	}

}
