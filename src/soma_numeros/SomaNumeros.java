package soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;

    public SomaNumeros(){
        this.listaInteiros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(Integer i : listaInteiros){
            soma += i;
    }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for(Integer i : listaInteiros){
            if (i > maiorNumero){
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = 999999999;
        for (Integer i : listaInteiros){
            if (i < menorNumero){
                menorNumero = i;
            }
        }
        return menorNumero;
    }
    public List<Integer> exibirNumeros() {
        return listaInteiros;
    }

    public static void main(String[] args) {
        SomaNumeros listaInteiros1 = new SomaNumeros();

        listaInteiros1.adicionarNumero(2);
        listaInteiros1.adicionarNumero(20);
        listaInteiros1.adicionarNumero(17);
        listaInteiros1.adicionarNumero(0);
        listaInteiros1.adicionarNumero(4);
        listaInteiros1.adicionarNumero(14);
        listaInteiros1.adicionarNumero(-3);

        System.out.println(listaInteiros1.calcularSoma());

        System.out.println(listaInteiros1.encontrarMaiorNumero());
        System.out.println(listaInteiros1.encontrarMenorNumero());

        System.out.println(listaInteiros1.exibirNumeros());

    }
}
