package supermercado.tp4;

public class Producto {

	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public Producto(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public void aumentarPrecio(double n) {
		this.precio += n ;
	}
	
	
}
