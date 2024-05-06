package tpStreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClubDeDeportesTest {

	private ClubDeDeportes club;
	
	@BeforeEach
	public void setUp() {
		ActividadSemanal a1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 2d, Deporte.futbol, 17d);
		ActividadSemanal a2 = new ActividadSemanal(DiaDeLaSemana.JUEVES, 2d, Deporte.futbol, 19d);
		ActividadSemanal a3 = new ActividadSemanal(DiaDeLaSemana.MARTES, 3d, Deporte.jabalina, 20d);
		ActividadSemanal a4 = new ActividadSemanal(DiaDeLaSemana.JUEVES, 4d, Deporte.running, 14d);
		this.club = new ClubDeDeportes();
		
		this.club.add(a1);
		this.club.add(a2);
		this.club.add(a3);
		this.club.add(a4);
	}
	
	@Test
	void filtrado1Test() {
		assertEquals(club.todasLasDelDeporte("futbol").size(), 2);
	}
	
	@Test
	void filtrado2Test() {
		assertEquals(club.todasLasComplejidad(4).size(), 1);
	}
	
	@Test
	void horasTest() {
		assertEquals(club.horasTotales(), 11);
	}
	
	@Test
	void minimoTest() {
		ActividadSemanal a1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 1d, Deporte.futbol, 17d);
		club.add(a1);
		assertEquals(club.masBaratoDeDeporte("futbol"), a1);
	}
	
	

}
