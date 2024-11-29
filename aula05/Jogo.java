package aula05;

public class Jogo extends Produto{
    private int idade;

    public Jogo(String nome, double preco, int idade){
        super(preco, nome);
        this.idade = idade;
    }

    @Override
    public String toString(){
        return super.toString() + ", Idade mínima: " + idade;
    }

}
