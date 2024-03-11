package gameTicTacToe;

public class TicTacToe {



    private final TicTacToeEnums[][] board;
    public TicTacToe(TicTacToeEnums[][] board) {
        this.board = board;
    }

    public void board() {
        System.out.println("-------------");
        for(int index = 0; index < 3; index++){
            System.out.println("| ");
            for(int count = 0; count < 3; count++)
                System.out.print(board[index][count] + " | ");

        }
    }
}
