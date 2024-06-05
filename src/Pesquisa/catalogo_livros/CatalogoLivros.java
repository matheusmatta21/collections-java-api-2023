package Pesquisa.catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "catalogoLivros=" + catalogoLivros +
                '}';
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livroParaAdicionar = new Livro(titulo, autor, anoPublicacao);
        catalogoLivros.add(livroParaAdicionar);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> catalogoFiltradoAutor = new ArrayList<>();
        for (Livro l : catalogoLivros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                catalogoFiltradoAutor.add(l);
            }
        }
        return catalogoFiltradoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> catalgoFiltradoPorIntervalo = new ArrayList<>();
        for (Livro l : catalogoLivros) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                catalgoFiltradoPorIntervalo.add(l);
            }
        }
        return catalgoFiltradoPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroRetornado = null;
        for (Livro l : catalogoLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroRetornado = l;
            }
        }
        return livroRetornado;
    }

    public static void main(String[] args) {

    }
}
