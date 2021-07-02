package solid;

public class InterfaceSegretion {

}

// kurang tepat
// masih bisa di breakdown lagi
interface Animal3 {
	public void makan();

	public void menyusui();
}

class Ayam3 implements Animal3 {
	@Override
	public void makan() {
		System.out.println("ayam makan");
	}

	@Override
	public void menyusui() {
		throw new IllegalStateException("not implement yet");
	}
}

class Sapi3 implements Animal3 {
	@Override
	public void menyusui() {
		System.out.println("Sapi menyusui");
	}

	@Override
	public void makan() {
		System.out.println("sapi makan");
	}
}


// clean code
interface Animal4 {
	public void makan();
}

interface Mamalia {
	public void menyusui();
}

class Ayam4 implements Animal4 {
	@Override
	public void makan() {
		System.out.println("ayam makan");
	}
}

class Sapi4 implements Animal4, Mamalia {
	@Override
	public void menyusui() {
		System.out.println("Sapi menyusui");
	}

	@Override
	public void makan() {
		System.out.println("sapi makan");
	}
}