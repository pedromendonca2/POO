package q3;

import java.util.LinkedList;
import java.util.List;

public class Disciplina {
    private String idDisciplina;
    private String nomeDisciplina;
    private List<String> preReqs = new LinkedList<>();

    public Disciplina(String idDisciplina, String nomeDisciplina){
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
    }

    public List<String> getPreReqs() {
        return preReqs;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }
}
