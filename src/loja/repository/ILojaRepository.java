package loja.repository;
import loja.model.Loja;


public interface ILojaRepository {
	// CRUD da Loja
	public void procurarPorNumero(int idProduto);
	public void listarTodas();
	public void cadastrar(Loja loja);
	public void atualizar(Loja loja);
	public void deletar(int idProduto);



}	
