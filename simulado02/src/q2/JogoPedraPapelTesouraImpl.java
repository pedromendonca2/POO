package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura {
    private Jogada j1;
    private Jogada j2;

    public JogoPedraPapelTesouraImpl() {
        Random r = new Random();
        j1 = Jogada.values()[r.nextInt(3)];
        j2 = Jogada.values()[r.nextInt(3)];
    }

    @Override
    public Jogada jogadaJogador1(){
        return j1;
    }

    @Override
    public Jogada jogadaJogador2(){
        return j2;
    }

    @Override
    public boolean haVencedor(){
        return j1 != j2;
    }

    @Override
    public int getJogadorVencedor(){
        if(j1 == Jogada.PEDRA){
            if(j2 == Jogada.PAPEL) return 2;
            else return 1;
        } else if(j1 == Jogada.PAPEL){
            if(j2 == Jogada.PEDRA) return 1;
            else return 2;
        } else{
            if(j2 == Jogada.PEDRA) return 2;
            return 1;
        }
    }
}
