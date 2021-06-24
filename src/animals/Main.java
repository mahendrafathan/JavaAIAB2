package animals;

import animals.mamalia.Kucing;
import animals.reptil.Buaya;

// default class --> namanya sama kaya file nya
public class Main {
	public static void main(String[] args) {
		Kucing cat = new Kucing();
		cat.sound();
		cat.setName("kitty");
		cat.setColor("black");
		System.out.println(cat.getName());
		System.out.println(cat.getColor());
		
		Buaya crocs = new Buaya();
		crocs.sound();
	}
}
