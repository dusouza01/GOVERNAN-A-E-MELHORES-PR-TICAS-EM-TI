import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void testSomar2com3() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(2, 3);
		assertEquals(resultado, 5);
	}
	
	@Test
	public void testSubtrair2de3() {
		Calculadora calc = new Calculadora();
		int resultado = calc.subtrair(2, 3);
		assertEquals(resultado, 1);
	}
	
	@Test
	public void testDividir5por2() {
		Calculadora calc = new Calculadora();
		double resultado = calc.dividir(5, 2);
		assertEquals(resultado, 2.5, 2);
	}

}
