package q1;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos = new LinkedList<>();

    public Empresa(String nome){
        this.nome = nome;
    }

    public void adicionaDepartamento(Departamento dpt){
        this.departamentos.add(dpt);
    }

    @Override
    public String toString() {
        String impressao = "Empresa:\n" + this.nome; 
        impressao += "\nDepartamentos:";
        for(Departamento d: departamentos){
            impressao += "\n" + d.getNome();
            impressao += "\nSetores:";
            for(Setor s: d.getSetores()){
                impressao += "\n" + s.getNome();
                impressao += "\nFuncionários:";
                for(Funcionario f: s.getFuncionarios()){
                    impressao += "\n" + f.getNome() + ", " + f.getSlr();
                }
                impressao += "\nSalário médio: " + s.getSalarioMedio();
            }
        }


        return impressao;
    }
}
