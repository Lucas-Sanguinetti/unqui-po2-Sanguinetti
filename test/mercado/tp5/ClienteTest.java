package mercado.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Cliente c;
	
	
	@BeforeEach
	public void setup(){

		c = new Cliente("Juan");
	}
	
	@Test
	public void testPrecios() {
		Mercado m = new Mercado();
		double pr1 = 95d;
		Producto p1 = new ProductoArtesanal("Arroz", 50d, 2);
		Producto p2 = new ProductoIndustrial("Leche", 50d, 1);
		
		c.afiliarse(m);
		c.desearProducto(p1.getNombre());
		c.desearProducto(p2.getNombre());
		m.addProducto(p1);
		m.addProducto(p2);
		
		assertEquals(c.getMontoAPagar(), pr1);
	}
	
	@Test
	public void testPrecios2() {
		Mercado m = new Mercado();
		double pr1 = 50d;
		Producto p1 = new ProductoArtesanal("Arroz", 50d, 2);
		Producto p2 = new ProductoIndustrial("Leche", 50d, 0);
		
		c.afiliarse(m);
		c.desearProducto(p1.getNombre());
		c.desearProducto(p2.getNombre());
		m.addProducto(p1);
		m.addProducto(p2);
		
		assertEquals(c.getMontoAPagar(), pr1);
	}
}
