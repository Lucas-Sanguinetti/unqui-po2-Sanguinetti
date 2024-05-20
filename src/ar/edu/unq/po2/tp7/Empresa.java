package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Empresa {

	private List<Empleado> empleados;
	private int presupuesto;
	
	
	
	public Empresa() {
		super();
		this.empleados = new ArrayList<Empleado>();
		this.presupuesto = 0;
	}

	public void contratar(Empleado em1) {
		this.empleados.add(em1);
	}

	public void pagarATodos() {
		Stream<Empleado> stream = this.empleados.stream();
		stream.map(e -> this.pagarA(e));
	}

	public Empleado pagarA(Empleado e) {
		int importeAPagar = e.sueldo();
		this.presupuesto -= importeAPagar;
		e.ganar(importeAPagar);
		return e;
		
	}

	public void ganarDinero(int i) {
		this.presupuesto += i;
		
	}
}
