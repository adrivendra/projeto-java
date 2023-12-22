package loja.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import loja.model.Loja;
import loja.repository.ILojaRepository;

public class LojaController implements ILojaRepository {
	Scanner leia = new Scanner(System.in);
	private static List<Loja> produtos = new ArrayList<>();
	int idProduto = 0;

	@Override
	public void procurarPorNumero(int idProduto) {
		var loja = buscarNaCollection(idProduto);
		if (loja != null)
			loja.visualizar();
		else
			System.out.println("\nA Conta número: " + idProduto + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var loja : produtos) {
			loja.visualizar();
		}

	}

	@Override
	public void cadastrar(Loja loja) {
		produtos.add(loja);
		System.out.println("\nA Conta número: " + loja.getIdProduto() + " foi criado com sucesso!");

	}

	@Override
	public void atualizar(Loja loja) {
		var buscaProduto = buscarNaCollection(loja.getIdProduto());
		if (buscaProduto != null) {
			produtos.set(produtos.indexOf(buscaProduto), loja);
			System.out.println("\nA conta numero: " + loja.getIdProduto() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA conta numero: " + loja.getIdProduto() + " não foi encontrada!");

	}

	@Override
	public void deletar(int idProduto) {
		var loja = buscarNaCollection(idProduto);

		if (loja != null) {
			if (produtos.remove(loja) == true)
				System.out.println("\nA conta número: " + idProduto + " foi deletada com sucesso!");
		} else {
			System.out.println("\nA conta número" + idProduto + " não foi econtrada!");
		}

	}

	public int gerarNumero() {
		return ++idProduto;
	}

	public Loja buscarNaCollection(int idProduto) {
		for (var p : produtos) {
			if (p.getIdProduto() == idProduto) {
				return p;
			}
		}
		return null;
	}
}
