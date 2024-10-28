//Atribuicao.java
class Numero {
    int i;
}

public class Atribuicao {
    public static void main(String[] args) {
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1 = n2;
        System.out.println("2: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("3: n1.i: " + n1.i + ", n2.i: " + n2.i);
    }
}
