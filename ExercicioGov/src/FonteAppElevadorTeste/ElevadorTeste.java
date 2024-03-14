package FonteAppElevadorTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import FontesAppElevador.Elevador;

public class ElevadorTeste {

	Elevador elevadorX = new Elevador();

	@Before
	public void setUp() throws Exception {
		elevadorX.setCargaAtual(0);
	}
	
	@Test
	public void testeIncrementarPessoaCom100Kg() {
		elevadorX.entrarNoElevador(100);
		assertEquals(elevadorX.getCargaAtual(), 100, 0);
	}

	@Test
	public void testeIncrementarPessoaCom50KgMaisOutraDe100Kg() {
		elevadorX.entrarNoElevador(50);
		elevadorX.entrarNoElevador(100);
		assertEquals(elevadorX.getCargaAtual(), 150, 0);
	}
	
	@Test
	public void testeRetirarPessoaCom80KgDepoisdeEmbarcarPessoaCom100Kg() {
		elevadorX.setCargaAtual(100);
		elevadorX.sairDoelevador(80);
		assertEquals(elevadorX.getCargaAtual(), 20, 0);
	}
	
	@Test
	public void testeAlertaPessoaCom50KgMaisOutraDe100Kg() {
		elevadorX.setCargaAtual(50);
		boolean alerta = elevadorX.avaliarpeso(elevadorX.getCargaAtual());
		assertFalse(alerta);
	}
	
	@Test
	public void testeAlertaPessoaCom120KgMaisOutraDe100Kg() {
		elevadorX.setCargaAtual(210);
		boolean alerta = elevadorX.avaliarpeso(elevadorX.getCargaAtual());
		assertTrue(alerta);
	}

}
