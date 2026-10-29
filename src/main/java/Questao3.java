import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int media = 6;
        int notaParaExame = 4;
        int notaMaxima = 10;
        int notaMinima = 0;
        String aprovado = "Aprovado";
        String reprovado = "Reprovado";
        String exame = "Exame";
        String msgSaida;
        System.out.println("Programa para determinar " +
                "a situação do estudante.");
        System.out.print("Informe a nota: ");
        nota = sc.nextInt();

        if (nota <= notaMaxima && nota >= notaMinima) {
            if (nota >= media)
                msgSaida = aprovado;
            else if (nota >= notaParaExame)
                msgSaida = exame;
            else
                msgSaida = reprovado;
            System.out.printf("Saída: %s", msgSaida);
        } else {
            System.out.println("ERRO: A nota deve estar dentro do " +
                    "intervalo de 0 a 10.");
        }
    }
}
