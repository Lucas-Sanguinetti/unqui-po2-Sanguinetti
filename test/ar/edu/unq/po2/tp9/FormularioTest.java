package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FormularioTest {

	
	private Formulario f;
	private Investigador i;
	
	@BeforeEach
	void setUp() {
		
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		List<Tipo> l4 = new ArrayList<Tipo>();
		List<String> l5 = new ArrayList<String>();
		List<String> l6 = new ArrayList<String>();
		l1.add("1");
		l2.add("2");
		l3.add("3");
		l4.add(Tipo.investigacion);
		l5.add("5");
		l6.add("6");
		this.i = mock(Investigador.class);
		this.f = new Formulario(i,l1,l2,l3,l4,l5,l6);
	}
	
	@Test
	void test() {
		
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		List<String> l3 = new ArrayList<String>();
		List<Tipo> l4 = new ArrayList<Tipo>();
		List<String> l5 = new ArrayList<String>();
		List<String> l6 = new ArrayList<String>();
		l1.add("1");
		l2.add("2");
		l3.add("3");
		l4.add(Tipo.investigacion);
		l5.add("5");
		l6.add("6");
		
		assertEquals(f.getTitulos(),l1);
		assertEquals(f.getAutores(),l2);
		assertEquals(f.getAfiliaciones(),l3);
		assertEquals(f.getTipos(),l4);
		assertEquals(f.getLocalizaciones(),l5);
		assertEquals(f.getPalabrasClave(),l6);
		assertEquals(f.getInvestigador(),this.i);
	
	}
	
	@Test
	void testContains() {
		assertTrue(f.tieneTitulo("1"));
		assertTrue(f.tieneAutor("2"));
		assertTrue(f.tieneAfiliacion("3"));
		assertTrue(f.tieneTipo(Tipo.investigacion));
		assertTrue(f.tieneLocalizacion("5"));
		assertTrue(f.tienePalabraClave("6"));
	}
	
	

}
