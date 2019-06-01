public class Quadrado extends Quadrilatero{

    public Quadrado(float lado1) {
        super(lado1);
    }

    @Override
    public double calculaPerimetro(){
        return 4*lado1;
    }

    @Override
    public double calculaArea(){
        return lado1*lado1;
    }
}
