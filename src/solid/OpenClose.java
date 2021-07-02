package solid;

public class OpenClose {

}

// Bad code
// tidak open for extension (karena tidak di extend kebawahnya)
// tidak close for modification (karena setiap nambah fitur class harus di modif)
class Animal {
	private String name;

	public void getNameAnimal() {
		if ("elephant".equals(name)) {
			System.out.println("Name of animal is elephant");
		} else if ("tiger".equals(name)) {
			System.out.println("Name of animal is tiger");
		} else if ("cat".equals(name)) {
			System.out.println("Name of animal is cat");
		} else if ("dog".equals(name)) {
			System.out.println("Name of animal is dog");
		} else {
			System.out.println("This is animal");
		}
	}
}

// clean code 
abstract class Animal2 {
	String name;
	public void sound() {
	}
	public abstract void getNameAnimal();
}

class Tiger extends Animal2 {
	@Override
	public void getNameAnimal() {
		System.out.println("Name of, animal is tiger");
	}
}

class Cat extends Animal2 {
	@Override
	public void getNameAnimal() {
		System.out.println("Name of, animal is cat");
	}
}




