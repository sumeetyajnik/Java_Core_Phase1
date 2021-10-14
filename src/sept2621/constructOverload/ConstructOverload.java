package sept2621.constructOverload;

public class ConstructOverload {

	String name;
	int age;
	char section;
	char gender;
	int subject1 = 0;
	int subject2;
	int subject3;
	int total;
	double percentage;

	public ConstructOverload(String n, int i, char c, char d, int j, int k, int l) {
		name = n;
		age = i;
		section = c;
		gender = d;
		total = j + k + l;
		percentage = (total / (float) 3);
	}

	public ConstructOverload(String n, int i, char c, char d, int k, int l) {
		name = n;
		age = i;
		section = c;
		gender = d;
		subject2 = k;
		subject3 = l;
		total = k + l;
		percentage = (total / (float) 2);

	}

	public static void main(String[] args) {
		ConstructOverload s1 = new ConstructOverload("Student1", 24, 'A', 'M', 93, 93, 96);
		ConstructOverload s2 = new ConstructOverload("Student2", 24, 'A', 'M', 94, 91);
		ConstructOverload s3 = new ConstructOverload("Student3", 24, 'A', 'M', 88, 83);
		ConstructOverload s4 = new ConstructOverload("Student4", 24, 'A', 'M', 99, 93, 96);

		s1.display();
		s2.display();

		s3.display();
		s4.display();

	}

	void display() {
		System.out.println("name: " + name + ", age: " + age + ", section: " + section + ", gender: " + gender
				+ ", total: " + total + ", percentage: " + percentage);
	}

}
