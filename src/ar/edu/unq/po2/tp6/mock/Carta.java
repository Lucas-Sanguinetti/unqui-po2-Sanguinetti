package ar.edu.unq.po2.tp6.mock;


public class Carta {
	
	private Integer numero;
	private Palo palo;
	

	public Carta(Integer numero, Palo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public Boolean esMayorQue(Carta c2) {
		return this.numero > c2.getNumero();
	}

	public Boolean tieneMismoPalo(Carta c2) {
		return this.palo == c2.getPalo();
	}
	
	public Boolean tieneMismoNumero(Carta c2) {
		return this.numero == c2.getNumero();
	}

	
}
