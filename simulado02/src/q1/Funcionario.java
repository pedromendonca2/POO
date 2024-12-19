package q1;

public class Funcionario {
    private String nome;
    private double slr;
    private Setor st;

    public Funcionario(String nome, double slr, Setor st){
        this.nome = nome;
        this.slr = slr;
        this.st = st;
    }

    public String getNome() {
        return nome;
    }

    public double getSlr() {
        return slr;
    }

    public void trocaSetor(Setor s2){
        this.st = s2;
    }

    
}
