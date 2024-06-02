package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Carpeta implements FyleSystem{

	public String nombre;
	public int tamaño;
	public int modificacion;
	public List<FyleSystem> archivos;
	
	public Carpeta(String nombre, int tamaño, int modificacion) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.modificacion = modificacion;
		this.archivos = new ArrayList<FyleSystem>();
	}

	@Override
	public int size() {
		Stream<FyleSystem> s = this.archivos.stream();
		return this.tamaño + s.mapToInt(a -> a.size()).sum();
	}

	@Override
	public void printStructure() {
		String s = "";
		for (int i = 0; i+1 <= this.profundidad(); i++){
			s += " ";
		}
		s += this.nombre;
		System.out.println(s);
	}

	public int profundidad() {
		Stream<FyleSystem> s = this.archivos.stream();
		int p = s.map(a -> a.profundidad())
				.max(Comparator.comparing(a -> a)).orElse(0);
		return 1 + p;
	}

	public int getModificacion() {
		return modificacion;
	}


	@Override
	public FyleSystem lastModified() {
		Stream<FyleSystem> s = this.archivos.stream();
		FyleSystem f = s.max(Comparator.comparing(a ->  a.getModificacion())).get();
		return  this.masNuevo(f);
	}

	private FyleSystem masNuevo(FyleSystem f) {
		FyleSystem c = this;
		if (f.getModificacion() > c.getModificacion()) {
			c = f;
		}
		return c;
	}

	@Override
	public FyleSystem oldestModified() {
		Stream<FyleSystem> s = this.archivos.stream();
		FyleSystem f = s.min(Comparator.comparing(a -> ((FyleSystem) a).getModificacion())).orElse(this);
		return  this.masViejo(f);
	}
	
	private FyleSystem masViejo(FyleSystem f) {
		FyleSystem c = this;
		if (f.getModificacion() < c.getModificacion()) {
			c = f;
		}
		return c;
	}

	public void addArchivo(Archivo a) {
		this.archivos.add(a);
		
	}
	
	

}
