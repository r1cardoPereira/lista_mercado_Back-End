package br.com.mercadocorp.appmercado.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.mercadocorp.appmercado.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {
    
}
