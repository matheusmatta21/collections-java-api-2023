package Ordenacao.ordenacao_pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "listaPessoas=" + listaPessoas +
                '}';
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa pessoaParaAdicionar = new Pessoa(nome, idade, altura);
        listaPessoas.add(pessoaParaAdicionar);
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {

    }
}
