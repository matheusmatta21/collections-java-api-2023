package Set.Pesquisa.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefaParaAdicionar = new Tarefa(descricao);
        conjuntoTarefas.add(tarefaParaAdicionar);
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        conjuntoTarefas.removeAll(tarefasParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(conjuntoTarefas); //ok
    }

    public int contarTarefas() {
        return conjuntoTarefas.size(); //ok
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if (t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : conjuntoTarefas) {
            if (!t.isTarefaConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        for (Tarefa t : conjuntoTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(true);
            }
        }

    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        for (Tarefa t : conjuntoTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        conjuntoTarefas.clear();
    }

    public static void main(String[] args) {

    }
}
