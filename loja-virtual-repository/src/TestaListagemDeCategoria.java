import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.CategoriaDAO;
import factory.ConnectionFactory;
import modelo.Categoria;
import modelo.Produto;

public class TestaListagemDeCategoria {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> ListaDeCategorias = categoriaDAO.listarComProdutos();
			ListaDeCategorias.stream().forEach(lct -> {
				//System.out.println(lct.getNome());

				for (Produto produto : lct.getProdutos()) {
					System.out.println(lct.getNome() + " - " + produto.getNome());
				}

//				try {
//					for(Produto produto: new ProdutoDAO(connection).buscar(lct)) {
//						System.out.println(lct.getNome() + " - " + produto.getNome());
//					}
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
			});
		}
	}

}
