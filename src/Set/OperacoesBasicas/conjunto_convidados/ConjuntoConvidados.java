package Set.OperacoesBasicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        this.conjuntoConvidados = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "conjuntoConvidados=" + conjuntoConvidados +
                '}';
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        Convidado convidadoParaAdicionar = new Convidado(nome, codigoConvite);
        conjuntoConvidados.add(convidadoParaAdicionar);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Set<Convidado> convidadosParaRemover = new HashSet<>();
        for (Convidado c : conjuntoConvidados) {
            if (c.getCodigoConvite().equals(codigoConvite)) {
                convidadosParaRemover.add(c);
                break;
            }
        }
        conjuntoConvidados.removeAll(convidadosParaRemover);
    }

    public int contarConvidados() {
        return conjuntoConvidados.size();
    }

    public void exibirConvidados() {
        System.out.println(conjuntoConvidados);
    }

    public static void main(String[] args) {

    }
}
