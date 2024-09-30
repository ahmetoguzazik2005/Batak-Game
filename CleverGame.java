import java.util.*;

public class CleverGame{
    private Player player1;
    private Player player2;
    private Player player3; 
    private Player player4;
    private boolean playerB1 = true;
    private boolean playerB2 = true;
    private boolean playerB3 = true;
    private boolean playerB4 = true;
    private Player lastBetter;
    private int minimalBet = 5;
    private int biggestBet;
    Scanner input;
    String choice;
    int spadeTwoNo;
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
        ScoreCards s1 = new ScoreCards();
        scorecard = new ScoreCards();
        input = new Scanner (System.in);
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
        return player1;// for just now, debugging

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
            if(getWinner() == player1){
                order.add(player1);
                order.add(player2);
                order.add(player3);
                order.add(player4);
                return order;
            }else if(getWinner() == player2){
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
    public void run(){
        for ( int spin = 1; spin <= 13; spin++ ){

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
    public void bet(){
        boolean cont = true;
        minimalBet = 5;
        biggestBet = 5;
        int finishN = 0;
        while (cont){      
            if(playerB1 == false){
                finishN++;
            }else if(playerB2 == false){
                finishN++;
            }else if(playerB3 == false){
                finishN++;
            }else if(playerB4 == false){
                finishN++;
            }
            
            if ( finishN < 3 ){
                if(isSpadeTwo(player1.getPlayerCards())){
                    lastBetter = player1;
                    if ( playerB1){
                        playerB1 = betQuestions(player1);
                    }
                    if ( playerB2){
                        playerB2 = betQuestions(player2);
                    }
                    if ( playerB3){
                        playerB3 = betQuestions(player3);
                    }
                    if ( playerB4){
                        playerB4 = betQuestions(player4);
                    }
    
                }else if(isSpadeTwo(player2.getPlayerCards())){
                    lastBetter = player2;
                    if ( playerB2){
                        playerB2 = betQuestions(player2);
                    }
                    if ( playerB3){
                        playerB3 = betQuestions(player3);
                    }
                    if ( playerB4){
                        playerB4 = betQuestions(player4);
                    }
                    if ( playerB1){
                        playerB1 = betQuestions(player1);
                    }
    
                }else if(isSpadeTwo(player3.getPlayerCards())){
                    lastBetter = player3;
                    if ( playerB3){
                        playerB3 = betQuestions(player3);
                    }
                    if ( playerB4){
                        playerB4 = betQuestions(player4);
                    }
                    if ( playerB1){
                        playerB1 = betQuestions(player1);
                    }
                    if ( playerB2){
                        playerB2 = betQuestions(player2);
                    }
                   
                }else if(isSpadeTwo(player4.getPlayerCards())) {
                    lastBetter = player4;
                    if ( playerB4){
                        playerB4 = betQuestions(player4);
                    }
                    if ( playerB1){
                        playerB1 = betQuestions(player1);
                    }
                    if ( playerB2){
                        playerB2 = betQuestions(player2);
                    }
                    if ( playerB3){
                        playerB3 = betQuestions(player3);
                    }
    
                }
            }else{
                cont = false;

                return;
            } 
        }

    }
    public boolean betQuestions(Player who){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Minimal bet is: " + (minimalBet) );
        System.out.println( who.getName() +", do you want to bet?");
        System.out.println("yes/no");
        choice = input.nextLine();
        choice = choice.toLowerCase();
        int bet;
        while(true){
            if(choice.equals("yes")){
                System.out.println("Your bet: ");
                bet = input.nextInt();
                input.nextLine();
                while(true){
                    if( bet >= minimalBet ){
                        minimalBet = bet + 1;
                        biggestBet = bet;
                        lastBetter = who;
    
                        return true;
                    }else{
                        System.out.println("Invalid bet");
                        System.out.println("Do you want to bet again, yes / no");
                        String choice3 = input.nextLine().toLowerCase();
                        if ( choice3.equals("yes")){
                            System.out.println("Your bet: ");
                            bet = input.nextInt();
                            input.nextLine();

                        }else if(choice3.equals("no")){
                            return false;

                        }
                    }

                }


            }else if(choice.equals("no")){
                return false;

    
            }else{System.out.println("Invalid input");
                System.out.println("yes/no");
                choice = input.nextLine();
                choice = choice.toLowerCase();
    
            }
        }

    }
        public Player getLastBetter() {
        return lastBetter;
    }
    public int getBiggestBet() {
        return biggestBet;
    }
}