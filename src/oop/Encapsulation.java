package oop;

import helper.Data2;

// Enkapsulasi -> mekasnisme untuk membungkus / mengikat variable, method
// Setter and getter -> untuk memberi akses write/read
// 					-> meningkatkan keamanan data
//					-> fleksibilitas, memproses data data di set
public class Encapsulation {
	public static void main(String[] args) {
		Data2 data2 = new Data2();
		data2.intPublic = 2;
		data2.sayHello();
//		data2.hello();
		
		Data data = new Data(2);
		data.dataDefault = 3;
		data.dataPublic = 2;
		data.dataProtected = 4;
		data.display();
		data.setDataPrivate(5);
		System.out.println("get data private : " + data.getDataPrivate());
		data.setPassword("glints");
		
		data.setGender(true);
		System.out.println("gender : "+ data.getGender());
	}
}

class Data {
	public int dataPublic;
	private int dataPrivate;
	protected int dataProtected;
	int dataDefault;
	
	private String password;
	private String gender;
	
	// constructor -> method / fungsi yang akan di jalankan pada saat instantiate
	Data(){	
	}
	
	Data(int inputPrivate){
		this.dataPrivate = inputPrivate;
	}
	
	public void display() {
		System.out.println("public " + dataPublic);
		System.out.println("private " + dataPrivate);
		System.out.println("protected " + dataProtected);
		System.out.println("default " + dataDefault);
	}
	
	public void setDataPrivate(int inputData) {
		this.dataPrivate = inputData;
	}

	public int getDataPrivate() {
		return dataPrivate;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = "abc" + password + "yxy";
		System.out.println(this.password);
	}

	public String getGender() {
		return gender;
	}

	// apakah kamu pria
	public void setGender(Boolean men) {
		this.gender = "Perempuan";
		if (men) {
			this.gender = "Laki - laki";
		}
	}
	
}

//class DataChild extends Data {
//	void display() {
//	}
//}
