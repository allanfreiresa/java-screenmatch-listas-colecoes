import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class TesteGeral {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Karina Juliana", 44);
        Pessoa pessoa2 = new Pessoa("Brenda Freire", 7);
        Pessoa pessoa3 = new Pessoa("Allan Freire",43);

        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);

        System.out.println("Tamanho da lista " + listaPessoa.size());
        System.out.println("Primeiro nome " + listaPessoa.get(0).getNome());
        System.out.println("Primeiro pessoa " + listaPessoa.get(0));
        System.out.println(listaPessoa);
        System.out.println("toString do filme " + listaPessoa.get(0).toString());

        //Produto produto = new Produto();
        //Carrinho carrinho = new Carrinho();
        //carrinho.adicionaProduto(produto);

        /*int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println(numeros[0]);
*/
        /*
        criando array instanciando parametros
        Filme[] filmes = new Filme[2];

        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Dogville", 2003);

        filmes[0] = filme1;
        filmes[1] = filme2;
        System.out.println(filmes[0].getNome());
        System.out.println(filmes[1].getNome());

        System.out.println(filme1.getNome());
        System.out.println(filme1.getAnoDeLancamento());
*/
    }
}
