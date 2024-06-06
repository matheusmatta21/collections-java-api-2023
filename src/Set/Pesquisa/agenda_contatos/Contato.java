package Set.Pesquisa.agenda_contatos;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
