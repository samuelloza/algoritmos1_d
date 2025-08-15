package w6;

import java.util.PriorityQueue;

public class PriorityQueueHospital {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		priorityQueue.add(2);
		priorityQueue.add(1);
		priorityQueue.add(4);
		priorityQueue.add(3);
		priorityQueue.add(-415551);

		
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}
}
