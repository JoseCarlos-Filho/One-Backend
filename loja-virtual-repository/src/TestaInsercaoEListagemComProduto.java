import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ProdutoDAO;
import factory.ConnectionFactory;
import modelo.Produto;
//DAO - DATA ACCESS OBJECT - OBJETO DE ACESSO A DADOS
public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {

		Produto game = new Produto("Game", "Video Game");

		try (Connection con = new ConnectionFactory().recuperarConexao()) {

			//new ProdutoDAO(con).salvar(game);
			ProdutoDAO produtoDao = new ProdutoDAO(con);
			produtoDao.salvar(game);
			
			List<Produto> ListaDeProdutos = produtoDao.listar();
			ListaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		//System.out.println(comoda);

	}

}
