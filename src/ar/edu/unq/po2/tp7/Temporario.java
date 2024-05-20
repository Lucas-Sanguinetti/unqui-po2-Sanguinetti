package ar.edu.unq.po2.tp7;

public class Temporario extends Empleado {

	private int horasTrabajadas;
	private boolean casadoOHijos;

	public Temporario(int i, boolean b) {
		this.horasTrabajadas = i;
		this.casadoOHijos = b;
	}

	@Override
	public int sueldoPorHoras() {
		return this.horasTrabajadas * 5;
	}
	
	@Override
	public int sueldoPorHijos() {
		if (this.casadoOHijos) {
			return 100;
		} else {
			return 0;
		}
	}
	
	@Override
	public int sueldoBasico() {
		return 1000;
	}
	

}
