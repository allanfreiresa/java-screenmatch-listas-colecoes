package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);

        Filme f1 = filmeDoPaulo;
        System.out.println(f1);


        Serie lost = new Serie("Lost", 2000);

        //ArrayList<Titulo> lista = new ArrayList<>();
        //List<Titulo> lista = new ArrayList<>();
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //redefinição da lista
        //Usar estruturas de dados thread-safe, como CopyOnWriteArrayList, se você estiver
        // trabalhando em um ambiente concorrente.
        //Certifique-se de revisar o código onde a modificação da lista ocorre após a adição
        // do implements na classe Titulo e aplicar uma das soluções acima para evitar a
        // ConcurrentModificationException.
        List<Titulo> copiaLista = new ArrayList<>(lista);

        for (Titulo item : copiaLista) {
            if (item instanceof Filme filme) {//&& filme.getClassificacao > 2) {
                //lista.remove(item);
                if (filme.getClassificacao() > 2) {
                    System.out.println("Classificação" + filme.getClassificacao());
                }
            }
        }
       //feito copia da lista para evitar o erro exception manu
       /* for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {//&& filme.getClassificacao > 2) {
                if(filme.getClassificacao() > 2) {
                    System.out.println("Classificação" + filme.getClassificacao());
                }
            }*/

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Lista de anos de Lançamentos Ordenados");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

        // Filme filme = (Filme) item;
        //System.out.println("Classificação " + filme.getClassificacao());
    }
}


