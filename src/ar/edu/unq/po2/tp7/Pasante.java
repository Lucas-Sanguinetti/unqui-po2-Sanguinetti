package ar.edu.unq.po2.tp7;

public class Pasante extends Empleado {

	private int horaTrabajadas;

	public Pasante(int horas) {
		this.horaTrabajadas = horas;
	}
	
	protected int sueldoPorHoras() {
		return this.horaTrabajadas * 40;
	}
	

}
