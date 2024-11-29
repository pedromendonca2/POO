public abstract class Funcionario{

  private float salario;
  private int horas;
  private String nome;

  public Funcionario(String nome, float salario){
    this.nome = nome;
    this.salario = salario;
  }
  
  public String getNome(){
    return nome;
  }
  
  public float getSalario(){
    return salario;
  }

  public int getHoras(){
    return horas;
  }
  
  public void setNumeroHorasSemanais(int horas){
    this.horas = horas;
  }

  @Override
  public String toString()
  {
      return "Emplooye "+getNome()+"!!!!!!";
  }
  
}
