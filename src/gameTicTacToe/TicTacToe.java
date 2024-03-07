package gameTicTacToe;

public class TicTacToe {
    private int noOfPlayers = 2;

    private String[][] boardElements = new String[3][3];
    public TicTacToe(){
        for(int index = 0; index < boardElements.length; index++){
            for(int count = 0; count < boardElements.length; count++){
                boardElements[index][count] = "EMPTY";
            }
        }

    }
    public int twoPlayers(int players) {
        return noOfPlayers;
    }

    public void playersMovement() {
        
    }
}
