package tpStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ClubDeDeportes {

	private List<ActividadSemanal> actividades;

	public ClubDeDeportes() {
		this.actividades = new ArrayList<ActividadSemanal>();
	}
	
	public void add(ActividadSemanal a) {
		this.actividades.add(a);
	}
	
	public List<ActividadSemanal> todasLasDelDeporte(String d){
		Stream<ActividadSemanal> stream = this.actividades.stream();
		return stream.filter(a -> a.esDeDeporte(d)).toList();
	}
	
	public List<ActividadSemanal> todasLasComplejidad(int c){
		Stream<ActividadSemanal> stream = this.actividades.stream();
		return stream.filter(a -> a.esDeComplejidad(c)).toList();
	}

	public Double horasTotales() {
		Stream<ActividadSemanal> stream = this.actividades.stream();
		return stream.mapToDouble(a -> a.getDuracion()).sum();

	}

	public ActividadSemanal masBaratoDeDeporte(String string) {
		Stream<ActividadSemanal> stream = this.todasLasDelDeporte(string).stream();
		return stream.min(Comparator.comparing(a -> a.getPrecio())).get();
	}
}
