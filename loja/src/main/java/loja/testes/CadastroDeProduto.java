package loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import loja.dao.CategoriaDAO;
import loja.dao.ProdutoDAO;
import loja.modelo.Categoria;
import loja.modelo.CategoriaId;
import loja.modelo.Produto;
import loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		cadastrarProduto();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		Produto p = produtoDao.buscarPorId(1l);
		System.out.println(p.getPreco());
		
		List<Produto> todos = produtoDao.buscarPorNomeDaCategoria("CELULARES");
		todos.forEach(td -> System.out.println(td.getNome()));
		
		BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Samsung");
		System.out.println("Preço do produto : " + precoDoProduto);
		
		//mapeamento de chave composta
		em.find(Categoria.class, new CategoriaId("Celulares", "xpto"));
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Samsung", "Galaxy s22", new BigDecimal("7000"), celulares);

		EntityManager em = JPAUtil.getEntityManager();

		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);

		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
	}

}
