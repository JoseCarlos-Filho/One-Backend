package loja.dao;

import javax.persistence.EntityManager;

import loja.modelo.Cliente;
import loja.modelo.Produto;

public class ClienteDAO {

	private EntityManager em;

	public ClienteDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente buscarPorId(Long id) {
		return em.find(Cliente.class, id);
	}
	
}
