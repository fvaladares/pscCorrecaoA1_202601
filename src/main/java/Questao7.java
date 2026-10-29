import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdMedidas = 7;
        int[] temperaturas = new int[qtdMedidas];
        int maiorTemperatura;
        int menorTemperatura;
        int temperaturaMedia;
        int qtdDiasAcimaMedia = 0;
        int temperaturaAcumulada = 0;

        System.out.println("Sistema de controle de temperatura");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Temperatura do dia %d: ",
                    (i + 1));
            temperaturas[i] = sc.nextInt();
            temperaturaAcumulada += temperaturas[i];
        }

        System.out.println();
        System.out.println("Fim da leitura de temperaturas.");
        System.out.println("Continuando os cálculos.");
        temperaturaMedia = temperaturaAcumulada / temperaturas.length;

        maiorTemperatura = menorTemperatura = temperaturas[0];
        if (temperaturas[0] > temperaturaMedia)
            qtdDiasAcimaMedia++;

        for (int i = 1; i < temperaturas.length; i++) {
            int tempAtual = temperaturas[i];
            if (tempAtual > maiorTemperatura)
                maiorTemperatura = tempAtual;
            else if (tempAtual < menorTemperatura)
                menorTemperatura = tempAtual;

            if (tempAtual > temperaturaMedia)
                qtdDiasAcimaMedia++;
        }

        System.out.println();
        System.out.printf("Maior: %d \n", maiorTemperatura);
        System.out.printf("Menor: %d \n", menorTemperatura);
        System.out.printf("Média: %d \n", temperaturaMedia);
        System.out.printf("Dias acima da média: %d \n",
                qtdDiasAcimaMedia);

        System.out.println("Até a próxima \uD83D\uDD96\uD83C\uDFFD");

    }
}
