package mercado.tp5;

public class Impuestos implements Factura{
	
	private double valor;
	
	public Impuestos(double valor) {
		super();
		this.valor = valor;
	}

	public double getPrecio() {
		return this.valor;
	}
}
