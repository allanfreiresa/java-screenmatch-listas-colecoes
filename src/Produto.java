public class Produto  {

    private String nome;
    private double preco;
    private int quantidade;

    private double precoUnitario;
    double precoFinal;
    double descontoParaPix;
    private double valor;
    private double peso;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

   /*@Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }*/
    /*public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }*/


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

/*    @java.lang.Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }
*/
    public double calculaImposto() {
        //produto tem 10% de imposto:
        return getPreco() * 0.1;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;

    }



    double pegaPrecoFinal(boolean pagamentoViaPix) {

        if (pagamentoViaPix == true) {
            double precoFinal = preco - descontoParaPix;
            return precoFinal;
        } else {
            double precoFinal = preco;
            return precoFinal;
        }
    }
}
