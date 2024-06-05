package OperacoesBasicas.carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinho=" + carrinho +
                '}';
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinho.removeAll(itensParaRemover);
        } else {
            System.out.println("O carrinho está vazio!");
        }
    }

    public double calcularValorTotal() {
        double precoTotal = 0;

        for (Item i : carrinho) {
            precoTotal += i.getPreco() * i.getQuantidade();
        }
        return precoTotal;
    }

    public void exibirItens() {
        System.out.println(this.carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        carrinho1.adicionarItem("nescau ball", 7.50, 1);
        carrinho1.adicionarItem("banana", 2.50, 4);

        carrinho1.removerItem("banana");

        carrinho1.exibirItens();
        System.out.println(carrinho1.calcularValorTotal());
    }
}
