import java.util.ArrayList;

public class TesteGeral {
    public static void main(String[] args) {

        /*ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
        System.out.println(produtoNovo);
*/
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);
        System.out.println(produtoPerecivel.getDataValidade());

        Aluno aluno = new Aluno("Allan", 43, 5555, "Analise Sistema");

        System.out.println(aluno);
        System.out.println(aluno.getMatricula());

        Pessoa pessoa1 = new Pessoa("Karina Juliana", 44);
        Pessoa pessoa2 = new Pessoa("Brenda Freire", 7);
        Pessoa pessoa3 = new Pessoa("Allan Freire",43);

        System.out.println(pessoa1);

        /*ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);

        System.out.println("Tamanho da lista " + listaPessoa.size());
        System.out.println("Primeiro nome " + listaPessoa.get(0).getNome());
        System.out.println("Primeiro pessoa " + listaPessoa.get(0));
        System.out.println(listaPessoa);
        System.out.println("toString do filme " + listaPessoa.get(0).toString());
*/
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
