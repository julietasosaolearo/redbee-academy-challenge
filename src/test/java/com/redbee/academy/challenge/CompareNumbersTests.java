package com.redbee.academy.challenge;

class Main {
	public static void main(String[] args) {
		int numero1 = 50, numero2 = 100;
		System.out.printf("Número 1: %d. Número 2: %d\n", numero1, numero2);
		int minimo = minimo(numero1, numero2);
		System.out.printf("Minimo: %d\n", minimo);
		int maximo = maximo(numero1, numero2);
		System.out.printf("Máximo: %d\n", maximo);
	}

	public static int minimo(int numero1, int numero2) {
		if (numero1 < numero2)
			return numero1;
		// Si no, el mínimo es el número 2
		return numero2;
	}

	public static int maximo(int numero1, int numero2) {
		if (numero1 > numero2)
			return numero1;
		// Si no, el máximo es el número 2
		return numero2;
	}
}
