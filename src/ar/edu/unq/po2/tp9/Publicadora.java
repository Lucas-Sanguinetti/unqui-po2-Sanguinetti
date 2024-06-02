package ar.edu.unq.po2.tp9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Publicadora {

	private List<Articulo> articulos;
	private List<Formulario> suscribers;
	
	public Publicadora() {
		super();
		this.articulos = new ArrayList<Articulo>();
		this.suscribers = new ArrayList<Formulario>();
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}


	public Publicadora suscribe(Investigador i) {
		Formulario f = new Formulario(i);
		this.suscribers.add(f);
		return this;	
	}

	public void addArticulo(Articulo a) {
		this.articulos.add(a);
		this.notifyS(a);
	}

	private void notifyS(Articulo a) {
		Stream<Formulario> s = this.suscribers.stream();
		s.filter( f -> f.leInteresa(a)).forEach(fs -> fs.update());
	}

	public List<Formulario> getSuscribers() {
		return this.suscribers;
	}

	public void unsuscribe(Investigador i) {
		Formulario f = this.getFormularioDe(i);
		this.suscribers.remove(f);
		
	}

	private Formulario getFormularioDe(Investigador i) {
		Stream<Formulario> s = this.suscribers.stream();
		Formulario f = s.filter(a -> a.getInvestigador().equals(i)).findFirst().get();
		return f;
	}

	public Articulo getArticuloNuevo() {
		return this.articulos.get(this.articulos.size()-1);
		
	}

}
