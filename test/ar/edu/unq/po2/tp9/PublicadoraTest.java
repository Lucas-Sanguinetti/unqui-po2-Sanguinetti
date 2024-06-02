package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicadoraTest {

	private Publicadora p;

	@BeforeEach
	void test() {
		this.p = new Publicadora();
	}
	
	@Test
	void agregarArticulosTest() {
		Articulo a = mock(Articulo.class);
		this.p.addArticulo(a);
		assertEquals(p.getArticulos().size(),1);
	}
	
	@Test
	void agregarSuscriptores() {
		Investigador i = mock(Investigador.class);
		this.p.suscribe(i);
		assertEquals(p.getSuscribers().size(),1);
	}

	@Test
	void removerSuscriptores() {
		Investigador i = mock(Investigador.class);
		this.p.suscribe(i);
		this.p.unsuscribe(i);
		assertEquals(p.getSuscribers().size(),0);
	}
	
	@Test
	void notificaTest() {
		Investigador i = mock(Investigador.class);
		Articulo a = mock(Articulo.class);
		List<String> s = new ArrayList<String>();
		s.add("1");
		when(i.getAutoresInteres()).thenReturn(s);
		when(a.getAutores()).thenReturn(s);
		this.p.suscribe(i);
		this.p.addArticulo(a);
		verify(i, atLeast(1)).update();
		
	}
	
	@Test
	void notificaTest2() {
		Investigador i = mock(Investigador.class);
		Articulo a = mock(Articulo.class);
		List<String> s = new ArrayList<String>();
		List<Tipo> s2 = new ArrayList<Tipo>();
		s.add("1");
		s2.add(Tipo.investigacion);
		List<String> s3 = new ArrayList<String>();
		s3.add("3");
		when(i.getAutoresInteres()).thenReturn(s);
		when(i.getAfiliacionesInteres()).thenReturn(s);
		when(i.getLocalizacionesInteres()).thenReturn(s);
		when(i.getPalabrasClavesInteres()).thenReturn(s);
		when(i.getTitulosInteres()).thenReturn(s);
		when(i.getTiposInteres()).thenReturn(s2);
		when(a.getAutores()).thenReturn(s3);
		when(a.getTitulo()).thenReturn("t");
		when(a.getAfiliaciones()).thenReturn(s3);
		when(a.getTipo()).thenReturn(Tipo.recopilatorio);
		when(a.getLugarPublicacion()).thenReturn("l");
		when(a.getPalabrasClave()).thenReturn(s3);
		this.p.suscribe(i);
		this.p.addArticulo(a);
		verify(i, times(0)).update();
		
	}

}
