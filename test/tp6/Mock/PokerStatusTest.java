package tp6.Mock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus ps;
	
	@BeforeEach
	void setup() {
		this.ps = new PokerStatus();
	}

	@Test
	void test() {
		assertTrue(ps.esPoker("1d","1p","1c","1t","kd"));
	}

}
