public class Bill{
    public static void main(String[] args) {
        bigBill game = new bigBill("Lenzerheide");
        Player joel = new Player("joel", game);
        Player andri = new Player("andri", game);
        Player julia = new Player("julia", game);
        Player meli = new Player("meli", game);
        if(game.totalcost != 0)
        game.calculateForAll();
    }
}