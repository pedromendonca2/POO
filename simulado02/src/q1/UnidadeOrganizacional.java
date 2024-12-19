package q1;

import java.util.Set;

public abstract class UnidadeOrganizacional {

    public double getSalarioMedio(){
        if(getFuncionarios().size() == 0) return 0;

        double soma = 0;
        for(Funcionario f: getFuncionarios()){
            soma += f.getSlr();
        }

        return soma/getFuncionarios().size();
    }

    public abstract Set<Funcionario> getFuncionarios();
}
