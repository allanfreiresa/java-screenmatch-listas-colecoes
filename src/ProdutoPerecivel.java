public class ProdutoPerecivel extends Produto {
    String dataValidade;

    /*public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }*/


    public ProdutoPerecivel(String nome, double preco, int quantidade,String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + getNome() + ", preco=" + getPreco() + ", quantidade=" + getQuantidade() + ",Data Validade= "  + dataValidade + "]";
    }
}