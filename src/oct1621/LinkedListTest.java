package oct1621;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		final String[] months = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
				"Ocotber", "November", "December" };
		final String[] winterMonths = { "January", "Febuary", "November", "December" };

		linkedList.add("May");
		linkedList.add("June");
		linkedList.add("July");
		linkedList.add("August");
		linkedList.add("April");
		linkedList.add("November");

		System.out.println(linkedList);
		System.out.println("Size of the linked list: " + linkedList.size());

		linkedList.addLast("December");
		linkedList.addFirst("January");
		System.out.println(linkedList);
		System.out.println("Size of the linked list: " + linkedList.size());

		linkedList.add(8, "March");
		linkedList.add(9, "Febuary");
		System.out.println(linkedList);
		System.out.println("Size of the linked list: " + linkedList.size());

		linkedList.add(10, "September");
		linkedList.add(11, "Ocotber");
		System.out.println(linkedList);
		System.out.println("Size of the linked list: " + linkedList.size());

		LinkedList<String> newLinkedList = new LinkedList<String>();

		for (String month : months) {
			for (String month1 : linkedList) {
				if (month == month1) {
					newLinkedList.add(month1);
				}
			}
		}
		System.out.println(newLinkedList);

		LinkedList<String> newLinkedListEven = new LinkedList<String>();
		LinkedList<String> newLinkedListOdd = new LinkedList<String>();
		for (int i = 0; i < newLinkedList.size(); i++) {
			if (i % 2 == 0) {
				newLinkedListEven.add(newLinkedList.get(i));
			} else {
				newLinkedListOdd.add(newLinkedList.get(i));
			}
		}

		System.out.println(newLinkedListEven);

		System.out.println(newLinkedListOdd);

		Iterator itr1 = newLinkedList.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println(
				"Print 1st and last month of the year: " + newLinkedList.getFirst() + ", " + newLinkedList.getLast());
		newLinkedList.remove(2);
		System.out.println(newLinkedList);

		for (String winMonth : winterMonths) {
			System.out.println(
					"New month list contains winter months as " + winMonth + " : " + newLinkedList.contains(winMonth));
		}
	}

}
