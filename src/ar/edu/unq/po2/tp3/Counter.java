package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> elementos ;
	
	public Counter() {
		this.elementos = new ArrayList<>();
	}
	
	
	public void addNumber(int x){
		
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
	
	public int masPares() {
		int x = -1;
		for (int i = 0; i < elementos.size(); i++) {
			x = elQueTengaMasPares(x, elementos.get(i));
		}
		return x;
	}
	
	public int elQueTengaMasPares(int a, int b) {
		if (paresDe(a)>= paresDe(b)) {
			return a;
		} else {
			return b;
		}
	}
	
	public int paresDe(int x) {
		int pares = 0;
		int numeroActual = x;
		while (numeroActual/10 >0) {
			pares += delta(hayDigitoPar(numeroActual));
			numeroActual /= 10;
		}
		pares += delta(hayDigitoPar(numeroActual));
		return pares;
		
	}
	
	public boolean hayDigitoPar(int x) {
		if (x%10 >= 1) {
			return ((x%10)%2 == 0) ;
		} else {
			return (x%2 == 0);
		}

	}
	
	public int multiploMasAlto(int x, int y) {
		if (x*y > 1000) {
			return -1;
		} else {
			return multiploMasCercanoA(x,y,1000);
		}
	}
	
	public int multiploMasCercanoA(int x, int y, int z) {
		int minimo = x*y;
		int multiploMasCercano = 1;
		while (minimo*multiploMasCercano <= z +1) {
			multiploMasCercano++;
		}
		return (multiploMasCercano-1)*minimo;
	}
}
