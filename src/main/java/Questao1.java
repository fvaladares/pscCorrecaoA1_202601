import java.util.Scanner;

public class Questao1 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;

        System.out.println("Programa para calcular " +
                "a área do retângulo");
        System.out.print("Informe a base e a altura, " +
                "separados por um espaço: ");

        base = entrada.nextInt();
        altura = entrada.nextInt();

        System.out.println();
        area = base * altura;
        System.out.printf("Resultado: %d\n", area);

        System.out.println("Até a próxima \uD83D\uDD96\uD83C\uDFFD");
    }
}
