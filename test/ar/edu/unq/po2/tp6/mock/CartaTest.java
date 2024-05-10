package ar.edu.unq.po2.tp6.mock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.mock.Carta;
import ar.edu.unq.po2.tp6.mock.Palo;

class CartaTest {

	
	private Carta c;
	
	@BeforeEach
	void setup() {
		this.c = new Carta(4,Palo.Diamante);
	}
	
	@Test
	void lasCartasSabenSuValorTest() {
		assertEquals(c.getNumero(), 4);
		assertEquals(c.getPalo(), Palo.Diamante);
	}
	
	@Test
	void lasCartasSabenSiSonMayoresTest() {
		Carta c2 = new Carta(2,Palo.Trebol);
		assertTrue(c.esMayorQue(c2));
	}
	
	@Test
	void lasCartasSabenSiSonMenoresTest() {
		Carta c2 = new Carta(5,Palo.Trebol);
		assertFalse(c.esMayorQue(c2));
	}
	
	@Test
	void lasCartasSabenSiTienenElMismoPaloTest() {
		Carta c2 = new Carta(5,Palo.Trebol);
		assertFalse(c.tieneMismoPalo(c2));
	}
	
	@Test
	void lasCartasSabenSiTienenElMismoPalo2Test() {
		Carta c2 = new Carta(5,Palo.Diamante);
		assertTrue(c.tieneMismoPalo(c2));
	}

}
