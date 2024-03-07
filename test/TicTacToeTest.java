import gameTicTacToe.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeTest {
    @Test
    public void testTicTacToeExist(){
        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe);
    }
    @Test
    public void testThatTwoPlayersCanPlayTicTacToe(){
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(2, ticTacToe.twoPlayers(2));
    }
    @Test
    public void testPlayersMovementOnTheBoard(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.playersMovement();

    }
}
