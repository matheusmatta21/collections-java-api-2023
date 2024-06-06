package Set.Ordenacao.lista_alunos;

import List.Ordenacao.ordenacao_pessoas.Pessoa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private final Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "GerenciadorAlunos{" +
                "alunoSet=" + alunoSet +
                '}';
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        Aluno alunoParaAdicionar = new Aluno(nome, matricula, nota);
        alunoSet.add(alunoParaAdicionar);
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alunosRemoverSet = new HashSet<>();
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunosRemoverSet.add(a);
                break;
            }
        }
        alunoSet.removeAll(alunosRemoverSet);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNomeSet = new TreeSet<>(alunoSet);
        return alunosPorNomeSet;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNotaSet = new TreeSet<>(new ComparatorPorNota());
        alunosPorNotaSet.addAll(alunoSet);
        return alunosPorNotaSet;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {

    }
}
