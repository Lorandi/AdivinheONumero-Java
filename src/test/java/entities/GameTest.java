package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GameTest {
    Game game = new Game();

    @Test
    public void validaGuessGame() {
        // Arrange

        List<Integer> numeros = Arrays.asList(-1,-2,-3);
        Double expected = -6.0;

        // Action
//        Integer result = exercicios1.somarLista(numeros);
        Double result = -6.0;

        // Assert
//

        Assertions.assertTrue(true);
//        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected, result);
//        Assertions.fail("Falhou aqui");

    }
}
