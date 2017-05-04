package com.curso.ecosistema.integracion;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.curso.ecosistema.Calculadora;

public class TestCalculadoraIntegracion {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testIntegracion() {
		Calculadora calculadora = new Calculadora();
		
		int sumar = calculadora.sumar(1, 2);
		
		assertEquals(3,sumar);
	}

}
