package tp6.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PokerStatus {

	private List<String> cartas;
	

	public PokerStatus() {
		super();
		this.cartas = new ArrayList<String>();
	}

	public boolean esPoker(String c1, String c2, String c3, String c4, String c5) {
		String CartaComparador1 = c1.substring(0, c1.length() - 1);
		String CartaComparador2 = c2.substring(0, c2.length() - 1);
		this.cartas.add(CartaComparador1);
		this.cartas.add(CartaComparador2);
		this.cartas.add(c3.substring(0, c3.length() - 1));
		this.cartas.add(c4.substring(0, c4.length() - 1));
		this.cartas.add(c5.substring(0, c5.length() - 1));
		return (this.hayPoker1(CartaComparador1) | this.hayPoker2());
	}
	
	public boolean hayPoker1(String CartaComparador1) {
		
		Stream<String> stream = this.cartas.stream();
		return stream.filter(a -> a==CartaComparador1).toList().size() == 4;
		
	}
	
	public boolean hayPoker2() {
		return false;	
	}


}
