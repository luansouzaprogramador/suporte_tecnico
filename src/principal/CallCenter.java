package principal;

import java.util.Scanner;

public class CallCenter {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		SuporteTecnico suporteTecnico;
		Interpretadora interpretadora;
		
		String resposta, problema;

		System.out.println("Bem-vindo ao sistema de Suporte Tecnico");
		
		while (true) {
			System.out.println("\nPressione <enter> para continuar ou digite 'sair' para sair do sistema.");
			resposta = teclado.nextLine().toLowerCase();
			
			if (resposta.equals("")) {
				System.out.print("Descreva seu problema de maneira sucinta: ");
				problema = teclado.nextLine().toLowerCase();
				
				suporteTecnico = new SuporteTecnico();
				interpretadora = new Interpretadora();
				interpretadora.interpreta(problema);
				
				System.out.println(suporteTecnico.solucao(interpretadora.getPalavrasChave()));
			} else if (resposta.equals("sair")) {
				break;
			} else {
				System.out.println("Opcao invalida!");
			}
		}
		
		System.out.println("\nObrigado por utilizar nossos serviços!");
		
		teclado.close();
	}
}
