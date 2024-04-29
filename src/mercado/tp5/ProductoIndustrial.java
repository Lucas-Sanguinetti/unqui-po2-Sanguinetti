package mercado.tp5;

public class ProductoIndustrial extends Producto {

	public ProductoIndustrial(String nombre, Double precio, Integer stock) {
		super(nombre, precio, stock);
	}

	public double getPrecio() {
		double p = 0d;
		if (this.tieneStock()) {
			this.decrementarStock();
			p = (this.precio)*0.9;
		}
		return p;
	}
	
}
