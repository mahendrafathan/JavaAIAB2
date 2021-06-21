package oop;

import java.util.Arrays;

public class Strings {
	// int, char, float <- fundamental
	// String <- hi level variable
	public static void main(String[] args) {
		// pengenalan string
		char[] word = { 'h', 'a', 'l', 'l', 'o' };
		String wordStr = new String(word);
		System.out.println(word);
		System.out.println(wordStr);
		System.out.println(Arrays.toString(word));

		// cara membuat String
		String kata = "fathan";
		String kataStr = new String("mahendra");

		// cara akses komponen dari string
		System.out.println("komponen char[] ke: " + word[0]);
		System.out.println("komponen string ke: " + wordStr.charAt(0));

		word[1] = 'b';
		System.out.println(word);
//		wordStr.charAt(0) = "2"; error

		// String <-- immutable, tidak bisa dirubah
		// string tidak bisa dirubah value nya secara langsung
		// harus di assigne lagi
		System.out.println(kata.concat(" mahendra"));
		System.out.println(kata);

		kata = kata.concat(" mahendra");
		System.out.println(kata);
		
		// di java ada 3 istilah memory <-- heap, stack, string pool
		String kata1 = "hallo";
		String kata2 = "hallo";
		String kata3 = "he";
		address("kata1", kata1);
		address("kata2", kata2);
		address("kata3", kata3);
		address("default", "he");
		address("default2", "hallo");
		kata2 = "hallo he";
		address("kata2", kata2);
		String kataNew = new String("he");
		address("kata3", kata3);
		address("kataNew", kataNew);
		String kata4 = "he";
		address("kata4", kata4);
		
		// comparison antara string lebih aman menggunakan equals
		if (kata3.equals(kataNew)) {
			System.out.println("sama");
		}
		
		// StringBuffer <-- untuk mengubah String ke mutable (jadi bisa dirubah2)
		StringBuffer kataBuffer = new StringBuffer("hello");
		System.out.println(kataBuffer);
		address("kataBuffer", kataBuffer);
		kataBuffer.append(" he");
		System.out.println(kataBuffer);
		address("kataBuffer2", kataBuffer);
		
	}
	
	private static void address(String name, StringBuffer data) {
		int address = System.identityHashCode(data);
		System.out.println(name + ", " + data + "\t address : " + address);
	}

	private static void address(String name, String data) {
		int address = System.identityHashCode(data);
		System.out.println(name + ", " + data + "\t address : " + address);
	}
}
