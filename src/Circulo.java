public abstract class Circulo implements FiguraGeometrica{
    private float raio;

    public void setRaio (float raio ){
        this.raio = raio;
    }
    public float getRaio(){
        return raio;
    }

    @Override
    public double calculaPerimetro() {
        return (2 * Math.PI * raio);
    }

    @Override
    public double calculaArea() {
        return (Math.PI * (raio * raio));
    }
}