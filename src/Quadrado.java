public class Quadrado extends Quadrilatero{

    public Quadrado(int lado1) {
        super(lado1);
    }

    @Override
    public double calculaPerimetro(){
        return lado1*lado1;
    }

    @Override
    public double calculaArea(){
        return 4*lado1;
    }
}
