package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	
	@Test
	public void deveSomarDoisValores(){
		
		//cenario
		int a = 5;
		int b = 3;
		Calculadora calc = new Calculadora();
		
		//acao
		int resultado = calc.somar(a,b);
		
		//verificacao
		Assert.assertEquals(8, resultado);
		
		
	}
	
	@Test
	public void deveSubtrairDoisValores(){
		//cenario
		int a = 8;
		int b = 5;
		Calculadora calc = new Calculadora();
				
		//acao
		int resultado = calc.subtrair(a,b);
				
		//verificacao
		Assert.assertEquals(3, resultado);	
		
	}
	
	@Test
	public void deveDividirDoisValores(){
		//cenario
		int a = 6;
		int b = 2;
		Calculadora calc = new Calculadora();
				
		//acao
		int resultado = calc.dividir(a,b);
				
		//verificacao
		Assert.assertEquals(3, resultado);
	}
}
