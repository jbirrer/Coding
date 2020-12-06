package src;
public class Player {
    double spent;
    String name;
    bigBill b;
    boolean overAverage;

    public Player(String name, bigBill b) {
        this.name = name;
        this.b = b;
        b.players++;
        b.AL.add(this);
    }

    public void add(int cost) {
        this.spent += cost;
        this.b.totalcost += cost;
    }
}