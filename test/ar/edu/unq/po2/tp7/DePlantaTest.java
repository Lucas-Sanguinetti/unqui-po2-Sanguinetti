package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DePlantaTest {

	
	private DePlanta t;
	private DePlanta t2;
	
	@BeforeEach
	public void setUp() {
		t = new DePlanta(2);
		t2 = new DePlanta(0);
	}

	@Test
	void sueldoPorHijoTest() {
		assertEquals(t.sueldoPorHijos(),  300);
		assertEquals(t2.sueldoPorHijos(), 0);
	}
	
	@Test
	void sueldoBasicoTest() {
		assertEquals(t.sueldoBasico(),  3000);
		assertEquals(t2.sueldoBasico(), 3000);
	}
	
	@Test
	void sueldoTest() {
		assertEquals(t.sueldo(), 3300);
		assertEquals(t2.sueldo(), 3000);
	}

}
