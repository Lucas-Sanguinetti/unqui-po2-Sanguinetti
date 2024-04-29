package mercado.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Caja c;
	private Factura p1;
	private Producto p2;
	private Factura p3;
	private Factura p4;
	
	@BeforeEach
	public void setup(){
		this.c = new Caja(new AgenciaFalsa());
		this.p1 = new ProductoArtesanal("Arroz", 50d, 3);
		this.p2 = new ProductoIndustrial("Arroz", 50d, 1);
		this.p3 = new Impuestos(50d);
		this.p4 = new Servicios(50d, 1);
	}
	
	@Test
	public void testCaja1() {
		double pr1 = 50d;
		c.registrar(p1);
		
		assertEquals(c.facturar(),pr1);

	}
	
	@Test
	public void testCaja2() {
		double pr1 = 95d;
		c.registrar(p1);
		c.registrar(p2);
		
		assertEquals(c.facturar(),pr1);

	}
	
	@Test
	public void testCaja3() {
		double pr1 = 50d;
		p2.decrementarStock();
		c.registrar(p1);
		c.registrar(p2);
		
		
		assertEquals(c.facturar(),pr1);

	}
	
	@Test
	public void testCaja4() {
		double pr1 = 195d;
		c.registrar(p1);
		c.registrar(p2);
		c.registrar(p3);
		c.registrar(p4);
		
		
		assertEquals(c.facturar(),pr1);

	}
	
	
	
	
}
