package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean b, Double d) {
		super(nombre, precio*(1 - (d/100)), b);
	}
}
