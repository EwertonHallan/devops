package br.edu.ifal.calculadorastring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.calculadorastring.CalculadoraString;


public class CalculadoraStringTest {
	CalculadoraString calculadora = new CalculadoraString();
	
	@Before
	public void inicializa () {
	}
	
	@Test
	public void AdicionarNumerosStrings() {
		assertThat(calculadora.adicionar(""), equalTo("0"));
		assertThat(calculadora.adicionar("1,2"), equalTo("3"));
		assertThat(calculadora.adicionar("1,2,3"), equalTo("6"));
		assertThat(calculadora.adicionar("-1,-2,3"), equalTo("0"));
		assertThat(calculadora.adicionar("1,-2,3"), equalTo("2"));
		assertThat(calculadora.adicionar("1,2,-3"), equalTo("0"));
		assertThat(calculadora.adicionar("-1,-2,-3"), equalTo("-6"));
		assertThat(calculadora.adicionar("0,0,0"), equalTo("0"));
		assertThat(calculadora.adicionar("10,20,30"), equalTo("60"));
		assertThat(calculadora.adicionar("1 , 2 "), equalTo("3"));
	}

}
