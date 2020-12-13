package src;

import java.io.FileWriter;
import java.util.*;

public class bigBill {
    double totalcost;
    int players;
    ArrayList<Player> AL;
    double totalPerPlayer;
    String edition;
    String end;

    public bigBill(String edition) {
        this.edition = edition;
        this.AL = new ArrayList<Player>();
        System.out.println("Willkommen zu Joël's Bill Splitter Tool v1! Edition " + this.edition);
        this.end = "";
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
                                end += p.name + " muss " + Math.round(p.due) + " an " + r.name + " zahlen." + " \n";
                                System.out.println(p.name + " muss " + Math.round(p.due) + " an " + r.name + " zahlen.");
                                p.due = 0;
                            } else if (r.gets == p.due) {
                                System.out.println(p.name + " muss " + Math.round(r.gets) + " an " + r.name + " zahlen.");
                                end += p.name + " muss " + Math.round(r.gets) + " an " + r.name + " zahlen." + " \n";
                            } else {
                                p.due = p.due - r.gets;
                                System.out.println(p.name + " muss " + Math.round(r.gets) + " an " + r.name + " zahlen.");
                                end += p.name + " muss " + Math.round(r.gets) + " an " + r.name + " zahlen." + "\n";
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
        printToFile();
    }

    public void printToFile(){
        try {
            FileWriter file = new FileWriter("C:/txt/haha.txt");
            file.write(end);
            file.close();
        } catch (Exception e) {
            
        }
    }
}



