package simulado_q3;

public class Banco {
    private String nome;
    private Agencia ag;

    public Banco(String nome){
        this.nome = nome;
    }

    public Agencia criaAgencia(String nome){
        Agencia a = new Agencia(nome);
        this.ag = a;
        return a;
    }

    public String toString(){
        String impressao = "Nome do Banco: "+ this.nome + "\n" + "Agência: " + this.ag.getNome() + ", saldo médio: " + this.ag.getMedia();

        return impressao;
    }
}
