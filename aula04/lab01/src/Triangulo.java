public class Triangulo {
    private Ponto a;
    private Ponto b;
    private Ponto c;

    public Triangulo(Ponto a, Ponto b, Ponto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimetro(){
        return this.a.distancia(this.b) + this.b.distancia(this.c) + this.c.distancia(this.a);
    }
}
