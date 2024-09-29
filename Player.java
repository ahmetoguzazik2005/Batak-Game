import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;// players name  
    private ArrayList<Card> myCards;// players's card

    public Player(String name, ArrayList<Card> myCards){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
        setPlayerCards(myCards);
    }
    public void setPlayerCards(ArrayList<Card> myCards){
        this.myCards = myCards;
    }
    
    public String getName(){
        return name;
    }
    public ArrayList<Card> getPlayerCards(){
        return myCards;
    }
    /**
     * allow user to play its card
     * @return the card which is played
     */
    public Card playCard(){
        Scanner scanner = new Scanner(System.in);

        
    }
    /**
     * it will show user to which cards can be play
     */
    public void playableCards(){

    }
    
    

}
