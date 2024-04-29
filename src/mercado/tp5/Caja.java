package mercado.tp5;

import java.util.List;
import java.util.ArrayList;

public class Caja{

	private double precioTotal;
	private Agencia agencia;

	public Caja(Agencia agencia) {
		super();
		this.precioTotal = 0d;
		this.agencia = agencia;
	}
	
	public void registrar(Factura factura) {
		this.agencia.registrarPago(factura);
		this.precioTotal += factura.getPrecio();	

	}
	
	public double facturar() {
		return precioTotal;
	}
}

