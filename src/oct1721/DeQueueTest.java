package oct1721;

import java.util.ArrayList;
import java.util.List;

public class DeQueueTest {
	private List<Integer> deque = new ArrayList<Integer>();

	public static void main(String[] args) {
		DeQueueTest deq = new DeQueueTest();
		deq.insertFront(90);
		deq.insertRear(56);
		deq.insertRear(33);
		deq.insertFront(12);
		deq.peakFront();
		deq.peakRear();
		deq.removeFront();
		deq.peakFront();
		deq.removeRear();
		deq.peakFront();
		deq.insertFront(44);
		deq.insertFront(88);
	}

	public void insertFront(int item) {
		// add element at the beginning of the queue
		System.out.println("adding at front: " + item);
		deque.add(0, item);
		System.out.println(deque);
	}

	public void insertRear(int item) {
		// add element at the end of the queue
		System.out.println("adding at rear: " + item);
		deque.add(item);
		System.out.println(deque);
	}

	public void removeFront() {
		if (deque.isEmpty()) {
			System.out.println("Deque underflow!! unable to remove.");
			return;
		}
		// remove an item from the beginning of the queue
		int rem = deque.remove(0);
		System.out.println("removed from front: " + rem);
		System.out.println(deque);
	}

	public void removeRear() {
		if (deque.isEmpty()) {
			System.out.println("Deque underflow!! unable to remove.");
			return;
		}
		// remove an item from the beginning of the queue
		int rem = deque.remove(deque.size() - 1);
		System.out.println("removed from rear: " + rem);
		System.out.println(deque);
	}

	public int peakFront() {
		// gets the element from the front without removing it
		int item = deque.get(0);
		System.out.println("Element at first: " + item);
		return item;
	}

	public int peakRear() {
		// gets the element from the rear without removing it
		int item = deque.get(deque.size() - 1);
		System.out.println("Element at rear: " + item);
		return item;
	}

}
