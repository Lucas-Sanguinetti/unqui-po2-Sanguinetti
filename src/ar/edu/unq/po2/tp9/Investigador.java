package ar.edu.unq.po2.tp9;

import java.util.ArrayList;
import java.util.List;

public class Investigador {

	
	private String name;
	private List<String> titulosInteres;
	private List<String> autoresInteres;
	private List<String> afiliacionesInteres;
	private List<Tipo>   tiposInteres;
	private List<String> localizacionesInteres;
	private List<String> palabrasClaveInteres;
	private Publicadora publicadora;


	public Investigador(String name) {
		super();
		this.name = name;
		this.titulosInteres = new ArrayList<String>();
		this.autoresInteres = new ArrayList<String>();
		this.afiliacionesInteres = new ArrayList<String>();
		this.tiposInteres = new ArrayList<Tipo>();
		this.localizacionesInteres = new ArrayList<String>();
		this.palabrasClaveInteres = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public Publicadora getPublicadora() {
		return publicadora;
	}
	public List<String> getTitulosInteres() {
		return titulosInteres;
	}
	public List<String> getAutoresInteres() {
		return autoresInteres;
	}
	public List<String> getAfiliacionesInteres() {
		return afiliacionesInteres;
	}
	public List<Tipo> getTiposInteres() {
		return tiposInteres;
	}
	public List<String> getLocalizacionesInteres() {
		return localizacionesInteres;
	}
	public List<String> getPalabrasClavesInteres() {
		return palabrasClaveInteres;
	}
	
	public void addPalabraClave(String s) {
		this.palabrasClaveInteres.add(s);
	}
	public void addTitulo(String s) {
		this.titulosInteres.add(s);
	}
	public void addAutor(String s) {
		this.autoresInteres.add(s);
	}
	public void addAfiliacion(String s) {
		this.afiliacionesInteres.add(s);
	}
	public void addLocalizacion(String s) {
		this.localizacionesInteres.add(s);
	}
	public void addTipo(Tipo t) {
		this.tiposInteres.add(t);
	}
	
	public void suscribe(Publicadora p) {
		this.publicadora = p.suscribe(this);
	}

	public void update() {
		this.publicadora.getArticuloNuevo();
		
	}
}
	
	
	
	

