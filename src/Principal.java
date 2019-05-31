import java.util.Scanner;

public class Principal {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] arg) {

        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(5, 10);
        Circulo circulo = new Circulo();

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
                    System.out.println("Quadrado: \nlados: " + quadrado.getLado1() +
                            " - perimetro: " + quadrado.calculaPerimetro() +
                            " - área: " + quadrado.calculaArea() + "\n");
                    break;
                case '2':
                    System.out.println("Retangulo: \nbase: " + retangulo.getLado1() + " - altura: " + retangulo.getLado2() +
                            " - perimetro: " + retangulo.calculaPerimetro() +
                            " - área: " + retangulo.calculaArea() + "\n");
                    break;
                case '3':
                    System.out.println("Circulo: \nraio: " + circulo.getRaio() +
                            " - perimetro " + circulo.calculaPerimetro() +
                            " - area " + circulo.calculaArea());
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
}


