package q1;

public class Setor extends UnidadeOrganizacional {
    //private String nome;

    public Setor(String nome){
        super(nome);
    }

    public void trocaFuncionario(Funcionario f, Setor s2){
        this.getFuncionarios().remove(f);
        s2.getFuncionarios().add(f);
        f.trocaSetor(s2);
        System.out.println("\n");
    }
}
