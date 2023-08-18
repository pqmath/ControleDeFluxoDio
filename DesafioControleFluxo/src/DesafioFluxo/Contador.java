package DesafioFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro:");
		Integer parametroUm = sc.nextInt();
		
		System.out.print("Digite o segundo parâmetro:");
		Integer parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior do que o primeiro.");
		}

		int contagem = parametroDois - parametroUm;
		for(int i=1; i<=contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
		
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException();
		}

		}
	}
