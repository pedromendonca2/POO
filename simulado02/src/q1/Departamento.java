package q1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Departamento extends UnidadeOrganizacional {
    private String nome;
    private List<Setor> setores = new LinkedList<>();

    public Departamento(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void adicionaSetor(Setor st){
        this.setores.add(st);
    }
    
    @Override
    public Set<Funcionario> getFuncionarios(){
        Set<Funcionario> todFuncionarios = new HashSet<>();

        for(Setor s: setores){
            todFuncionarios.addAll(s.getFuncionarios());
        }

        return todFuncionarios;
    }

    public List<Setor> getSetores(){
        return this.setores;
    }
}
