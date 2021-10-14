package oct1021.thread;
	 

class MyThread1 extends Thread {

	public void run() {
		int i, fact = 1;
		int number = 4;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}

class MyThread2 extends Thread {
	public void run() {
		int i, fact = 1;
		int number = 6;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}

class MyThread3 extends Thread {

	public void run() {
		System.out.println("Add number 4, 5 of : " + (4 + 5));
	}
}

class MyThread4 extends Thread {

	public void run() {
		System.out.println("Add number 20, 10 of : " + (20 + 10));
	}
}

public class TestSynchronizedBlock1 {

	public static void main(String args[]) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		
		t2.start();
		t4.start();
		t1.start();
		t3.start();
		
	}
}
