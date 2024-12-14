package q1;

import java.util.LinkedList;
import java.util.List;

public class UnidadeOrganizacional {
    private String nome;
    private List<Funcionario> funcionarios = new LinkedList<>();

    public UnidadeOrganizacional(String nome){
        this.nome = nome;
    }

    public void adicionaFuncionario(Funcionario fcr){
        this.funcionarios.add(fcr);
    }

    public double getSalarioMedio(){
        if(funcionarios.size() == 0) return 0;

        double soma = 0;

        for(Funcionario f: funcionarios){
            soma += f.getSlr();
        }

        return soma/funcionarios.size();
    }

    public List<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }

    public String getNome() {
        return nome;
    }
}
