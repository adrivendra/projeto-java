package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.LojaComum;
import loja.model.LojaFilial;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		LojaController lojas = new LojaController();
		int opcao, tipo, dataCriacao, aniversario, idProduto;
		String nomeVendedor, nomeProduto;
		float preco;
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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 9) {
				System.out.println("\nBAZAR DO ADRIANO! MUITO OBRIGADO POR VISITAR!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto");
				System.out.print("ID do produto: ");
				idProduto = leia.nextInt();
				leia.nextLine();
				System.out.print("Nome do vendedor: ");
				nomeVendedor = leia.nextLine();
				System.out.print("Nome do produto: ");
				nomeProduto = leia.nextLine();
				System.out.print("Preço do produto: ");
				preco = leia.nextFloat();
				do {
					System.out.println("Digite o tipo da Loja (1 - Filial ou 2 - Comum(Matriz)): ");
					tipo = leia.nextInt();

				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Aniversario da Filial: ");
					aniversario = leia.nextInt();
					lojas.cadastrar(
							new LojaFilial(lojas.gerarNumero(), tipo, nomeVendedor, nomeProduto, preco, aniversario));
				}
				case 2 -> {
					System.out.println("Digite o ano de criação da sua Loja Matriz(Comum): ");
					dataCriacao = leia.nextInt();
					lojas.cadastrar(
							new LojaComum(lojas.gerarNumero(), tipo, nomeVendedor, nomeProduto, preco, dataCriacao));
				}
				}
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos Produtos\n\n");
				lojas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produto - por número\n\n");
				System.out.println("Digite o ID do Produto: ");
				idProduto = leia.nextInt();
				lojas.procurarPorNumero(idProduto);
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");
				System.out.println("Digite o ID do produto: ");
				idProduto = leia.nextInt();
				var buscaProduto = lojas.buscarNaCollection(idProduto);

				if (buscaProduto != null) {
					tipo = buscaProduto.getTipo();

					System.out.print("Nome do vendedor: ");
					nomeVendedor = leia.nextLine();
					System.out.print("Nome do produto: ");
					nomeProduto = leia.nextLine();
					System.out.print("Preço do produto: ");
					preco = leia.nextFloat();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o dia de Aniversario da Loja: ");
						aniversario = leia.nextInt();

						lojas.atualizar(new LojaFilial(lojas.gerarNumero(), tipo, nomeVendedor, nomeProduto, preco,
								aniversario));
					}
					case 2 -> {
						System.out.println("Digite a data de Criação da Loja: ");
						dataCriacao = leia.nextInt();

						lojas.atualizar(new LojaComum(lojas.gerarNumero(), tipo, nomeVendedor, nomeProduto, preco,
								dataCriacao));
					}
					default -> {
						System.out.println("Tipo de conta inválido!!");
					}

					}

				} else {
					System.out.println("A conta não foi encontrada!");
				}
				keyPress();
				break;
			case 5:
				System.out.println("Apagar o Produto\n\n");
				System.out.println("Digite o número da conta: ");
				idProduto = leia.nextInt();

				lojas.deletar(idProduto);
				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
