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

    public void removeCard(Card card){
        for(int i = 0; i < cards.length; i++){
            if(cards[i] == card){
                cards[i] = null;
            }
        }
    }

    public int getCardCount(){
        int count = 0;
        for(Card c:cards){
            if(c != null){
                count++;
            }
        }
        return count;
    }
}
