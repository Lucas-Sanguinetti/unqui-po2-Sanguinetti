package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaDeMixtaTest {

	private ParcelaMixta p;

	@BeforeEach
	void setup() {
		this.p = new ParcelaMixta();

	}
	
	@Test
	void test1() {
		this.p.agregar(new ParcelaDeTrigo());
		this.p.agregar(new ParcelaDeSoja());
		this.p.agregar(new ParcelaDeTrigo());
		this.p.agregar(new ParcelaDeTrigo());
		assertEquals(this.p.precio(),350d);
		

	}

}
