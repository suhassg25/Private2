package _5steps;

public class Tester {

	public static void main(String[] args) {
		EmployeeCRUD e= new EmployeeCRUD();
		e.Insertion(101, "suhas", 9689689);
		e.Update("hello", 101);
		e.Delete(101);

	}

}
