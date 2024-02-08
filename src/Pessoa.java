public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }

}
