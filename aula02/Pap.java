class Time{
    private String nome;
    private int numMundiais;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){ //getter
        return this.nome;
    }

    public void incNumMundiais(){
        this.numMundiais++;
    }
    public int getNumeroMundiais(){
        return this.numMundiais;
    }
}

public class Pap {
    public static void main(String[] args) {
        Time fluminense = new Time();
        fluminense.setNome("Fluminense");
        System.out.println(fluminense.getNome());
        fluminense.setNome("Fluminense Futebol Clube");
        fluminense.incNumMundiais();
        System.out.println(fluminense.getNumeroMundiais());
    }
}
