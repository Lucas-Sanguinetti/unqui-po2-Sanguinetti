package mercado.tp5;

public class Servicios implements Factura {


	private double cpu;
	private Integer upp;
	
	public Servicios(double cpu, Integer upp) {
		super();
		this.cpu = cpu;
		this.upp = upp;
	}
	
	public double getPrecio() {
		return cpu*upp;
	}
	
}
