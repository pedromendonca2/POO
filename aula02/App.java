import java.util.LinkedList;

public class App
{
    public static void main(String[] args) {

        LinkedList<Partida> partidas = new LinkedList<>();
        Time flamengo = new Time("Flamengo");
        Time vasco = new Time("Vasco");
        Time fluminense = new Time("Fluminense");
        Partida p1 = new Partida(flamengo, vasco);
        partidas.add(p1);
        Partida p2 = new Partida(flamengo, fluminense);
        partidas.add(p2);
        System.out.println(partidas.get(1).getTimeB().getNumeroMundiais());
        for(Partida p : partidas)
        {
            System.out.print(p.getTimeA().getNome());
            System.out.print(" x ");
            System.out.println(p.getTimeB().getNome());
        }
    }
}

//Linguagem C compila: traduz um código para um executável de uma plataforma específica
//Linguagem Python interpreta: roda o código em tempo de execução (o browser faz isso)

//Java era a linguagem do browser, a linguagem da internet
//Por isso, ele compila um código executável em qualquer máquina
//É mais devagar que o C, mas mais rápido que o Python
//Java compila o código fonte para o arquivo em linguagem de máquina (linguagem universal - bytecode Java) - o Java Virtual Machine executa essa linguagem