package oct1621;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSetList = new TreeSet<String>();
		treeSetList.add("Java");
		treeSetList.add("C");
		treeSetList.add("Python");
		treeSetList.add("PHP");
		treeSetList.add("JavaScript");
		treeSetList.add("C++");

		System.out.println("TreeSet is " + treeSetList);
		System.out.println("Size of TreeSet is " + treeSetList.size());

		System.out.println("treeSetList.pollFirst() is " + treeSetList.pollFirst());
		System.out.println("TreeSet is " + treeSetList);
		System.out.println("Size of TreeSet is " + treeSetList.size());

		System.out.println("treeSetList.pollLast() is " + treeSetList.pollLast());
		System.out.println("TreeSet is " + treeSetList);
		System.out.println("Size of TreeSet is " + treeSetList.size());

		treeSetList.add("C#");
		treeSetList.add("AngularJs");
		treeSetList.add("HTML");
		System.out.println("TreeSet is " + treeSetList);
		System.out.println("Size of TreeSet is " + treeSetList.size());

		System.out.println("Does TreeSet contains this 'Java' element  " + treeSetList.contains("Java"));

		treeSetList.clear();
		System.out.println("get class  " + treeSetList.getClass());
		System.out.println("is TreeSet empty  " + treeSetList.isEmpty());

	}

}
