package ar.edu.unq.po2.tp6.streams;

public class ActividadSemanal {

	
	private DiaDeLaSemana dia;
	private Double duracion;
	private Deporte actividad;
	private Double horaDeInicio;
	
	public ActividadSemanal(DiaDeLaSemana dia, Double duracion, Deporte actividad, Double horaDeInicio) {
		super();
		this.dia = dia;
		this.duracion = duracion;
		this.actividad = actividad;
		this.horaDeInicio = horaDeInicio;
	}

	public double getPrecio() {
		return (this.duracion * this.getPrecioHora() + actividad.getComplejidad() * 20d);
	}
	
	public double getPrecioHora(){
		double pph = 500d;
		if (this.esDiaDeAumento()){
			pph += 500d;
		}
		return pph; 
	}

	private boolean esDiaDeAumento() {
		return (this.dia == DiaDeLaSemana.JUEVES | this.dia == DiaDeLaSemana.VIERNES |this.dia == DiaDeLaSemana.SABADO | this.dia == DiaDeLaSemana.DOMINGO);
	}

	public boolean esDeDeporte(String d) {
		return actividad.es(d);
	}

	public boolean esDeComplejidad(int c) {
		return actividad.tieneComplejidad(c);
	}

	public Double getDuracion() {
		return duracion;
	}


}
