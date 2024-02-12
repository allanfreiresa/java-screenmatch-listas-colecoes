public class Conta implements Comparable<Conta> {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

   @Override
    public int compareTo(Conta outra) {
        if (this.saldo < outra.saldo) {
            return 1;
        } else if (this.saldo > outra.saldo) {
            return -1;
        } else {
            return 0;
        }
    }

    /*@Override
    public int compareTo(Conta outraConta) {
        return this.getTitular().compareTo(outraConta.getTitular());
    }*/

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
       public String toString() {
        return "Titular: " + this.getTitular() + " Saldo: " + this.getSaldo() + "";
    }
}