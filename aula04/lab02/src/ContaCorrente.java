public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getTaxa(){
        return 0.5;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor + valor*this.getTaxa();
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
}