package mercado.tp5;

import java.util.List;
import java.util.ArrayList;

public class Caja {

	private List<Producto> productos;

	public Caja() {
		super();
	}
	
	public void registrar(Producto p) {
		this.productos.add(p);	
	}
	
	public double facturar() {
		double total = 0;
		for (int i = 0; (i+1) <= productos.size(); i++) {
			total += productos.get(i).getPrecio();
		}
		return total;
	}
}

