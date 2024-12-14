package simulado_q3;
import java.util.LinkedList;
import java.util.List;

public class Agencia {
    private String nome;
    private List<Conta> contas = new LinkedList<>();

    public Agencia(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaConta(Conta c){
        this.contas.add(c);
    }

    public double getMedia(){
        double media = 0;
        int qtd = 0;

        for(Conta c: contas){
            qtd++;
            media += c.getSaldoInicial();
        }

        return media/qtd;
    }

}
