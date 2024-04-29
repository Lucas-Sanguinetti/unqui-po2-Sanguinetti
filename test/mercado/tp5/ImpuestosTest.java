package mercado.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestosTest {

	private Impuestos s;
	
	@BeforeEach
	public void setup(){
		this.s = new Impuestos(15d);
	}
	
	@Test
	public void testCaja1() {
		double pr1 = 15d;
		
		assertEquals(s.getPrecio(),pr1);

	}
	
}
