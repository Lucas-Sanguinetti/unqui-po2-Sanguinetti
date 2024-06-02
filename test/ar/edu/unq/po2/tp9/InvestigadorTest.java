package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestigadorTest {

	private Investigador i;

	@BeforeEach
	void setUp() {
		this.i  = new Investigador("juan");
	}
	
	@Test
	void nombreTest() {
		assertEquals(i.getName(),"juan");
	}
	
	@Test
	void suscriberTest() {
		Publicadora p = mock(Publicadora.class);
		when(p.suscribe(i)).thenReturn(p);
		i.suscribe(p);
		assertTrue(i.getPublicadora().equals(p));
	}
	
	@Test
	void preferenciasTest() {
		i.addTitulo("Titulo");
		i.addAutor("autor");
		i.addAfiliacion("Afiliacion");
		i.addTipo(Tipo.investigacion);
		i.addLocalizacion("Localizacion");
		i.addPalabraClave("Palabra Clave");
		assertTrue(i.getTitulosInteres().contains("Titulo"));
		assertTrue(i.getAutoresInteres().contains("autor"));
		assertTrue(i.getAfiliacionesInteres().contains("Afiliacion"));
		assertTrue(i.getTiposInteres().contains(Tipo.investigacion));
		assertTrue(i.getLocalizacionesInteres().contains("Localizacion"));
		assertTrue(i.getPalabrasClavesInteres().contains("Palabra Clave"));
	}

}
