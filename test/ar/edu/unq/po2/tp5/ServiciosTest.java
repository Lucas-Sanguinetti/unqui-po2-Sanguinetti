package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Servicios;

public class ServiciosTest {

	private Servicios s;
	
	@BeforeEach
	public void setup(){
		this.s = new Servicios(15d,5);
	}
	
	@Test
	public void testCaja1() {
		double pr1 = 75d;
		
		assertEquals(s.getPrecio(),pr1);

	}
	
	
}
