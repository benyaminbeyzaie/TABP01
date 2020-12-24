package OOP;

import java.util.Random;

public class Game {
    Board board;
    Random random = new Random();
    int diceRange;

    Game(Board board, int diceRange){
        this.board = board;
        this.diceRange = diceRange;
    }

    public int makeDice(){
        return random.nextInt(diceRange) + 1;
    }

    private void move(int playerNumber, int start, int end){
        Tile endTile = board.mainBoardTiles.get(end);
        if (endTile.python != null){
            move(playerNumber, start, endTile.python.end.number);
        }else if (endTile.ladder != null){
            move(playerNumber, start, endTile.ladder.end.number);
        }else {
            board.mainBoardTiles.get(start).isOccupied = false;
            board.players.get(playerNumber).occupiedTile = endTile;
            endTile.isOccupied = true;
        }
    }

    public void moveWithDice(int playerNumber, int diceNumber){
        if (board.players.get(playerNumber).occupiedTile == null)
            board.players.get(playerNumber).occupiedTile = board.mainBoardTiles.get(0);
        int currentTileNumber = board.players.get(playerNumber).occupiedTile.number;
        int toMoveTileNumber = currentTileNumber + diceNumber;
        System.out.println(toMoveTileNumber);
        move(playerNumber, currentTileNumber, toMoveTileNumber);
    }

    public int isGameEnded(){
        for (Player player :
                this.board.players) {
            if (player.occupiedTile.number == board.mainBoardTiles.size())
                return board.players.indexOf(player);
        }
        return -1;
    }

    public void printBoard(){
        System.out.print(board);
    }
}
