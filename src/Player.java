package src;
public class Player {
    double spent;
    String name;
    bigBill b;
    boolean overAverage;
    boolean hasToPay;
    double due;
    double gets;

    public Player(String name, bigBill b) {
        this.name = name;
        this.b = b;
        b.players++;
        b.AL.add(this);
        this.due = 0;
        this.gets = 0;
    }

    public void add(double cost) {
        this.spent += cost;
        this.b.totalcost += cost;
    }
}