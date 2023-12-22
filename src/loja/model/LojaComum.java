package loja.model;

public class LojaComum extends Loja {
	int dataCriacao;

	public LojaComum(int idProduto, int tipo, String nomeVendedor, String nomeProduto, float preco, int dataCriacao) {
		super(idProduto, tipo, nomeVendedor, nomeProduto, preco);
		this.dataCriacao = dataCriacao;
	}

	public int getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("A data de criação da loja foi: " + this.dataCriacao);
	}
}
