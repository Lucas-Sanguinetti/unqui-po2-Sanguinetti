package tpStreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionesDermatologicasTest {

	private LesionesDermatologicas l1;
	private LesionesDermatologicas l2;
	private LesionesDermatologicas l3;
	private LesionesDermatologicas l4;
	
	@BeforeEach
	public void setUp() {
		this.l1 = LesionesDermatologicas.ROJO;
		this.l2 = LesionesDermatologicas.AMARILLO;
		this.l3 = LesionesDermatologicas.GRIS;
		this.l4 = LesionesDermatologicas.MIEL;
	}
	
	@Test
	void descripcionTest() {
		assertEquals(l1.getDescripcion(), "lesion roja");
		assertEquals(l2.getDescripcion(), "lesion amarilla");
		assertEquals(l3.getDescripcion(), "lesion gris");
		assertEquals(l4.getDescripcion(), "lesion miel");
	}
	
	@Test
	void riesgoTest() {
		assertEquals(l1.getNivelDeRiesgo(), 3d);
		assertEquals(l2.getNivelDeRiesgo(), 3d);
		assertEquals(l3.getNivelDeRiesgo(), 3d);
		assertEquals(l4.getNivelDeRiesgo(), 3d);
	}
	
	@Test
	void nextTest() {
		assertEquals(l1.next(), l3);
		assertEquals(l2.next(), l4);
		assertEquals(l3.next(), l2);
		assertEquals(l4.next(), l1);
	}

}
