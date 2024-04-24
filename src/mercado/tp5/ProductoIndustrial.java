package mercado.tp5;

public class ProductoIndustrial extends Producto {

	public ProductoIndustrial(String nombre, Double precio, Integer stock) {
		super(nombre, precio, stock);
	}

	public double getPrecio() {
		return (this.precio*0.9);
	}
	
}
