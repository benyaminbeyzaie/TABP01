package OOP;

public class Tile {
    boolean isOccupied;
    int number;
    Ladder ladder;
    Python python;

    Tile(boolean isOccupied, int number, Ladder ladder, Python python){
        this.isOccupied = isOccupied;
        this.number = number;
        this.ladder = ladder;
        this.python = python;
    }
}
