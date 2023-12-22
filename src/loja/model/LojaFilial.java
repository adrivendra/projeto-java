package loja.model;

public class LojaFilial extends Loja{
	private int aniversario;

    public LojaFilial(int idProduto, String nomeVendedor, String nomeProduto, float preco, int aniversario) {
		super(idProduto, aniversario, nomeVendedor, nomeProduto, preco);
		this.aniversario = aniversario;
	}
	public int getAniversario() {
		return aniversario;
	}
	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da filial: " + this.aniversario);
	}
}
