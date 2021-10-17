package oct1621;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(1);
		l1.add(2);
		l1.add(5.6f);
		l1.add(3.76f);
		l1.add('a');
		l1.add('b');
		l1.add(true);
		System.out.println("LinkedHashSet l1 is " + l1);
		System.out.println("Size of LinkedHashSet l1 is " + l1.size());

		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		System.out.println("Enter the input Interger any order 1 to 8");
		Scanner input = new Scanner(System.in);
		int i1 = input.nextInt();
		int i2 = input.nextInt();
		int i3 = input.nextInt();
		int i4 = input.nextInt();
		int i5 = input.nextInt();
		int i6 = input.nextInt();
		int i7 = input.nextInt();
		int i8 = input.nextInt();
		
		l2.add(i1);
		l2.add(i2);
		l2.add(i3);
		l2.add(i4);
		l2.add(i5);
		l2.add(i6);
		l2.add(i7);
		l2.add(i8);
		 
        System.out.println("LinkedHashSet l2 is  : " + l2);
        System.out.println("Size of LinkedHashSet l2 is " + l2.size());
        
        
        

	}
	
	

}
