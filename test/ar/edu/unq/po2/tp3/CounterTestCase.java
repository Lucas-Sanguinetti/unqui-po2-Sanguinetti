package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception{
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(2);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(11);
		counter.addNumber(13);
		counter.addNumber(15);
		counter.addNumber(17);
		
	}
	
	@Test
	public void testPares() {
		int amount = counter.pares();
		
		assertEquals(amount, 1);
	}
	
	@Test
	public void testImpares() {
		int amount = counter.impares();
		
		assertEquals(amount, 9);
	}
	
	@Test
	public void testMultiplos() {
		int amount = counter.multiplosDe(3);
		
		assertEquals(amount, 3);
	}
	
	@Test
	public void testMasPares() {
		int amount = counter.masPares();
		System.out.println(counter.multiploMasAlto(3,9));
		assertEquals(amount, 2);
	}
	
	
}
