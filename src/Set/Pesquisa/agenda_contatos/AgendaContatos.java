package Set.Pesquisa.agenda_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        this.conjuntoContatos = new HashSet<>();
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "conjuntoContatos=" + conjuntoContatos +
                '}';
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        Contato contatoParaAdicionar = new Contato(nome, numeroTelefone);
        conjuntoContatos.add(contatoParaAdicionar);
    }

    public void exibirContatos() {
        System.out.println(conjuntoContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosDesejados = new HashSet<>();
        for (Contato contato : conjuntoContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatosDesejados.add(contato);
            }
        }
        return contatosDesejados;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : conjuntoContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroTelefone(novoNumero);
            }
        }
    }

    public static void main(String[] args) {

    }
}
