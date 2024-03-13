import java.util.Arrays;

public class Player {
    private String name;
    private Card[] cards;

    public Player(String name, int totalCards){
        this.name = name;
        this.cards = new Card[totalCards];
        Arrays.fill(cards, null);
    }

    public void addCard(Card card){
        for(int i = 0; i < cards.length; i++){
            if(cards[i] == null){
                cards[i] = card;
            }
        }
    }
}
