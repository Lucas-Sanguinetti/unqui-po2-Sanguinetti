package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {

	private Carpeta c;
	private Archivo a;
	private Archivo b;

	@BeforeEach
	void setup() {
		this.c = new Carpeta("uno",3,0000);
		this.a = new Archivo("dos",2,0300);
		this.b = new Archivo("tres",2,0200);
		c.addArchivo(a);
		c.addArchivo(b);
	}

	@Test
	void sizetest() {
		assertEquals(c.size(),7);
	}
	
	@Test
	void printStructuretest() {	
		c.printStructure();
		assertTrue(true);
	}
	
	@Test
	void lasttest() {
		assertTrue(c.lastModified().equals(a));
	}
	
	@Test
	void oldesttest() {
		assertTrue(c.oldestModified().equals(c));
	}

}
