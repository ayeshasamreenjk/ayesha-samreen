import java.util.Date;
public class Main {

	public static void main(String[] args) {
		StudentGroup ptg= new StudentGroup(10);
		Date d= new Date(1999,7,10);
		Student c3= new Student(20,"xyz",d,89.0);
		ptg.addFirst(c3);
		System.out.println(ptg.getStudent(0).getId());
	}

}
