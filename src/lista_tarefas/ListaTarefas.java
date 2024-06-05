package lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("lista_tarefas.Tarefa 1");
        listaTarefa.adicionarTarefa("lista_tarefas.Tarefa 1");
        listaTarefa.adicionarTarefa("lista_tarefas.Tarefa 2");

        //listaTarefa.removerTarefa("lista_tarefas.Tarefa 1");

        listaTarefa.obterDescricoesTarefas();

        System.out.println("Numero total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
    }
}
