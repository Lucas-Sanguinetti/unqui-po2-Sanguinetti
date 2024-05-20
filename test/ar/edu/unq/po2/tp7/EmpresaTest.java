package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	private Empresa e;
	private Empleado em1;
	private Empleado em2;
	
	@BeforeEach
	public void setUp() {
		this.e = new Empresa();
		this.em1 = mock(Empleado.class);
		this.em2 = mock(Empleado.class);
		e.contratar(em1);
		e.contratar(em2);
	
	}
	
	
	@Test
	void seLePagaAUnEmpleadoTest() {
		e.ganarDinero(500);
		when(em1.sueldo()).thenReturn(200);
		e.pagarA(em1);
		verify(this.em1, atLeast(1)).sueldo();
		verify(this.em1, atLeast(1)).ganar(200);

	}
	
	@Test
	void seLePagaAVariosEmpleadoTest() {
		e.ganarDinero(500);
		when(em1.sueldo()).thenReturn(200);
		when(em2.sueldo()).thenReturn(150);
		e.pagarA(em1);
		e.pagarA(em2);
		verify(this.em1, atLeast(1)).sueldo();
		verify(this.em1, atLeast(1)).ganar(200);
		verify(this.em2, atLeast(1)).sueldo();
		verify(this.em2, atLeast(1)).ganar(150);

	}

}
