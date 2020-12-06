public class Bill{
    public static void main(String[] args) {
        bigBill game = new bigBill();
        Player joel = new Player("joel", game);
        Player andri = new Player("andri", game);
        Player julia = new Player("julia", game);
        Player meli = new Player("meli", game);
        joel.add(3);
        andri.add(6);
        julia.add(12);
        meli.add(8);

        game.calculateForAll();
    }
}