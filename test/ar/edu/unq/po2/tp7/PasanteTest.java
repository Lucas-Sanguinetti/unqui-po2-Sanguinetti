package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasanteTest {

	private Pasante t;
	private Pasante t2;
	
	@BeforeEach
	public void setUp() {
		t = new Pasante(40);
		t2 = new Pasante(0);
	}

	@Test
	void sueldoPorHorasTest() {
		assertEquals(t.sueldoPorHoras(),1600);
		assertEquals(t2.sueldoPorHoras(),0);
	}
	
	@Test
	void sueldoTest() {
		assertEquals(t.sueldo(),1600);
		assertEquals(t2.sueldo(),0);
	}


}
