package loja.model;

public abstract class Loja {

	private int idProduto;
	private String nomeVendedor;
	private String nomeProduto;
	private int tipo;
	private float preco;

	public Loja(int idProduto, int tipo, String nomeVendedor, String nomeProduto, float preco) {
		super();
		this.idProduto = idProduto;
		this.nomeVendedor = nomeVendedor;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("ID do Produto: " + this.idProduto);
		System.out.println("Nome do Vendedor: " + this.nomeVendedor);
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("Preço: " + this.preco);

	}
}
