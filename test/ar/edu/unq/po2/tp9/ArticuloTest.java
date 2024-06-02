package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticuloTest {

	
	@Test
	void testFuncionalidad1() {
		List<String> autores = new ArrayList<String>();
		List<String> afiliaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		autores.add("juan");
		afiliaciones.add("UNQ");
		palabrasClave.add("Prueba");
		Articulo a = new Articulo("articulo 1", autores, afiliaciones,Tipo.investigacion,"Argentina",palabrasClave);
		assertTrue(a.getTitulo().equals("articulo 1"));
		assertTrue(a.getAutores().contains("juan"));
		assertTrue(a.getAfiliaciones().contains("UNQ"));
		assertTrue(a.getTipo().equals(Tipo.investigacion));
		assertTrue(a.getLugarPublicacion().equals("Argentina"));
		assertTrue(a.getPalabrasClave().contains("Prueba"));
		
	}
	
	@Test
	void testFuncionalidad2() {
		List<String> autores = new ArrayList<String>();
		List<String> afiliaciones = new ArrayList<String>();
		List<String> palabrasClave = new ArrayList<String>();
		autores.add("juan");
		autores.add("pedro");
		afiliaciones.add("UNQ");
		afiliaciones.add("UDLP");
		palabrasClave.add("Prueba");
		palabrasClave.add("Ejemplo");
		Articulo a = new Articulo("articulo 1", autores, afiliaciones,Tipo.investigacion,"Argentina",palabrasClave);
		assertTrue(a.getAutores().contains("pedro"));
		assertTrue(a.getAfiliaciones().contains("UDLP"));
		assertTrue(a.getPalabrasClave().contains("Ejemplo"));
		
	}

}
