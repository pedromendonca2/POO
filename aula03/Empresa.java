import java.util.LinkedList;
import java.util.List;

public class Empresa {

  private String nome;
  
  public Empresa(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }
  
  private List<Departamento> departamentos = new LinkedList<Departamento>();

  public List<Departamento> getDepartamentos(){
    return this.departamentos;
  }
  
  public void addDepartamento(Departamento d){
    this.departamentos.add(d);
  }
  
}