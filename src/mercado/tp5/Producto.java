package mercado.tp5;


public abstract class Producto {

	protected String nombre;
	protected Double precio;
	protected Integer stock;

	
	public Producto(String nombre, Double precio, Integer stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}


	public void aumentarPrecio(double n) {
		this.precio += n ;
	}
	
	
	public void decrementarStock() {
			this.stock -= 1;
		
	}
	
	public String getNombre() {
		return nombre;
	}


	public int getStock() {
		return this.stock;
	}
	
	public double getPrecioYDecrementarStock(){
		double p = 0d;
		if (this.stock >= 1) {
			this.decrementarStock();
			p = this.getPrecio();
		}
		return p;
	}
	
	public abstract double getPrecio();
	
}

