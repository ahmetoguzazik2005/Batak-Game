import java.util.ArrayList;
public class Player {
    private String name;// players name
    private ArrayList<Card> myCards;// players's card

    public Player(String name, ArrayList<Card> myCards){
        setName(name);
        setPlayerCards(myCards);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPlayerCards(ArrayList<Card> myCards){
        this.myCards = myCards;
    }
    public String getName(){
        return name;
    }
    
    // public Card playCard(){
        
    // }

}
