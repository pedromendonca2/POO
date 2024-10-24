public class Apa {
    public static void main(String[] args) {
        java.util.LinkedList<Partida> partidas = new java.util.LinkedList<Partida>();

        Time flamengo = new Time();
        flamengo.setNome("Flamengo");
        flamengo.incNumMundiais();

        Time fluminense = new Time();
        fluminense.setNome("Fluminense");
        fluminense.incNumMundiais();

        Partida p1 = new Partida(flamengo, fluminense);
        partidas.add(p1);

        for(Partida p : partidas){
            System.out.print(p.getTimeA().getNome());
            System.out.print("x");
            System.out.println(partidas.size());
        }
    }
}
