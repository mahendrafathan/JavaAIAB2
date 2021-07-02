package solid;

public class DependencyInv {

}

// non dependency inv
class Gaji {
	public double hitungBonusTahunan(int tahun, double gaji) {
		double bonusTahunan = tahun * gaji * 2;
		return bonusTahunan;
	}
}

class Karyawan {
	Gaji gaji = new Gaji();

	public double hitungBonusTahunan() {
		// logic
		return gaji.hitungBonusTahunan(1, 4000000);
	}
}

// dependency inv
interface Gaji2 {
	public double hitungBonusTahunan(int tahun, double gaji);
}

class GajiImpl implements Gaji2 {
	@Override
	public double hitungBonusTahunan(int tahun, double gaji) {
		double bonusTahunan = tahun * gaji * 2;
		return bonusTahunan;
	}
}

class Karyawan2 {
	private Gaji2 gaji;

	public Karyawan2(Gaji2 gaji) {
		this.gaji = gaji;
	}

	public double hitungBonusTahunan() {
		return gaji.hitungBonusTahunan(1, 4000000);
	}
}