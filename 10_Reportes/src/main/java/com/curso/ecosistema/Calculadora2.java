package com.curso.ecosistema;

public class Calculadora2 {
	public int sumar(int a, int b) {
		try {
			if (a < 0 && b > 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("------");
		System.out.println("------");
		System.out.println("------");
		System.out.println("------");
		System.out.println("-- en la calculadora --");
		System.out.println("------");
		System.out.println("------");
		System.out.println("------");
		System.out.println("------");
		
		return a + b;
	}
}
