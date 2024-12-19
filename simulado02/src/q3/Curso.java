package q3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Curso {
    private String nomeCurso;
    private HashMap<String, Disciplina> disciplinas = new LinkedHashMap<>();

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        disciplinas.put(idDisciplina, d);
        return d;
    }

    public void estabelecePreReq(Disciplina d, String idPre){
        d.getPreReqs().add(idPre);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public HashMap<String, Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
