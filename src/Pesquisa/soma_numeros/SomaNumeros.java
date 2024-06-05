package Pesquisa.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer i : listaInteiros) {
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (Integer i : listaInteiros) {
            if (i > maiorNumero) {
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 999999999;
        for (Integer i : listaInteiros) {
            if (i < menorNumero) {
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return listaInteiros;
    }

    public static void main(String[] args) {

    }
}
