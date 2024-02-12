import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class OutrosTestes {
    public static void main(String[] args) {


        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);



        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);



        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D",2000));
        listaTitulos.add(new Titulo("A",2001));
        listaTitulos.add(new Titulo("B",2003));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }


        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);

        /*ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        //ContaBancaria contaMaiorSaldo = listaContas.get(0);
        ContaBancaria contaMaiorSaldo = listaContas.get(0);
       //System.out.println(listaContas);

        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        listaContas.forEach(System.out::println);
        listaContas.forEach(conta -> System.out.println(conta1.getNumeroConta()));
        listaContas.forEach(conta -> System.out.println(conta));


        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
*/

/*
        Produto produto1 = new Produto("Ar condicionado", 2000.0,1);
        Produto produto2 = new Produto("Aquecedor", 800.0,1);
        Produto produto3 = new Produto("Ventilador", 150.0,1);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

*/

         /*
         //DANDO UM CAST
        Animal animal = new Cachorro();
        //Animal animal = new Animal();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
            System.out.println("O objeto  é um Cachorro.");
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
*/
        //Cachorro e faça o casting para a classe Animal.
        //Cachorro cachorro = new Cachorro();
        //Animal animal = (Animal) cachorro;


       /* Produto p1 = new Produto("Caneta", 1.50, 4);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());*/

/*
        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Avatar", 2009);

        if (filme1.getNome() == filme2.getNome()) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }*/


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");

        //for (String nome : nomes) {
         //   System.out.println(nome);
       // }

        //  nomes.forEach(nome -> System.out.println(nome));
        //reduzindo mais ainda a leitura do for each
        nomes.forEach(System.out::println);



    }
}
