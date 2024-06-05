package catalogo_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livroParaAdicionar = new Livro(titulo, autor, anoPublicacao);
        catalogoLivros.add(livroParaAdicionar);
    }
    public List<Livro> pesquisarPorAutor(String autor){
       List<Livro> catalogoFiltradoAutor = new ArrayList<>();
        for(Livro l : catalogoLivros){
            if (l.getAutor().equalsIgnoreCase(autor)){
                catalogoFiltradoAutor.add(l);
            }
        }
        return catalogoFiltradoAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> catalgoFiltradoPorIntervalo = new ArrayList<>();
        for(Livro l : catalogoLivros){
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                catalgoFiltradoPorIntervalo.add(l);
            }
        }
        return catalgoFiltradoPorIntervalo;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroRetornado = null;
        for (Livro l : catalogoLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroRetornado = l;
            }
        }
        return livroRetornado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros1 = new CatalogoLivros();

        catalogoLivros1.adicionarLivro("O Pequeno Principe", "Machado de Assis", 1953);
        catalogoLivros1.adicionarLivro("Brás Cubas", "Matta", 1954);
        catalogoLivros1.adicionarLivro("Brás Cubas", "Matta", 1930);

        System.out.println(catalogoLivros1.pesquisarPorAutor("Matta"));
        System.out.println(catalogoLivros1.pesquisarPorIntervaloAnos(1930, 1953));
        System.out.println(catalogoLivros1.pesquisarPorTitulo("O pequeno principe"));
    }
}
