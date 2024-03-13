public class Player {
    private String name;
    private Card[] cards;

    public Player(String name, int totalCards){
        this.name = name;
        this.cards = new Card[totalCards];
    }
}
