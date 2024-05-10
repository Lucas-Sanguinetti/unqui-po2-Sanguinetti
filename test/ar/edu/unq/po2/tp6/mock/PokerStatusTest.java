package ar.edu.unq.po2.tp6.mock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.mock.Carta;
import ar.edu.unq.po2.tp6.mock.Palo;
import ar.edu.unq.po2.tp6.mock.PokerStatus;

class PokerStatusTest {
	
	private PokerStatus ps;
	
	@BeforeEach
	void setup() {
		this.ps = new PokerStatus();
	}

	@Test
	void pokerTest1() {
		Carta c1 = new Carta(1, Palo.Diamante);
		Carta c2 = new Carta(1, Palo.Pica);
		Carta c3 = new Carta(1, Palo.Corazon);
		Carta c4 = new Carta(1, Palo.Trebol);
		Carta c5 = new Carta(13, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.esPoker());
	}
	
	@Test
	void pokerTest2() {
		Carta c1 = new Carta(4, Palo.Diamante);
		Carta c2 = new Carta(1, Palo.Pica);
		Carta c3 = new Carta(1, Palo.Corazon);
		Carta c4 = new Carta(1, Palo.Trebol);
		Carta c5 = new Carta(1, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.esPoker());
	}

	
	@Test
	void pokerTest3() {
		Carta c1 = new Carta(3, Palo.Diamante);
		Carta c2 = new Carta(2, Palo.Pica);
		Carta c3 = new Carta(3, Palo.Corazon);
		Carta c4 = new Carta(3, Palo.Trebol);
		Carta c5 = new Carta(3, Palo.Pica);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.esPoker());
	}

	
	@Test
	void pokerTest4() {
		Carta c1 = new Carta(3, Palo.Diamante);
		Carta c2 = new Carta(2, Palo.Pica);
		Carta c3 = new Carta(7, Palo.Corazon);
		Carta c4 = new Carta(8, Palo.Trebol);
		Carta c5 = new Carta(12, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertFalse(ps.esPoker());
	}

	
	@Test
	void jugadasTest() {
		Carta c1 = new Carta(1, Palo.Diamante);
		Carta c2 = new Carta(1, Palo.Pica);
		Carta c3 = new Carta(1, Palo.Corazon);
		Carta c4 = new Carta(1, Palo.Trebol);
		Carta c5 = new Carta(13, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.jugada().equals("Poker"));
	}
	
	@Test
	void jugadasTest2() {
		Carta c1 = new Carta(1, Palo.Diamante);
		Carta c2 = new Carta(10, Palo.Pica);
		Carta c3 = new Carta(3, Palo.Diamante);
		Carta c4 = new Carta(5, Palo.Diamante);
		Carta c5 = new Carta(13, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.jugada().equals("Nada"));
	}
	
	@Test
	void jugadasTest3() {
		Carta c1 = new Carta(1, Palo.Diamante);
		Carta c2 = new Carta(10, Palo.Diamante);
		Carta c3 = new Carta(3, Palo.Diamante);
		Carta c4 = new Carta(5, Palo.Diamante);
		Carta c5 = new Carta(13, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.jugada().equals("Color"));
	}
	
	@Test
	void jugadasTest4() {
		Carta c1 = new Carta(1, Palo.Diamante);
		Carta c2 = new Carta(1, Palo.Pica);
		Carta c3 = new Carta(2, Palo.Trebol);
		Carta c4 = new Carta(1, Palo.Corazon);
		Carta c5 = new Carta(13, Palo.Diamante);
		ps.registrarCartas(c1,c2,c3,c4,c5);
		assertTrue(ps.jugada().equals("Trio"));
	}




}
