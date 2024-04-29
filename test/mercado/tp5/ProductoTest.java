package mercado.tp5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTest {

	private Producto p1;
	private Producto p2;
	
	@BeforeEach
	public void setup(){
		this.p1 = new ProductoArtesanal("Arroz", 50d, 3);
		this.p2 = new ProductoIndustrial("Arroz", 50d, 1);
	}
	
	@Test
	public void testPrecios() {
		double pr1 = 50d;
		double pr2 = 45d;
		assertEquals(p1.getPrecio(), pr1);
		assertEquals(p2.getPrecio(), pr2);

	}
	
	@Test
	public void testStock() {
		p1.decrementarStock();
		
		assertEquals(p1.getStock(), 2);

	}
	
	@Test
	public void testStock2() {
		p2.decrementarStock();
		p2.decrementarStock();
		
		assertEquals(p2.getStock(), 0);

	}
	
	
	

}
