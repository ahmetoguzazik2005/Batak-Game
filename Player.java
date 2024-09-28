public class Player {
    private String name;// players name
    private Cards myCards;// players's card

    public Player(String name, Cards myCards){
        setName(name);
        setCards(myCards);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCards(Cards myCards){
        this.myCards = myCards;
    }
    public String getName(){
        return name;
    }
    
    // public Card playCard(){
        
    // }

}
