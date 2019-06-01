import java.util.Scanner;

public class Principal {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] arg) {

        char opcao = '0';
        do {
            System.out.println("| - - - - - - - - - - - - - - - - - -   |");
            System.out.println("|  Escolha a figura geométrica deseja!  |");
            System.out.println("| - - - - - - - - - - - - - - - - - - - |");
            System.out.println("|[1] - Quadrado                         |");
            System.out.println("|[2] - Retangulo                        |");
            System.out.println("|[3] - Circulo                          |");
            System.out.println("|[4] - Sair                             |");
            System.out.println("| - - - - - - - - - - - - - - - - - - - |");
            System.out.print("\nInsira uma opção: ");
            opcao = ler.next().charAt(0);
            switch (opcao) {
                case '1':
                    Principal.calculaQuadrado();
                    break;
                case '2':
                    Principal.calculaRetangulo();
                    break;
                case '3':
                    Principal.calculaCirculo();
                    break;
                case '4':
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Você inseriu uma opção incorreta...");
                    System.out.println("Para voltar ao menu digite 1, para finalizar qualquer outra tecla");
                    char opcaoDefault = ler.next().charAt(0);
                    if (opcaoDefault != '1') {
                        System.out.println("Você saiu!");
                        opcao = '4';
                    }
            }
        } while (opcao != '4');
    }

    private static void calculaQuadrado(){

        System.out.println("Digite o tamanho dos lados do quadrado: ");
        float a = ler.nextFloat();
        Quadrado quadrado = new Quadrado(a);
        System.out.println("Quadrado: \nlados: " + quadrado.getLado1() +
                " - perimetro: " + quadrado.calculaPerimetro() +
                " - área: " + quadrado.calculaArea() + "\n");
    }

    private static void calculaRetangulo(){

        System.out.println("Digite o tamanho da base do retangulo: ");
        float b = ler.nextFloat();
        System.out.println("Digite o tamanho da altura do retangulo: ");
        float h = ler.nextFloat();
        Retangulo retangulo = new Retangulo(b, h);
        System.out.println("Retangulo: \nbase: " + retangulo.getLado1() + " - altura: " + retangulo.getLado2() +
                " - perimetro: " + retangulo.calculaPerimetro() +
                " - área: " + retangulo.calculaArea() + "\n");
    }

    private static void calculaCirculo(){

        System.out.println("Digite o tamanho do raio do circulo: ");
        float raio = ler.nextFloat();
        Circulo circulo = new Circulo(raio);

        System.out.printf("Círculo: \nraio: %.2f - perimetro: %.2f - area: %.2f \n\n",circulo.getRaio(), circulo.calculaPerimetro(),circulo.calculaArea());
    }

}


