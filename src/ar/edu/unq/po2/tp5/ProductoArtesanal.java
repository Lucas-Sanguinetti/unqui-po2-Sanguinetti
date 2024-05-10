package ar.edu.unq.po2.tp5;

public class ProductoArtesanal extends Producto{

	public ProductoArtesanal(String nombre, Double precio, Integer stock) {
		super(nombre, precio, stock);
	}

	public double getPrecio() {
		double p = 0d;
		if (this.tieneStock()) {
			this.decrementarStock();
			p = this.precio;
		}
		return p;
	}
	
}
