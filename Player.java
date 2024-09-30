import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;// players name  
    private ArrayList<Card> myCards;// players's card
    private ArrayList<Card> myPlayableCards;

    public Player(String name, ArrayList<Card> myCards){
        setName(name);
        setPlayerCards(myCards);
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
    public Card playCard(ArrayList<Card> playedCards, String specialCard){
        System.out.println("which card do you want to play");
        ArrayList<Card> toPlay = playableCards(playedCards, specialCard);
        show(toPlay);
        Scanner input = new Scanner(System.in);
        int whichToPlay = input.nextInt();
        Card cardPlayed = toPlay.get(whichToPlay - 1);
        playedCards.add(cardPlayed);
        myCards.remove(cardPlayed);
        return cardPlayed; 
    }
    /**
     * it will show user to which cards can be play
     */
    private ArrayList<Card> playableCards(ArrayList<Card> playedCards, String specialCard){
        int playableCardsNum = 0;
        myPlayableCards = new ArrayList<>();
        if(playedCards.isEmpty()){
            myPlayableCards = new ArrayList<>(myCards);
            return myPlayableCards;
        }else{
            //suit will be always same
            String suit = playedCards.getFirst().getSuit();
            int value = playedCards.getFirst().getFaceValue();//initial num

            if(playedCards.size() > 0){
                // check if there any special, you can play any number in the suit form 
                boolean isThereSpecial = false;//prevents mistakes in only specialCard turns
                if(suit != specialCard){
                    for(int i = 1; i < playedCards.size(); i++){
                        if(playedCards.get(i).getSuit() == specialCard){
                            isThereSpecial = true;
                        }
                    }
                }
                for(int i = 1; i < playedCards.size(); i++){
                    if(!isThereSpecial && suit == playedCards.get(i).getSuit() && playedCards.get(i).getFaceValue() > value){
                        value = playedCards.get(i).getFaceValue();
                    }
                }
            }
            //is there any playable same suit with the higher number
            for(int i = 0; i < myCards.size(); i++){
                if(myCards.get(i).getSuit() == suit && myCards.get(i).getFaceValue() > value){
                    myPlayableCards.add(myCards.get(i));
                    playableCardsNum++;
                }
            }
            // if not look for the less num in the same card suit
            if(playableCardsNum == 0){
                for(int i = 0; i < myCards.size(); i++){
                    if(myCards.get(i).getSuit() == suit){
                        myPlayableCards.add(myCards.get(i));
                        playableCardsNum++;
                    }
                }
            }
            if(playableCardsNum == 0){
                value = 0;
                //takes the most pointed specialCard
                for(int j = 0; j < playedCards.size(); j++){
                    if(playedCards.get(j).getSuit() == specialCard){
                        if(playedCards.get(j).getFaceValue() > value){
                            value = playedCards.get(j).getFaceValue() ;
                        }
                    }
                }
                for(int i = 0; i < myCards.size(); i++){
                    if(myCards.get(i).getSuit() == specialCard && myCards.get(i).getFaceValue() > value){
                        myPlayableCards.add(myCards.get(i));
                        playableCardsNum++;
                    }
                }
            }
            if(playableCardsNum == 0){
                return myCards;
            }
            return myPlayableCards;
        }   
    }
    public void show(ArrayList<Card> toPlay){
        for(int i = 0; i <toPlay.size(); i++){
            System.out.print((i + 1) + ") " + toPlay.get(i).toString() + " ");
        }
    }

    public String toString(){
        return getName();
    }
    
    

}
