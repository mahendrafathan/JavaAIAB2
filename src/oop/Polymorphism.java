package oop;

//Polymorphism -> banyak bentuk
//merubah suatu objek ke bentuk lain (animal -> ayam) -> berhubungan dengan inheritance
//method override (polymorphism statis)
//method overload (polymorphism dinamis)
public class Polymorphism {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.sayHello("fathan2");
		
		// perubahan bentuk Person ke student
		// dari parent ke child
		Person student = new Student();
		student.sayHello("Adi");
//		student.sayHello2("mahendra", 17);
		
		Student student2 = new Student();
		student2.sayHello("mahendra");
		student2.sayHello2("mahendra", 17);
		
//		Student student2 = new Person();
		
		Kotak kotak = new Kotak();
		System.out.println(kotak.tambah(1));
		System.out.println(kotak.tambah(1, 2));
		System.out.println(kotak.tambah("dua"));
	}
	
}

//class induk
class Person {
	String name;
	
	void sayHello(String name) {
		System.out.println("Hallo saya person " + name);
	}
	
//	void sayHello2(String name, int age) {
//		System.out.println("Hallo saya person " + name + "umur " + age);
//	}
}

//class turunan
class Student extends Person {
	String name;
	
	// method override
//	void sayHello(String name) {
//		System.out.println("Hallo saya student " + name);
//	}
	
	void sayHello2(String name, int age) {
		System.out.println("Hallo saya student " + name + " umur " + age);
	}

	@Override
	void sayHello(String name) {
		super.sayHello(name);
	}
}


class Kotak {
	int tambah(int a) {
		return a+a;
	}
	
	// method overloading
	int tambah(int a, int b) {
		return a + b;
	}
	
	String tambah(String name) {
		return "ditambah " + name;
	}
}
