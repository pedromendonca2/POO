import java.util.LinkedList;
import java.util.List;

public class Departamento{

  private String nome;
  
  public Departamento(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  private List<Funcionario> funcionarios = new LinkedList<Funcionario>();

  public void addFuncionario(Funcionario f){
    this.funcionarios.add(f);
  }

  public List<Funcionario> getFuncionarios(){
    return this.funcionarios;
  }

  public float getMediaSalarial(){
    float i = 0;
    float somaSalarial = 0;
    for(Funcionario f : funcionarios){
      somaSalarial += f.getSalario();
      i++;
    }

    if(i != 0){
      return somaSalarial/i;
    } else{
      return 0;
    }
  }

  @Override
  public String toString()
  {
      return "Employee "+getNome()+"!!!!!!";
  }
  
}