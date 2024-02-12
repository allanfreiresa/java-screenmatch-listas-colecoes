import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteConta {
    public static void main(String[] args) {

        Conta conta = new Conta("Allan",200);
        Conta conta2 = new Conta("Karina",400);
        Conta conta3 = new Conta("Brenda",1500);

       /* ArrayList<String> lista = new ArrayList<>();
        lista.add("Allan");
        lista.add("Karina");
        lista.add("Brenda");
        System.out.println(lista);
        Collections.sort(lista);*/


        ArrayList<Conta> lista2 = new ArrayList<>();
        lista2.add(conta);
        lista2.add(conta2);
        lista2.add(conta3);
        System.out.println("Antes da ordenacao por titulo" + lista2);

        Collections.sort(lista2);
        System.out.println("Depois da ordenacao por titulo");
        System.out.println(lista2);

        lista2.sort(Comparator.comparing(Conta::getSaldo));
        System.out.println("Depois da ordenacao por Saldo");
        System.out.println(lista2);

        lista2.sort(Comparator.comparing(Conta::getTitular));
        System.out.println("Depois da ordenacao por nome com outra função");
        System.out.println(lista2);

        // System.out.println("Depois da ordenação");
      //  Collections.sort(lista);






        /*ArrayList<Conta> conta = new ArrayList<>();
        conta.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);*/


    }
}
