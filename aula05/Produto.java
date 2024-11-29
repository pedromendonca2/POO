package aula05;

public class Produto {

    private double preco;
    private String nome;

    public Produto(double preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", Preço: R$" + preco;
    }
}
