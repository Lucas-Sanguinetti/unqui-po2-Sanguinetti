package mercado.tp5;

public class ProductoArtesanal extends Producto{

	public ProductoArtesanal(String nombre, Double precio, Integer stock) {
		super(nombre, precio, stock);
	}

	public double getPrecio() {
		return this.precio;
	}
	
}
