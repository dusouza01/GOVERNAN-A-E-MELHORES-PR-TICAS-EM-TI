package FonteAppElevadorTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppElevador.Calculadora;

public class CalculadoraTeste {
	
	Calculadora calc = new Calculadora();
	double resultadoCalc;

	@Test
	public void testSomarPeso100com200kg() {
		resultadoCalc = calc.somar(100, 200);
		assertEquals(resultadoCalc, 300,0);
	}
	
	@Test
	public void testeSomarPeso300com400kg() {
		resultadoCalc = calc.somar(300, 400);
		assertEquals(resultadoCalc, 700, 0);
	}
	
	@Test
	public void testSubtrairPeso50com100kg() {
		resultadoCalc = calc.subtrair(50, 100);
		assertEquals(resultadoCalc, 50,0);
	}
	
	

}
