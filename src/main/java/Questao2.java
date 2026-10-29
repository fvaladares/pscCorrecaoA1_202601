import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos;
        int meses;
        int dias;
        int idadeEmDias;
        int anosEmDias = 365;
        int mesesEmDias = 30;
        System.out.println("\tPrograma para converter a idade em dias");
        System.out.print("Informe os anos, " +
                "meses e dias, \nseparados " +
                "por um espaço em branco: ");
        anos = sc.nextInt();
        meses = sc.nextInt();
        dias = sc.nextInt();
        System.out.println();
        idadeEmDias = (anos * anosEmDias) +
                (meses * mesesEmDias) +
                dias;
        System.out.printf("Total de dias: %d",
                idadeEmDias);
    }
}
