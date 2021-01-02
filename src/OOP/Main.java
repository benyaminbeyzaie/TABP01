package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int size = 100;
        ArrayList<String> pythons = new ArrayList<>();
        pythons.add("99,8");
        pythons.add("9,8");
        pythons.add("80,8");
        pythons.add("44,8");
        pythons.add("55,8");
        ArrayList<String> ladders = new ArrayList<>();
        ladders.add("3,32");
        ladders.add("30,38");
        ladders.add("30,79");
        ladders.add("30,66");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());

        Board board = new Board(size, pythons, ladders, players);
        Game game = new Game(board, 6);
        game.printBoard();
        game.moveWithDice(0, 3);
        System.out.println("_________________");
        game.printBoard();

    }
}
