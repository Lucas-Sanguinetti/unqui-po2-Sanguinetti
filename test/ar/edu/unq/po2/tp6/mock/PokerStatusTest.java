package ar.edu.unq.po2.tp6.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus ps;
	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;
	
	
	
	
	@BeforeEach
	void setup() {
		this.ps = new PokerStatus();
		this.c1 = mock(Carta.class);
		this.c2 = mock(Carta.class);
		this.c3 = mock(Carta.class);
		this.c4 = mock(Carta.class);
		this.c5 = mock(Carta.class);
		
	}

	@Test
	void pokerTest1() {
		when(c1.getNumero()).thenReturn(1);
		when(c1.getPalo()).thenReturn(Palo.Diamante);
		when(c2.getNumero()).thenReturn(1);
		when(c2.getPalo()).thenReturn(Palo.Pica);
		when(c3.getNumero()).thenReturn(1);
		when(c3.getPalo()).thenReturn(Palo.Corazon);
		when(c4.getNumero()).thenReturn(1);
		when(c4.getPalo()).thenReturn(Palo.Trebol);
		when(c5.getNumero()).thenReturn(13);
		when(c5.getPalo()).thenReturn(Palo.Diamante);
		ps.registrarCartas(this.c1,this.c2,this.c3,this.c4,this.c5);
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
		when(c1.getNumero()).thenReturn(1);
		when(c1.getPalo()).thenReturn(Palo.Diamante);
		when(c2.getNumero()).thenReturn(1);
		when(c2.getPalo()).thenReturn(Palo.Pica);
		when(c3.getNumero()).thenReturn(1);
		when(c3.getPalo()).thenReturn(Palo.Corazon);
		when(c4.getNumero()).thenReturn(1);
		when(c4.getPalo()).thenReturn(Palo.Trebol);
		when(c5.getNumero()).thenReturn(13);
		when(c5.getPalo()).thenReturn(Palo.Diamante);
		ps.registrarCartas(this.c1,this.c2,this.c3,this.c4,this.c5);
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
