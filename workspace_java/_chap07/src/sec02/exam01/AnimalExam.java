package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.think();
		a1.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.grooming();
		
		Animal a2 = (Animal)cat; // 자식이 부모가 될 때
		Animal a3 = cat;		 // 형 변환 연산자 생략 가능
		
		a2.eat();
//		a2.clean();
		
		Dog dog = new Dog();
		Animal a5 = dog;
		
		Animal a4 = new Dog();
		
//		new AnimalExam().catMom(cat);
		catMom(cat);
//		catMom(dog);
		
		animalCare(a4);
		animalCare( new Cat() );
		
		
	}
	
	static void catMom(Cat cat) {
		cat.eat();
		cat.grooming();
	}
	
	static void animalCare(Animal animal) {
		System.out.println("나이는 : "+ animal.age);
		animal.eat();
		animal.think();
	}

}
