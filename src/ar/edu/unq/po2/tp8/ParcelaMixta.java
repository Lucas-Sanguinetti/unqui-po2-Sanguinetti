package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParcelaMixta extends Parcela {

	private List<Parcela> parcelas;
	
	

	public ParcelaMixta() {
		super();
		this.parcelas = new ArrayList<Parcela>();
	}



	public void agregar(Parcela p) {
		this.parcelas.add(p);
		
	}
	
	public double precio() {
		Stream<Parcela> s = this.parcelas.stream();
		return s.mapToDouble(p -> p.precio()/4).sum();
		
	}

}
