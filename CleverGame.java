import java.util.ArrayList;

public class CleverGame{
    private Player player1;
    private Player player2;
    private Player player3; 
    private Player player4;
    private Player playerWinner;
    private ArrayList<Player> playerTurns = new ArrayList<>();// to determine who to play
    private ArrayList<Card> playedCards = new ArrayList<>();// played cards at the table
    // the reason why i chose is in round one lists are created according to cards
    // but from round 1 turns will be determinde by winner
    private int playTurn = 1;

    private ScoreCards scorecard;
    
    CleverGame(Player player1, Player player2, Player player3, Player player4){
        setPlayer1(player1);
        setPlayer2(player2);
        setPlayer3(player3);
        setPlayer4(player4);
        scorecard = new ScoreCards();
    }
    // public boolean playTurn(Player player, Card card){


    // }
    // public boolean isTurnOf(Player player){

    // }
    // public boolean isGameOver(){

    // }
    // public int getScore(){

    // }
    // public  String getName(int playerNumber){

    // }
    // public int getRoundNo(){

    // }
    // public int getTurnOffPlayerNo(){

    // }
    public Player getWinner(){
    //update s1 update;

    }
    /*
     * every turn it will change the list according to winner 
     * at the first turn it will create according to spade two
     */
    public ArrayList<Player> setPlayTurn(){
        ArrayList<Player> order = new ArrayList<>();
        if(playTurn == 1){
            playTurn++;//prevent to happen again
            if(isSpadeTwo(player1.getPlayerCards())){
                order.add(player1);
                order.add(player2);
                order.add(player3);
                order.add(player4);
                return order;
            }else if(isSpadeTwo(player2.getPlayerCards())){
                order.add(player2);
                order.add(player3);
                order.add(player4);
                order.add(player1);
                return order;
            }else if(isSpadeTwo(player3.getPlayerCards())){
                order.add(player3);
                order.add(player4);
                order.add(player1);
                order.add(player2);
                return order;
            }else{
                order.add(player4);
                order.add(player1);
                order.add(player2);
                order.add(player3);
                return order;
            }
        }else{
            if(playerWinner == player1){
                order.add(player1);
                order.add(player2);
                order.add(player3);
                order.add(player4);
                return order;
            }else if(playerWinner == player2){
                order.add(player2);
                order.add(player3);
                order.add(player4);
                order.add(player1);
                return order;
            }else if(getWinner() == player3){
                order.add(player3);
                order.add(player4);
                order.add(player1);
                order.add(player2);
                return order;
            }else{
                order.add(player4);
                order.add(player1);
                order.add(player2);
                order.add(player3);
                return order;
            }   
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer3() {
        return player3;
    }

    public void setPlayer3(Player player3) {
        this.player3 = player3;
    }

    public Player getPlayer4() {
        return player4;
    }

    public void setPlayer4(Player player4) {
        this.player4 = player4;
    }
    
    public ScoreCards getScorecard() {
        return scorecard;
    }
    /**
     * search for spade two
     * @param list players deck
     * @return isSpadetwo is this hand
     */
    public boolean isSpadeTwo(ArrayList<Card> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getSuit() == "Spade"){
                if(list.get(i).getFaceValue() == 2){
                    return true;
                }
            }
        }
        return false;
    }
}