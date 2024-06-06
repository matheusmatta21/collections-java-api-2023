package Set.Pesquisa.lista_tarefas;

public class Tarefa {
    private final String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaConcluida = false;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", statusTarefa=" + tarefaConcluida +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
}
