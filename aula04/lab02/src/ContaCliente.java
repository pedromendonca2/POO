public class ContaCliente extends ContaCorrente{

    public ContaCliente(double saldo){
        super(saldo);
    }

    public double getTaxa(){
        return 0.1;
    }
}
