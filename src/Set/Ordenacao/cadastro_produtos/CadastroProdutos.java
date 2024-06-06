package Set.Ordenacao.cadastro_produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private final Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "produtoSet=" + produtoSet +
                '}';
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        Produto produtoParaAdicionar = new Produto(cod, quantidade, preco, nome);
        produtoSet.add(produtoParaAdicionar);
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoSetPorNome = new TreeSet<>(produtoSet);
        return produtoSetPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoSetPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSetPorPreco.addAll(produtoSet);
        return produtoSetPorPreco;
    }

    public static void main(String[] args) {

    }


}
