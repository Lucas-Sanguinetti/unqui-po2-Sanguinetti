package ar.edu.unq.po2.tp7;

public class DePlanta extends Empleado{

	private int cantHijos;

	public DePlanta(int i) {
		this.cantHijos = i;
	}
	
	public int sueldoPorHijos() {
		return this.cantHijos * 150;
	}

	
	public int sueldoBasico() {
		return 3000;
	}
}
