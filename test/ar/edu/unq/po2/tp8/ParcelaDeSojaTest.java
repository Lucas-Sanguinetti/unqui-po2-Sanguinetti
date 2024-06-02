package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParcelaDeSojaTest {

	
	
	@Test
	void test() {
		ParcelaDeTrigo p = new ParcelaDeTrigo();
		assertEquals(p.precio(),300);
	}

}
