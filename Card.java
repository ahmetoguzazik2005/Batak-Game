public class Card {
    private int faceValue; // the numerical value
    private String  suit; // the type of the card
    public Card(int faceValue, String suit){
        setFaceValue(faceValue);
        setSuit(suit);
    }
    public void setFaceValue(int faceValue){
        this.faceValue = faceValue;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public int getFaceValue(){
        return faceValue;
    }
    public String getSuit(){    
        return suit;
    }   
    public String toString(){
        return getSuit() + getFaceValue();
    } 
}
