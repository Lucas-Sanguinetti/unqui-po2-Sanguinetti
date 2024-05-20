package ar.edu.unq.po2.tp7;

public abstract class Empleado {

	public int sueldo() {
		int sueldo = 0;
		sueldo += this.sueldoBasico() + this.sueldoPorHijos() + this.sueldoPorHoras();
		return (sueldo);
	}

	public int sueldoPorHijos() {
		return 0;
	}

	protected int sueldoPorHoras() {
		return 0;
	}
	
	public int sueldoBasico() {
		return 0;
	}


	public void ganar(int i) {
	}
}
	

