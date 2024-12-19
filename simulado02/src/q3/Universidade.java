package q3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Universidade {
    private String nomeUniversidade;
    private HashMap<String, Curso> cursos = new LinkedHashMap<>();

    public Universidade(String nomeUniversidade){
        this.nomeUniversidade = nomeUniversidade;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso c = new Curso(nomeCurso);
        this.cursos.put(nomeCurso, c);
        return c;
    }

    @Override
    public String toString() {
        String impressao = "\n\nUniversidade: " + this.nomeUniversidade;
        impressao += "\nCurso: ";
        for(Curso c: this.cursos.values()){
            impressao += c.getNomeCurso();
            impressao += "\nDisciplinas:";
            for(Disciplina d: c.getDisciplinas().values()){
                impressao += "\n" + d.getNomeDisciplina() + ", ";
                if(d.getPreReqs().isEmpty()) impressao += "sem pré-requisitos";
                else{
                    impressao += "pré-requisitos: ";
                    for(String p: d.getPreReqs()){
                        for(Disciplina d1: c.getDisciplinas().values()){
                            if(d1.getIdDisciplina().equals(p)) impressao += d1.getNomeDisciplina() + " ";
                        }
                    }
                }
            }
        }

        return impressao;
    }
}
