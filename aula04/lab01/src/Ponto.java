public class Ponto {
    private double x, y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distancia(Ponto b){
        return Math.sqrt(Math.pow(this.getX() - b.getX(), 2) + Math.pow(this.getY() - b.getY(), 2));
    }
}
