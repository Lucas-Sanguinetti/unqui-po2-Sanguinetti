package ar.edu.unq.po2.tp7;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{

	private ListaDePalabrasOrdenadas lista;
	
	public ListaDePalabrasOrdenadasAdapter() {
		super();
		this.lista = new ListaDePalabrasOrdenadas();
	}

	@Override
	public void addElement(String element) {
		this.lista.agregarPalabra(element);
	}
	
	@Override
	public int getSize() {
		return this.lista.cantidadDePalabras();
	}
	
	@Override
	public String elementAt(int index) {
		return this.lista.getPalabraDePosicion(index);
	}
	
	@Override
	public String get(int index) {
		return this.lista.getPalabraDePosicion(index);
	}
	
	
	
}
