import java.util.Arrays;

public class Player {
    private String name;
    private Card[] cards;
    private Card currentCard;

    public Player(String name, int totalCards){
        this.name = name;
        this.cards = new Card[totalCards];
        //Arrays.fill(cards, null);
        currentCard = cards[0];
    }

    public void addCard(Card card){
        for(int i = 0; i < cards.length; i++){
            if(cards[i] == null){
                cards[i] = card;
                break;
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

    public String getPlayerName(){
        return name;
    }

    public int getCardIndex(Card card){
        for(int i = 0; i < cards.length; i++){
            if(cards[i] == card){
                return i;
            }
        }
    }

    public void nextCard(){
        if(currentCard == null) currentCard = cards[0];
        else{
            boolean isCardFound = false;
            while(!isCardFound){
                int i = cards.getCardIndex(currentCard);
            }
        }
    }

    public Card getCurrentCard(){
        return currentCard;
    }

    public boolean hasWon(){
        return getCardCount() == cards.length;
    }
}
