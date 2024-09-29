public class CleverGame{
    private Player player1;
    private Player player2;
    private Player player3; 
    private Player player4;

    private ScoreCards scorecard;


    CleverGame(Player player1, Player player2, Player player3, Player player4){
        setPlayer1(player1);
        setPlayer2(player2);
        setPlayer3(player3);
        setPlayer4(player4);
        ScoreCards s1 = new ScoreCards();
    }
   /*  public boolean playTurn(Player player, Card card){


    }
    public boolean isTurnOf(Player player){

    }
    public boolean isGameOver(){

    }
    public int getScore(){

    }
    public  String getName(int playerNumber){

    }
    public int getRoundNo(){

    }
    public int getTurnOffPlayerNo(){

    }
    public Player getWinner(){

    }*/
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





}