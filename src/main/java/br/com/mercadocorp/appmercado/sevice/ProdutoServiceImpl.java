package br.com.mercadocorp.appmercado.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mercadocorp.appmercado.DAO.ProdutoDAO;
import br.com.mercadocorp.appmercado.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoDAO dao;
    
    
    @Override
    public Produto criarNovoProduto(Produto prod) {
        // TODO Auto-generated method stub
        return dao.save(prod);
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto buscarPorId(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
