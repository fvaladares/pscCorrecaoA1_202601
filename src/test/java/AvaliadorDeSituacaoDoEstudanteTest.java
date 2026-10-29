import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AvaliadorDeSituacaoDoEstudanteTest {

    AvaliadorDeSituacaoDoEstudante avaliadorDeSituacaoDoEstudante;
    @BeforeEach
    void setUp() {
        avaliadorDeSituacaoDoEstudante = new AvaliadorDeSituacaoDoEstudante();
    }

    @DisplayName("Teste parametrizado avaliando condições de aprovação, reprovação e exame")
    @ParameterizedTest(name = "Nota {0} deverá retornar {1}")
    @CsvSource({
            "6,Aprovado",
            "10, Aprovado",
            "5, Exame",
            "4, Exame",
            "1, Reprovado"})
    void avaliarSituacaoComTestesOK(int nota, String valorEsperado) {
        String valorRetornado = avaliadorDeSituacaoDoEstudante.avaliarSituacao(nota);

        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    @DisplayName("Teste com nota acima do limite permitido, deve lançar exceçao")
    void avaliarSitacaoAlunoLancandoExcecaoPorNotaInvalidaAcima(){
        // arrange
        int nota = 50;

        assertThrows(IllegalArgumentException.class,()->{
            avaliadorDeSituacaoDoEstudante.avaliarSituacao(nota);
        });
    }


    @Test
    @DisplayName("Teste com nota abaixo do limite permitido, deve lançar exceçao")
    void avaliarSitacaoAlunoLancandoExcecaoPorNotaInvalidaAbaixo(){
        // arrange
        int nota = -1;

        //assert
        assertThrows(IllegalArgumentException.class,()->{
            //act
            avaliadorDeSituacaoDoEstudante.avaliarSituacao(nota);
        });
    }
}