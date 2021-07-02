package oop;

public class LearnException {
	// error -> mempresentasikan kesalahan di luar aplikasi (out of memory)
	// exception -> mempresentasikan kesalahan karena aplikasi itu sendiri
	public static void main(String[] args) {
		int x;
		try {
			x = 50 / 0; // ArithmeticException
		} catch (Exception e) {
			System.out.println(e);
		}

		// di handle dalam fungsi yang dipanggil
		divide(3, 0);
//		divide(3, 1);		

		// di handle di fungsi pemanggil
		try {
			divide2(3, 0);
		} catch (Exception e) {
			System.out.println("handle di fungsi pemanggil : " + e);
		}

//		divide3(2, 0);

//		String s = null;
//		System.out.println(s.length()); // NullPointerException
//
//		String s2 = "abc";
//		int i = Integer.parseInt(s2); // NumberFormatException
//
//		int a[] = new int[]{1,3,4};
//		System.out.println(a[3]); // ArrayIndexOutOfBoundsException
		
		System.out.println("end of app");
	}

	public static void divide2(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("Oops! pembagi tidak boleh nol");
		}
		int z = x / y;
		System.out.println(z);
	}

	public static void divide3(int x, int y) {
		int z = x / y;
	}

	public static void divide(int x, int y) {
		int z;

		// try : untuk logic / codingan utama
		try {
//			z = x / y;
//			System.out.println("hasil bagi : " + z);
			
			System.out.println("try first");
			String s = null;
			System.out.println(s.length()); // NullPointerException

			// catch : untuk menangkap error supaya app tidak berhenti
		} catch (ArithmeticException e) {
			z = 0;
			System.out.println("catch1 " + e);

		} catch (NullPointerException e2) {
			System.out.println("catch 2 : " + e2);

			// finally : block yang akan dijalankan terus
		} finally {
			System.out.println("method finished");
		}
	}
}
