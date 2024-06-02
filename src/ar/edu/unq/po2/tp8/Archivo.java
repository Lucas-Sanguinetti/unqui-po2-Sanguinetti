package ar.edu.unq.po2.tp8;

public class Archivo implements FyleSystem{
		
	public String nombre;
	public int tamaño;
	public int modificacion;

	public Archivo(String nombre, int tamaño, int modificacion) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.modificacion = modificacion;
	}
	
	public int size() {
		return this.tamaño;
	}
	
	public void printStructure() {
		System.out.println(this.nombre);
	}
	
	public Archivo lastModified() {
		return this;
	}
	
	public Archivo oldestModified() {
		return this;
	}

	@Override
	public int profundidad() {
		return 1;
	}

	public int getModificacion() {
		return modificacion;
	}

	public void setModificacion(int modificacion) {
		this.modificacion = modificacion;
	}
	
	
}
