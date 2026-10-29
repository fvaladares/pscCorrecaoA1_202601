import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int somatorio = 0;
        System.out.println("Programa que exibe " +
                "o somatório de 1 até N");
        System.out.print("Informe o número: ");
        numero = entrada.nextInt();
        if (numero > 0) {
            for (int i = 0; i <= numero; i++) {
                somatorio += i;
            }
            System.out.println();
            System.out.printf("Soma: %d\n", somatorio);
        } else {
            System.out.println("O valor informado deve " +
                    "ser maior do que zero.");
        }
    }
}
