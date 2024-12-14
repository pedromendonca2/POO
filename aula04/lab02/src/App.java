public class App {
    public static void main(String[] args) throws Exception {

        ContaCorrente c1 = new ContaCorrente(100);
        ContaCliente c2 = new ContaCliente(100);

        c1.depositar(100);
        c1.sacar(50);

        c2.depositar(100);
        c2.sacar(50);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}