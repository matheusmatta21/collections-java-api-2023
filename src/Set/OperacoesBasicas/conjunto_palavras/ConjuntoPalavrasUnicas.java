package Set.OperacoesBasicas.conjunto_palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavrasUnicas=" + conjuntoPalavrasUnicas +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        conjuntoPalavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        for (String palavraDoSet : conjuntoPalavrasUnicas) {
            if (palavraDoSet.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicas);
    }

    public static void main(String[] args) {

    }
}
