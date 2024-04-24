package mercado.tp5;

import java.util.List;
import java.util.ArrayList;


public class Cliente {

	
	public String nombre;
	public List<String> productosDeseasos;
	public Double montoAPagar;
	public Mercado mercado;
	

	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.productosDeseasos = new ArrayList<String>();
		this.montoAPagar = 0d;
		this.mercado = null;
	}

	public void afiliarse(Mercado m) {
		this.mercado = m;
	}

	public List<String> getProductosDeseasos() {
		return productosDeseasos;
	}

	public Double getMontoAPagar() {
		mercado.llevarGastosDeCliente(this);
		return montoAPagar;
	}

	public void setMontoAPagar(Double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	public void desearProducto(String p) {
		this.productosDeseasos.add(p);
	
	}
	
}
