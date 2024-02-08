public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Pessoa: " + getNome() + " Idade: " + getIdade() + " Curso:" + curso +  "";
    }


    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
