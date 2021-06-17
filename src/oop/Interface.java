package oop;

public class Interface {
	public static void main(String[] args) {
//		Komponen kmp = new Komponen();

		Car car = new Car();
		car.design();
		System.out.println(car.getColor());
		System.out.println(car.getShape());
	
		System.out.println("============");
		
		Moto moto = new Moto();
		moto.design();
		System.out.println(moto.getColor());
		System.out.println(moto.getShape());
	}
}

// interface -> kontrak class turunannya (harus implement abstract methodnya)
// keyword untuk implementasi interface -> implement
// class yang hanya bersisi method abstract
// dan hanya bisa berisi const (tidak bisa ada variable)
interface KomponenBody {
	String color = "red";

	// access modifier cuma boleh public
	String getColor();

	void design();
}

interface KomponenBan {
	String shape = "bulat";

	String getShape();
}

class Car implements KomponenBody, KomponenBan {
	public String getColor() {
		return color;
	}

	public void design() {
		System.out.println("city car");
	}

	public String getShape() {
		return shape;
	}
}

// interface juga bisa di implement di kelas abstract
abstract class SubKomponen implements KomponenBody, KomponenBan {
	
}

class Moto extends SubKomponen {

	public String getColor() {
		return color;
	}

	public void design() {
		System.out.println("Superbike");
	}

	public String getShape() {
		return shape;
	}

}
