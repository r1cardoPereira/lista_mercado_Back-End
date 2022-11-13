package br.com.mercadocorp.appmercado.sevice;

import java.util.List;

import br.com.mercadocorp.appmercado.model.Produto;

public interface IProdutoService {

    public Produto criarNovoProduto(Produto prod);

    public Produto alterarProduto(Produto prod);

    public List<Produto> listarTodos();

    public List<Produto> buscarPorPalavraChave(String key);

    public Produto buscarPorId (Integer id);

}
