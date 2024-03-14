package FontesAppElevador;

public class Calculadora {
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	private double resultado;
	
	
	public double somar(double valor1 , double valor2) {
		this.resultado = valor1+valor2;
		return this.resultado;
		
		
	}
	
	public double subtrair(double valor1 , double valor2) {
		this.resultado = valor2 - valor1;
		return this.resultado;
	}

}
