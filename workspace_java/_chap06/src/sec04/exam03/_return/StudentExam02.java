package sec04.exam03._return;

public class StudentExam02 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "최민수";
		s1.age = 20;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		
		Student s2 = new Student();
		s2.name = "kim민수";
		s2.age = 21;
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		s1.setName("박춘보");
//		System.out.println(s1.name);
		
		String name = s1.getName();
		System.out.println("name : "+ name);
	}

}



