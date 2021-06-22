package oop;

import java.util.Arrays;

// coba cari tau
// default value primitif data type dan non primitif data type

// Array -> himpunan dari tipe data yang jenisnya sama ex; [1, 2, 3, 4]
// sifat -> statis
public class ArrayLearn {
	public static void main(String[] args) {
//		int angka;
//		Integer angka2;

		// cara deklarasi array
		int[] deklarasi1;
		deklarasi1 = new int[2];

		// deklarasi dan initialization array
		String[] deklarasi3 = new String[5];

		System.out.println("deklarasi 1 : " + Arrays.toString(deklarasi1));
		System.out.println("deklarasi 3 : " + Arrays.toString(deklarasi3));

		// inisialisasi dan isi datanya
		int deklarasi2[] = { 3, 4 };
		System.out.println("deklarasi 2 : " + Arrays.toString(deklarasi2));
		deklarasi1[0] = 2;
		deklarasi1[1] = 1;
		System.out.println("deklarasi 1 : " + Arrays.toString(deklarasi1));

		System.out.println(deklarasi1[0]);

		// array di java itu -> pass by reference
		System.out.println("address 1 : " + deklarasi1);
		System.out.println("address 2 : " + deklarasi2);
		deklarasi1 = deklarasi2;
		System.out.println("address 1 : " + deklarasi1);
		System.out.println("address 2 : " + deklarasi2);
		System.out.println("deklarasi 1 : " + Arrays.toString(deklarasi1));
		System.out.println("deklarasi 2 : " + Arrays.toString(deklarasi2));
		deklarasi2[0] = 10;
		System.out.println("deklarasi 1 : " + Arrays.toString(deklarasi1));
		System.out.println("deklarasi 2 : " + Arrays.toString(deklarasi2));

		// meng copy array
		System.out.println("============ copy array");
		deklarasi1 = Arrays.copyOf(deklarasi2, 2);
		System.out.println("address 1 : " + deklarasi1);
		System.out.println("address 2 : " + deklarasi2);
		System.out.println("deklarasi 1 : " + Arrays.toString(deklarasi1));
		System.out.println("deklarasi 2 : " + Arrays.toString(deklarasi2));
//		deklarasi2[1] = 9;
//		System.out.println("deklarasi 1 : " + Arrays.toString(deklarasi1));		
//		System.out.println("deklarasi 2 : " + Arrays.toString(deklarasi2));

		// komparasi array
		System.out.println("============ komparasi array");
		if (Arrays.equals(deklarasi1, deklarasi2)) {
			System.out.println("sama");
		}

		if (deklarasi1 == deklarasi2) {
			System.out.println("sama");
		}

		// looping array
		System.out.println("============ looping array");
		// for biasa
		for (int i = 0; i < deklarasi2.length; i++) {
			System.out.println("index ke - " + (i + 1) + ": " + deklarasi2[i]);
		}

		// for each
		for (int val : deklarasi2) {
			System.out.println(val);
		}
		
		// sorting array
		System.out.println("============ sorting array");
		int[] arr = {3,5,4,6,1,7,2,8};
		Arrays.sort(arr);
		System.out.println("sorting array : " + Arrays.toString(arr));

		// array multiple dimensi
		System.out.println("============ multiple dimensi array");
		int[][] array2D = { { 1, 2 }, { 3, 4 } };
		printArr2D(array2D);
		
		// latihan array, tambah panjang dan value array
		// tambah value 7, di array deklarasi1
		System.out.println("============ latihan array");
		deklarasi1 = addElement(deklarasi2, 7);
		System.out.println("add element : " + Arrays.toString(deklarasi1));
	}
	
	static int[] addElement(int[] myArray, int elm) {
		int len = myArray.length;
		int[] newArray = new int[len + 1];
		
		for (int i = 0; i < len; i++) {
			newArray[i] = myArray[i];
		}
		
		newArray[len] = elm;
				
		return newArray;
	}
	
	static void printArr2D(int[][] data) {
		System.out.println("print array 2D : " + Arrays.deepToString(data));
	}
}
