package src;
public class Bill{
    public static void main(String[] args) {
        bigBill game = new bigBill("Lenzerheide");
        Player meli = new Player("meli", game);
        Player joel = new Player("joel", game);
        Player andri = new Player("andri", game);
        Player julia = new Player("julia", game);
        Player ella = new Player("ella", game);
        
        
        meli.add(68.95);
        andri.add(5.70);
        joel.add(2);
        ella.add(36.95);
        julia.add(0);
        joel.add(37.50);

        if(game.totalcost != 0)
            game.calculateForAll();
    }
}