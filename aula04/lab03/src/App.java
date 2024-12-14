package aula05;

public class App {

    public static void main(String[] args) {
        Livro L1 = new Livro("O Hobbit", 40.0, "J.R.R. Tolkien");
        Livro L2 = new Livro("O Senhor dos Anéis", 90.0, "J.R.R. Tolkien");
        Livro L3 = new Livro("O Silmarillion", 60.0, "J.R.R. Tolkien");
        Jogo J1 = new Jogo("Uno", 30.0, 9);
        Jogo J2 = new Jogo("D&D", 120.0, 16);

        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L3.toString());
        System.out.println(J1.toString());
        System.out.println(J2.toString());
    }
}
