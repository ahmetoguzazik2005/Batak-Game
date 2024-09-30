import java.util.ArrayList;
import java.util.Random;

public class Cards {
    private ArrayList<Card> gameDeck;// total cards
    private ArrayList<Card> shuffledGameDeck; 
    private ArrayList <Card> playerCard1;
    private ArrayList <Card> playerCard2;
    private ArrayList <Card> playerCard3;
    private ArrayList <Card> playerCard4;

    public Cards(){
        this.gameDeck = new ArrayList<>();
        this.shuffledGameDeck = new ArrayList<>();
        createFullPackOfCards();
        shuffle();

    }

    public void createFullPackOfCards(){
        String[] suits = {"Heart", "Spade", "Club", "Diamond"};

        // Adding all cards for each suit (1 to 13)
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                Card card = new Card(i, suit);
                gameDeck.add(card);
            }
        }
    }

    public void shuffle(){
        Random random = new Random();
        this.playerCard1 = new ArrayList<>();
        this.playerCard2 = new ArrayList<>();
        this.playerCard3 = new ArrayList<>();
        this.playerCard4 = new ArrayList<>();

        for ( int i = 1; i <= 52; i++ ){
        int randomNumber = random.nextInt(53 - i);

        shuffledGameDeck.add(gameDeck.get(randomNumber));
        
        if ( i % 4 == 0 ){
            playerCard4.add(gameDeck.get(randomNumber));
        }else if ( i % 4 == 1){
            playerCard1.add(gameDeck.get(randomNumber));
        }else if ( i % 4 == 2){
            playerCard2.add(gameDeck.get(randomNumber));
        }else if ( i % 4 == 3){
            playerCard3.add(gameDeck.get(randomNumber));
        }
        gameDeck.remove(randomNumber);

        }
    }
    
    public ArrayList<Card> getPlayerCard1() {
        return playerCard1;
    }

    public ArrayList<Card> getPlayerCard2() {
        return playerCard2;
    }

    public ArrayList<Card> getPlayerCard3() {
        return playerCard3;
    }

    public ArrayList<Card> getPlayerCard4() {
        return playerCard4;
    }
}
