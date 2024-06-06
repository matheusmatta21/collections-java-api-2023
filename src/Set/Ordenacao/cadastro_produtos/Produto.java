package Set.Ordenacao.cadastro_produtos;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private final long cod;
    private String nome;
    private final double preco;
    private final int quantidade;

    public Produto(long cod, int quantidade, double preco, String nome) {
        this.cod = cod;
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
