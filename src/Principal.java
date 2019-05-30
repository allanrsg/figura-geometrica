import java.util.Scanner;

public class Principal {
    public static void main(String[] arg) {

        Quadrado quadrado = new Quadrado (5);
        Retangulo retangulo = new Retangulo (5,10);
        Circulo circulo = new Circulo(5);

        System.out.println("Quadrado: \nlados: " + quadrado.getLado1() +
                " - perimetro: " + quadrado.calculaPerimetro() +
                " - área: " + quadrado.calculaArea() + "\n");

        System.out.println("Retangulo: \nbase: " + retangulo.getLado1() + " - altura: " + retangulo.getLado2() +
                " - perimetro: " + retangulo.calculaPerimetro() +
                " - área: " + retangulo.calculaArea() + "\n");

        System.out.println("Circulo: \nraio: " + circulo.getRaio() +
                " - perimetro " + circulo.calculaPerimetro() +
                " - area " + circulo.calculaArea());


    }
}


