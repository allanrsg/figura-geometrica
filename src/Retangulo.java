public class Retangulo extends Quadrilatero{

    public Retangulo(int lado1, int lado2) {
        super(lado1, lado2);
    }

    @Override
    public double calculaPerimetro(){
        return  2*lado1+2*lado2;
    }

    @Override
    public double calculaArea(){
        return lado1*lado2;
    }


}
