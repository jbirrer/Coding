package src;

import java.util.*;

public class bigBill {

    double totalcost;
    int players;
    ArrayList<Player> AL;
    double totalPerPlayer;
    String edition;

    public bigBill(String edition) {
        this.edition = edition;
        this.AL = new ArrayList<Player>();
        System.out.println("Willkommen zu Joël's Bill Splitter Tool v1! Edition " + this.edition);
    }

    public void setTotalPerPlayer() {
        this.totalPerPlayer = totalcost / players;
    }

    public void printPtoP() {
        // experimental
        for (Player p : AL) {
            if (p.hasToPay) {
                for (Player r : AL) {
                    if (!r.hasToPay) {
                        if (p.due != 0) {
                            if (r.gets > p.due) {
                                r.gets = r.gets - p.due;
                                System.out.println(p.name + " muss " + p.due + " an " + r.name + " zahlen.");
                                p.due = 0;
                            } else if (r.gets == p.due) {
                                System.out.println(p.name + " muss " + r.gets + " an " + r.name + " zahlen.");
                            } else {
                              
                                p.due = p.due - r.gets;
                                System.out.println(p.name + " muss " + r.gets + " an " + r.name + " zahlen.");
                                r.gets = 0;
                            }
                        }

                    }
                }
            }
        }
    }

    public void calculateForAll() {
        this.setTotalPerPlayer();
        System.out.println("----");
        for (Player p : AL) {
            if (p.spent < this.totalPerPlayer) {
                p.hasToPay = true;
                //System.out.println(p.name + " muss " + (this.totalPerPlayer - p.spent) + " bezahlen");
                p.due = this.totalPerPlayer - p.spent;
            } else {
                //System.out.println(p.name + " bekommt " + (p.spent - this.totalPerPlayer) + " Geld");
                p.gets = p.spent - this.totalPerPlayer;
            }
        }
        //System.out.println("----");
        printPtoP();

    }
}
