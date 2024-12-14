package q1;

import java.util.LinkedList;
import java.util.List;

public class Departamento extends UnidadeOrganizacional {
    //private String nome;
    private List<Setor> setores = new LinkedList<>();

    public Departamento(String nome){
        super(nome);
    }
    
    public void adicionaSetor(Setor st){
        this.setores.add(st);
    }

    public List<Setor> getSetores(){
        return this.setores;
    }
}
