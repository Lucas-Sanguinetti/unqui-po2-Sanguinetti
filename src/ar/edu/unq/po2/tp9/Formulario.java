package ar.edu.unq.po2.tp9;

import java.util.List;
import java.util.function.BooleanSupplier;

public class Formulario {

	private Investigador investigador;
	private List<String> titulos;
	private List<String> autores;
	private List<String> afiliaciones;
	private List<Tipo>   tipos;
	private List<String> localizaciones;
	private List<String> palabrasClave;
	
	public Formulario(Investigador investigador,List<String> titulos, List<String> autores, List<String> afiliaciones, List<Tipo> tipos,
			List<String> localizaciones, List<String> palabrasClave) {
		super();
		this.investigador = investigador;
		this.titulos = titulos;
		this.autores = autores;
		this.afiliaciones = afiliaciones;
		this.tipos = tipos;
		this.localizaciones = localizaciones;
		this.palabrasClave = palabrasClave;
	}
	
	public Formulario(Investigador i) {
		this.investigador = i;
		this.titulos = i.getTitulosInteres();
		this.autores = i.getAutoresInteres();
		this.afiliaciones = i.getAfiliacionesInteres();
		this.tipos = i.getTiposInteres();
		this.localizaciones = i.getLocalizacionesInteres();
		this.palabrasClave = i.getPalabrasClavesInteres();
	}

	public Investigador getInvestigador() {
		return investigador;
	}
	public List<String> getTitulos() {
		return titulos;
	}
	public List<String> getAutores() {
		return autores;
	}
	public List<String> getAfiliaciones() {
		return afiliaciones;
	}
	public List<Tipo> getTipos() {
		return tipos;
	}
	public List<String> getLocalizaciones() {
		return localizaciones;
	}
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
	

	public Boolean tieneTitulo(String string) {
		return this.titulos.contains(string);
	}
	public Boolean tieneAutor(String string) {
		return this.autores.contains(string);
	}
	public Boolean tieneAfiliacion(String string) {
		return this.afiliaciones.contains(string);
	}
	public Boolean tieneTipo(Tipo tipo) {
		return this.tipos.contains(tipo);
	}
	public Boolean tieneLocalizacion(String string) {
		return this.localizaciones.contains(string);
	}
	public Boolean tienePalabraClave(String string) {
		return this.palabrasClave.contains(string);
	}

	public  void update() {
		this.investigador.update();
	}
	
	public boolean leInteresa(Articulo a) {
		Boolean b1 = this.tieneTitulo(a.getTitulo());
		Boolean b2 = this.tieneAlgunAutor(a.getAutores());
		Boolean b3 = this.tieneAlgunaAfiliacion(a.getAfiliaciones());
		Boolean b4 = this.tieneTipo(a.getTipo());
		Boolean b5 = this.tieneLocalizacion(a.getLugarPublicacion());
		Boolean b6 = this.tieneAlgunaPalabraClave(a.getPalabrasClave());
		return (b1|b2|b3|b4|b5|b6);
		
	}

	private Boolean tieneAlgunaPalabraClave(List<String> pc) {
		Boolean b = false;
		for (int i = 0; i+1 <= pc.size(); i++) {
			b = b | this.tienePalabraClave(pc.get(i));
		}
		return b;
	}

	private Boolean tieneAlgunaAfiliacion(List<String> pc) {
		Boolean b = false;
		for (int i = 0; i+1 <= pc.size(); i++) {
			b = b | this.tieneAfiliacion(pc.get(i));
		}
		return b;
	}



	private Boolean tieneAlgunAutor(List<String> a) {
		Boolean b = false;
		for (int i = 0; i+1 <= a.size(); i++) {
			b = b | this.tieneAutor(a.get(i));
		}
		return b;
	}

	
}