package Ordenacao.ordenacao_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaNumerosAscendente = new ArrayList(listaNumeros);
        Collections.sort(listaNumerosAscendente);
        return listaNumerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaNumerosDescendente = new ArrayList(listaNumeros);
        Collections.sort(listaNumerosDescendente);
        Collections.reverse(listaNumerosDescendente);
        return listaNumerosDescendente;
    }

    public static void main(String[] args) {

    }
}
