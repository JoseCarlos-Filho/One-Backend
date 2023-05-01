package loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import loja.dao.CategoriaDAO;
import loja.dao.ClienteDAO;
import loja.dao.PedidoDAO;
import loja.dao.ProdutoDAO;
import loja.modelo.Categoria;
import loja.modelo.Cliente;
import loja.modelo.ItemPedido;
import loja.modelo.Pedido;
import loja.modelo.Produto;
import loja.util.JPAUtil;

public class PerformanceConsultas {

	public static void main(String[] args) {
		
		popularBancoDeDados();
		EntityManager em = JPAUtil.getEntityManager();
		
		PedidoDAO pedidoDao = new PedidoDAO(em);
		Pedido pedido = pedidoDao.buscarPedidoComCliente(1l);
		
		em.close();
		
		System.out.println(pedido.getCliente().getNome());

	}

	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");

		Produto celular = new Produto("Samsung", "Galaxy s22", new BigDecimal("6000"), celulares);
		Produto videogame = new Produto("PS5", "PlayStation", new BigDecimal("2500"), videogames);
		Produto macbook = new Produto("Macbook", "Macbook pro", new BigDecimal("9000"), informatica);

		Cliente cliente = new Cliente("José", "30012345687");
		
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem(new ItemPedido(10, pedido, celular));
		pedido.adicionarItem(new ItemPedido(40, pedido, videogame));
		
		Pedido pedido2 = new Pedido(cliente);
		pedido2.adicionarItem(new ItemPedido(2, pedido, macbook));	

		EntityManager em = JPAUtil.getEntityManager();

		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		ClienteDAO clienteDao = new ClienteDAO(em);
		PedidoDAO pedidoDao = new PedidoDAO(em);

		em.getTransaction().begin();

		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(videogames);
		categoriaDao.cadastrar(informatica);

		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(videogame);
		produtoDao.cadastrar(macbook);
		
		pedidoDao.cadastrar(pedido);
		pedidoDao.cadastrar(pedido2);

		clienteDao.cadastrar(cliente);
		em.getTransaction().commit();
		em.close();
	}

}
