package ar.edu.unq.po2.tp6.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PokerStatus {

	private List<Carta> cartas;

	public PokerStatus() {
		super();
		this.cartas = new ArrayList<Carta>();
	}

	public void registrarCartas(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		this.cartas.add(c1);
		this.cartas.add(c2);
		this.cartas.add(c3);
		this.cartas.add(c4);
		this.cartas.add(c5);
;
	}
	
	public boolean esPoker() {
		Stream<Carta> stream = this.cartas.stream();
		Stream<Carta> stream2 = this.cartas.stream();
		boolean b1 = stream.map(c -> c.getNumero())
						   .filter(a -> a == this.cartas.get(0).getNumero())
						   .count()  == 4;
		boolean b2 = stream2.map(c -> c.getNumero())
				           .filter(a -> a == this.cartas.get(1).getNumero())
				           .count()  == 4;
		return (b1 | b2);
		
	}
	
	public boolean esColor() {
		Stream<Carta> stream = this.cartas.stream();
		boolean b = stream.filter(a -> a.tieneMismoPalo(this.cartas.get(0))).count() == 5;
		return b;
	}
	
	public boolean esTrio() {
		Stream<Carta> stream = this.cartas.stream();
		Stream<Carta> stream2 = this.cartas.stream();
		Stream<Carta> stream3 = this.cartas.stream();
		boolean b1 = stream.map(c -> c.getNumero())
						   .filter(a -> a == this.cartas.get(0).getNumero())
						   .count()  == 3;
		boolean b2 = stream2.map(c -> c.getNumero())
				           .filter(a -> a == this.cartas.get(1).getNumero())
				           .count()  == 3;
		boolean b3 = stream3.map(c -> c.getNumero())
		                   .filter(a -> a == this.cartas.get(2).getNumero())
		                   .count()  == 3;
		return (b1 | b2 | b3);
	}

	public String jugada() {
		String jugada = "Nada";
		if (this.esPoker()) {
			jugada = "Poker";
		} else if (this.esColor()){
			jugada = "Color";
		} else if(this.esTrio()) {
			jugada = "Trio";
		}
		return jugada;
	}



}
