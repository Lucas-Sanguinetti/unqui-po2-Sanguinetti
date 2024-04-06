package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> elementos ;
	
	public Counter() {
		this.elementos = new ArrayList<>();
	}
	
	
	public void add(int x){
		
		elementos.add(x);
		
	}
	
	public int pares() {
		int x = 0;
		for (int i = 0; i < elementos.size(); i++) {
			x += delta(elementos.get(i)%2 == 0);
		}
		return x;
	}
	
	
	public int impares() {
		int x = 0;
		for (int i = 0; i < elementos.size(); i++) {
			x += delta(!(elementos.get(i)%2 == 0));
		}
		return x;
	}
	
	public int multiplosDe(int m) {
		int x = 0;
		for (int i = 0; i < elementos.size(); i++) {
			x += delta(elementos.get(i)%m == 0);
		}
		return x;
	}
	
	public int delta(boolean b) {
		if (b) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
}
