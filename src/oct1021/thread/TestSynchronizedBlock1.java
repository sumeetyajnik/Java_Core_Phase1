package oct1021.thread;

class Factorial1 {
	void printFactorial(int number) {
		System.out.println("I am into this printFactorial method");
		synchronized (this) {
			int i, fact = 1;
			for (i = 1; i <= number; i++) {
				fact = fact * i;
				System.out.println("Factorial of " + number + " is: " + fact);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}

class Factorial2 {
	void printFactorial(int number) {
		System.out.println("I am into this printFactorial method");
		synchronized (this) {
			int i, fact = 1;
			for (i = 1; i <= number; i++) {
				fact = fact * i;
				System.out.println("Factorial of " + number + " is: " + fact);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}

class AddNumber3 {
	void addNumber(int number1, int number2) {
		System.out.println("I am into this addNumber method");
		synchronized (this) {
			System.out.println("Add number 4, 5 of : " + (number1 + number2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class AddNumber4 {
	void addNumber(int number1, int number2) {
		System.out.println("I am into this addNumber method");
		synchronized (this) {
			System.out.println("Add number 4, 5 of : " + (number1 + number2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Factorial1 t;

	MyThread1(Factorial1 t) {
		this.t = t;
	}

	public void run() {
		System.out.println("Into the MyThread1 Factorial 4 run() method");
		t.printFactorial(4);
	}
}

class MyThread2 extends Thread {
	Factorial2 t;

	MyThread2(Factorial2 t) {
		this.t = t;
	}

	public void run() {
		System.out.println("Into the MyThread2 Factorial 6 run() method");
		t.printFactorial(6);
	}
}

class MyThread3 extends Thread {
	AddNumber3 t;

	MyThread3(AddNumber3 t) {
		this.t = t;
	}

	public void run() {
		System.out.println("Into the MyThread3 AddNumber 4, 5 run() method");
		t.addNumber(4, 5);
	}
}

class MyThread4 extends Thread {
	AddNumber4 t;

	MyThread4(AddNumber4 t) {
		this.t = t;
	}

	public void run() {
		System.out.println("Into the MyThread4 AddNumber 20, 10 run() method");
		t.addNumber(20, 10);
	}
}

public class TestSynchronizedBlock1 {

	public static void main(String args[]) {

		Factorial1 factorial1 = new Factorial1();
		Factorial2 factorial2 = new Factorial2();
		AddNumber3 addNumber3 = new AddNumber3();
		AddNumber4 addNumber4 = new AddNumber4();

		MyThread2 t2 = new MyThread2(factorial2);
		t2.start();

		MyThread4 t4 = new MyThread4(addNumber4);
		t4.start();

		MyThread1 t1 = new MyThread1(factorial1);
		t1.start();

		MyThread3 t3 = new MyThread3(addNumber3);
		t3.start();
	}
}
