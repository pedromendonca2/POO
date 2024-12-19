package q1;

import java.util.HashSet;
import java.util.Set;

public class Setor extends UnidadeOrganizacional {
    private String nome;
    private Set<Funcionario> funcionarios = new HashSet<>();

    public Setor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaFuncionario(Funcionario fcr){
        funcionarios.add(fcr);

    }

    public void trocaFuncionario(Funcionario f, Setor s2){
        this.funcionarios.remove(f);
        s2.adicionaFuncionario(f);
        f.trocaSetor(s2);
        System.out.println("\n");
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        return new HashSet<>(funcionarios);
    }
}
