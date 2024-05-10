package ar.edu.unq.po2.tp5;

public abstract class Producto implements Factura {

	protected String nombre;
	protected Double precio;
	protected Integer stock;

	
	public Producto(String nombre, Double precio, Integer stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	
	public void decrementarStock() {
		if (this.tieneStock()){
			this.stock = this.stock - 1;
		}

		
	}
	
	public Boolean tieneStock() {
		return this.stock >= 1;
	}
	
	
	public abstract double getPrecio();


	public Integer getStock() {
		return this.stock;
	}
	
}

