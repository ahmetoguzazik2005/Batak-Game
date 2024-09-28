public class CleverGame{
    private Cards totalCards;

    private Cards cards1;
    private Cards cards2;
    private Cards cards3;
    private Cards cards4;

    private Player player1;
    private Player player2;
    private Player player3; 
    private Player player4;

    private ScoreCards scorecard1;
    private ScoreCards scorecard2;
    private ScoreCards scorecard3;
    private ScoreCards scorecard4;

    CleverGame(Player player1, Player player2, Player player3, Player player4){
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;

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
    public Cards getTotalCards() {
        return totalCards;
    }

    public void setTotalCards(Cards totalCards) {
        this.totalCards = totalCards;
    }

    public Cards getCards1() {
        return cards1;
    }

    public void setCards1(Cards cards1) {
        this.cards1 = cards1;
    }

    public Cards getCards2() {
        return cards2;
    }

    public void setCards2(Cards cards2) {
        this.cards2 = cards2;
    }

    public Cards getCards3() {
        return cards3;
    }

    public void setCards3(Cards cards3) {
        this.cards3 = cards3;
    }

    public Cards getCards4() {
        return cards4;
    }

    public void setCards4(Cards cards4) {
        this.cards4 = cards4;
    }

    public ScoreCards getScorecard1() {
        return scorecard1;
    }

    public void setScorecard1(ScoreCards scorecard1) {
        this.scorecard1 = scorecard1;
    }

    public ScoreCards getScorecard2() {
        return scorecard2;
    }

    public void setScorecard2(ScoreCards scorecard2) {
        this.scorecard2 = scorecard2;
    }

    public ScoreCards getScorecard3() {
        return scorecard3;
    }

    public void setScorecard3(ScoreCards scorecard3) {
        this.scorecard3 = scorecard3;
    }

    public ScoreCards getScorecard4() {
        return scorecard4;
    }

    public void setScorecard4(ScoreCards scorecard4) {
        this.scorecard4 = scorecard4;
    }




}