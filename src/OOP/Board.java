package OOP;

import java.util.ArrayList;

public class Board {
    // 20,3
    // 4,2
    ArrayList<Tile> mainBoardTiles = new ArrayList<>();
    ArrayList<Python> pythons = new ArrayList<>();
    ArrayList<Ladder> ladders = new ArrayList<>();
    ArrayList<Player> players;

    Board(int size, ArrayList<String> pythonsStrings, ArrayList<String> laddersStrings, ArrayList<Player> players){
        // create all tiles
        for (int i = 1; i < size + 1; i++) {
            mainBoardTiles.add(new Tile(false, i, null, null));
        }
        // create pythons
        for (int i = 0; i < pythonsStrings.size(); i++) {
            // i,j
            String[] strings = pythonsStrings.get(i).split(",");
            int start = Integer.parseInt(strings[0]);
            int end = Integer.parseInt(strings[1]);
            Python python = new Python(mainBoardTiles.get(start), mainBoardTiles.get(end));
            pythons.add(python);
        }
        // create ladders
        for (int i = 0; i < laddersStrings.size(); i++) {
            // i,j
            String[] strings = laddersStrings.get(i).split(",");
            int start = Integer.parseInt(strings[0]);
            int end = Integer.parseInt(strings[1]);
            Ladder ladder = new Ladder(mainBoardTiles.get(start), mainBoardTiles.get(end));
            ladders.add(ladder);
        }
        this.players = players;
    }



    @Override
    public String toString() {
        String string = "";
        for (int i = 1; i <= mainBoardTiles.size(); i++) {
            if (mainBoardTiles.get(i - 1).isOccupied) string += "*";
            else string += "#";
            if (i % 10 == 0) string += "\n";
        }
        return string;
    }
}
