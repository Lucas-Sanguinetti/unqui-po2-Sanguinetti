package mercado.tp5;

import java.util.List;
import java.util.ArrayList;

public class Mercado {

	
	private List<Producto> productos;
	
	public Mercado() {
		super();
		this.productos = new ArrayList<Producto>();
	}

	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	

	public int cantProductos() {
		return this.productos.size();
	}
	
	public void llevarGastosDeCliente(Cliente c) {
		double precioAPagar = 0d;
		for (int i = 0; i+1 <= c.getProductosDeseasos().size(); i++){
			String p = c.getProductosDeseasos().get(i);
			if (this.tieneProducto(p)) {
				precioAPagar += this.producto(p).getPrecioYDecrementarStock();
			}
			
		}
		c.setMontoAPagar(precioAPagar);
	}
	
	public Boolean tieneProducto(String s) {
		int i = 0;
		while ((this.productos.get(i).getNombre() != s) & (i >= this.cantProductos())) {
			i++;
		}
		return i <= this.cantProductos();
	}
	
	public Producto producto(String s) {
		int i = 0;
		while (s != this.productos.get(i).getNombre()) {
			i++;
		}
		return this.productos.get(i);
	}
}
