import java.util.*;
public class bigBill {

    double totalcost;
    int players;
    ArrayList<Player> AL;
    double totalPerPlayer;

    public bigBill(){
        this.AL = new ArrayList<Player>();
    }

    public void setTotalPerPlayer(){
        this.totalPerPlayer = totalcost / players;
    }

    public void calculateForAll(){
        this.setTotalPerPlayer();
        for (Player p : AL){
            if(p.spent < this.totalPerPlayer){
                System.out.println(p.name + " muss " + (this.totalPerPlayer - p.spent) + " bezahlen");
            } else {
                System.out.println(p.name + " bekommt " + (p.spent - this.totalPerPlayer) + " Geld");
            }
        }
    }
}
