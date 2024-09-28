import java.util.ArrayList;

public class Cards {
    private ArrayList<Card> deck;// each players cards


    public Cards(){
        deck = new ArrayList<>();
    }
    public void getTopCard(){

    }
    public void addTopCard(){

    }
    public void createFullPackOfCards(){
        String[] suits = {"Heart", "Spade", "Club", "Diamond"};

        // Adding all cards for each suit (1 to 13)
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                Card card = new Card(i, suit);
                deck.add(card);
            }
        }

    }
    public void shuffle(){

    }
}
