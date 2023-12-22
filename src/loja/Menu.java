package loja;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BAZAR DO ADRIANO                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBAZAR DO ADRIANO! MUITO OBRIGADO POR VISITAR!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				break;
			case 2:
				System.out.println("Listar todos Produtos\n\n");

				break;
			case 3:
				System.out.println("Buscar Produto - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");

				break;
			case 5:
				System.out.println("Apagar o Produto\n\n");

				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Adriano Vendramini");
		System.out.println("Adriano Vendramini produções");
		System.out.println("*********************************************************");
	}

}
