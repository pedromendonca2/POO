package aula05;

public class Livro extends Produto{

    private String autor;

    public Livro(String nome, double preco, String autor){
        super(preco, nome);
        this.autor = autor;
    }

    @Override
    public String toString(){
        return super.toString() + ", Autor: " + autor;
    }
}
