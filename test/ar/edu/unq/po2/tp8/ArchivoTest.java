package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

	
	private Archivo a;

	@BeforeEach
	void setup() {
		this.a = new Archivo("uno",2,200) ;
	}

	@Test
	void sizetest() {
		assertEquals(a.size(),2);
	}
	
	@Test
	void printStructuretest() {
		a.printStructure();
		assertTrue(true);
	}
	
	@Test
	void lasttest() {
		assertTrue(a.lastModified().equals(a));
	}
	
	@Test
	void oldesttest() {
		assertTrue(a.oldestModified().equals(a));
	}


}
