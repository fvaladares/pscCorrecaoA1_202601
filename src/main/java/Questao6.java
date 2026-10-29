import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdNotas;
        int qtdAprovados = 0;
        int qtdReprovados = 0;
        int media = 6;
        int nota;
        int limiteInferiorNota = 0;
        int limiteSuperiorNota = 10;

        System.out.println("Sistema de controle de notas");
        System.out.print("Informe a quantidade de notas: ");
        qtdNotas = sc.nextInt();
        System.out.println();
        for (int i = 0; i < qtdNotas; i++) {
            System.out.printf("Nota %d: ", (i + 1));
            nota = sc.nextInt();
            if (nota < limiteInferiorNota || nota > limiteSuperiorNota) {
                System.out.println("ERRO: Valor inválido informado");
                i--;
            } else if (nota < media)
                qtdReprovados++;
            else
                qtdAprovados++;
        }
        System.out.println();
        System.out.printf("Aprovados: %d\n", qtdAprovados);
        System.out.printf("Reprovados: %d\n", qtdReprovados);
    }
}
