public class AvaliadorDeSituacaoDoEstudante {

    public String avaliarSituacao(int nota) {
        int media = 6;
        int notaParaExame = 4;
        int notaMaxima = 10;
        int notaMinima = 0;
        String aprovado = "Aprovado";
        String reprovado = "Reprovado";
        String exame = "Exame";
        String msgSaida;

        if (nota <= notaMaxima && nota >= notaMinima) {
            if (nota >= media)
                msgSaida = aprovado;
            else if (nota >= notaParaExame)
                msgSaida = exame;
            else
                msgSaida = reprovado;
            System.out.println("Saída: " + msgSaida);
        } else {
            throw new IllegalArgumentException("ERRO: A nota deve estar dentro do " +
                    "intervalo de 0 a 10.");
        }
        return msgSaida;
    }
}
