import java.util.*;

public class Player {
    double spent;
    String name;
    bigBill b;
    boolean overAverage;
    double bekommt;
    double zahlt;

    public Player(String name, bigBill b) {
        this.name = name;
        this.b = b;
        b.players++;
        b.AL.add(this);
        this.bekommt = 0;
        this.zahlt = 0;
    }

    public void add(int cost) {
        this.spent += cost;
        this.b.totalcost += cost;
    }
}