package supermercado.tp4;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	private String direccion;
	private String nombre;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double total = 0;
		for (int i = 0; (i+1) <= productos.size(); i++) {
			total += productos.get(i).getPrecio();
		}
		return total;
	}
	
}
