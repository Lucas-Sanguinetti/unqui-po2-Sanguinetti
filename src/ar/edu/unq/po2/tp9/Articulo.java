package ar.edu.unq.po2.tp9;

import java.util.List;

public class Articulo {

	private String titulo;
	private List<String> autores;
	private List<String> afiliaciones;
	private Tipo tipo;
	private String lugarPublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autores, List<String> afiliaciones, Tipo tipo, String lugarPublicacion,
			List<String> palabrasClave) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.afiliaciones = afiliaciones;
		this.tipo = tipo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public List<String> getAfiliaciones() {
		return afiliaciones;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public String getLugarPublicacion() {
		return lugarPublicacion;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}

	

}
