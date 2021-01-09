import java.util.*;
import java.lang.*;

class NotPossible extends Exception {
	String s;
	int n;
	NotPossible(String s, int n) {
		this.s = s;
		this.n = n;
		System.out.println("ERROR!! " + s + n);
	}

	public String toString() {
		return "NotPossible exception.";
	}
}

class Company {
	Scanner s = new Scanner(System.in);
	int yoj;
	Company() throws NotPossible{
		System.out.println("Enter year of joining: ");
		yoj = s.nextInt();
		if (yoj < 2005) {
			throw new NotPossible("Year of joining is invalid! ", yoj);
		}
	}

	public void display() {
		System.out.println("Year of Joining: " + yoj);
	}
}

class Employee extends Company {
	Scanner s = new Scanner(System.in);
	int age;
	public Employee() throws NotPossible {
		System.out.println("Enter age: ");
		age = s.nextInt();
		if (age < 18 || age > 60) {
			throw new NotPossible("Age requirement not met! ", age);
		}
	}

	public void display_emp() {
		System.out.println("Age: " + age);
	}
}

class test2_2 {
	public static void main(String[] args) {
		try{
			Employee e = new Employee();
			e.display();
			e.display_emp();
		} catch(NotPossible n) {
			System.out.println(n);
		}
	}
}