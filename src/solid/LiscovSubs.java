package solid;

public class LiscovSubs {

}

// bad code
// kita ulang method operasi di class yang berbeda
class Tambah {
	public int operasi(int a, int b) {
		return a + b;
	}
}

class Kurang {
	public int operasi(int a, int b) {
		return a - b;
	}
}

// clean code 
interface Kalkulator {
	public int operasi(int a, int b);
}

class Tambah2 implements Kalkulator {

	@Override
	public int operasi(int a, int b) {
		return a + b;
	}

}

class Kurang2 implements Kalkulator {
	@Override
	public int operasi(int a, int b) {
		return a - b;
	}
}