package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {

    int vida;
    int vitalidade;
    int dano_1;
    int dano_2;

    public Pokemon(int i, int j, int k) {
        this.vida = i;
        this.vitalidade = i;
        this.dano_1 = j;
        this.dano_2 = k;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
        if(r.nextBoolean()){
            personagemAtacado.vitalidade -= dano_1;
        } else{
            personagemAtacado.vitalidade -= dano_2;
        }

        if(personagemAtacado.vitalidade <= 0) return true;

        return false;
    }

    @Override
    public void regenera() {
        this.vitalidade = this.vida;
    }

    @Override
    public int getPontosVitalidade() {
        return this.vitalidade;
    }
    
}
