package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {
	
	private Temporario t;
	private Temporario t2;
	
	@BeforeEach
	public void setUp() {
		t = new Temporario(40,true);
		t2 = new Temporario(0,false);
	}

	@Test
	void sueldoPorHijoTest() {
		assertEquals(t.sueldoPorHijos(),  100);
		assertEquals(t2.sueldoPorHijos(), 0);
	}

	@Test
	void sueldoPorHorasTest() {
		assertEquals(t.sueldoPorHoras(),  200);
		assertEquals(t2.sueldoPorHoras(), 0);
	}

	@Test
	void sueldoBasicoTest() {
		assertEquals(t.sueldoBasico(),  1000);
		assertEquals(t2.sueldoBasico(), 1000);
	}
	
	@Test
	void sueldoTest() {
		assertEquals(t.sueldo(), 1300);
	}
	
	
}
