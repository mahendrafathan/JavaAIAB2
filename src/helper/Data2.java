package helper;

// Access modifier -> keyword untuk memberikan hak akses
// publik -> semua bisa akses
// protected -> bisa di akses di beda package
// default modifier -> bisa diakses dalam 1 package
// private -> hanya bisa diakses di class
public class Data2 {
	int intDefault;
	public int intPublic;
	protected int intProtected;
	private int intPrivate;
	
	public void sayHello() {
		System.out.println("hallo data2");
	}
	
	void hello() {
		System.out.println("hei data2");
	}
}
