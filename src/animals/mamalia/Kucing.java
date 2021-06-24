package animals.mamalia;

import java.util.*;

import animals.Animal;

public class Kucing extends Animal {
	private String name;
	private String color;
	private List<String> alamat;
	private Map<String, String> NIK;
	private ArrayList<String> apa;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void sound() {
		System.out.println("meow");
	}
}
