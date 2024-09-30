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
        if(getFaceValue() == 14){
            return getSuit() + "-Ace";
        }else if(getFaceValue() == 11){
            return getSuit() + "-Jack";
        }else if(getFaceValue() == 12){
            return getSuit() + "-Queen";
        }else if(getFaceValue() == 13){
            return getSuit() + "-King";
        }
        return getSuit() + "-" +getFaceValue();
    } 
}
