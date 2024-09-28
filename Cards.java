import java.util.ArrayList;
import java.util.Random;


public class Cards {
    Boolean gameDeckControl = false;
    private ArrayList<Card> gameDeck;// each players cards


    public Cards(){
        gameDeck = new ArrayList<>();
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
                gameDeck.add(card);
            }
        }
        gameDeckControl = true;

    }
    public void shuffle(){
        Random random = new Random();
        for ( int i = 1; i <= 52; i++ ){
        int randomNumber = random.nextInt(gameDeck.size()) + 1;
        for()



        }

    }
}
