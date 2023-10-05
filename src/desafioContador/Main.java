package desafioContador;

import java.util.Scanner;

public class Main {	
	
	//Metodo utilizado para realizar a contagem no console.
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		//valida se parametro Um > parametroDois
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("imprimindo o numero: " + i);
			}
		} else {
			throw new ParametrosInvalidosException();
		}

	}
		
	public static void main(String[] args) {
		//Criando o menu para obter os parametros.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		//Consumo dos parametros utilizando um bloco try.
		try {
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException ex) {
			System.out.println(ex.toString());
		}
		
		sc.close();
	}
}

