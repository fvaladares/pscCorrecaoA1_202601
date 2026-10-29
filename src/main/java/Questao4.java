import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int valorIngresso;
        int limiteInferiorIdade = 0;
        int limiteIdadeCrianca = 13;
        int limiteInferiorIdoso = 59;
        int valorIngressoCrianca = 10;
        int valorIngressoIdoso = 8;
        int valorIngressoNormal = 20;

        System.out.println("Controle de entrada do parque UNA");

//        while (true) {
        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();
        System.out.println();
        if (idade < limiteInferiorIdade) {
            System.out.println("ERRO: Idade deve ser maior do que zero");
        } else {
            if (idade < limiteIdadeCrianca) {
                valorIngresso = valorIngressoCrianca;
            } else if (idade > limiteInferiorIdoso) {
                valorIngresso = valorIngressoIdoso;
            } else {
                valorIngresso = valorIngressoNormal;
            }
            System.out.printf("\nValor: %d\n",
                    valorIngresso);
        }
//        }
    }
}
