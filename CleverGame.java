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
    private int lastNo;
    private int minimalBet = 5;
    private int biggestBet;
    private String specialCard;
    private boolean firsTime = true;
    Scanner input;
    String choice;
    int spadeTwoNo;
    private ScoreCards s1;
    private ArrayList<Card> playedCards = new ArrayList<>();// played cards at the table
    private ArrayList<Integer> whoPlayed;//who played cards at the table
    // the reason why i chose is in round one lists are created according to cards
    // but from round 1 turns will be determinde by winner
    private int playTurn = 1;

    
    CleverGame(Player player1, Player player2, Player player3, Player player4){
        setPlayer1(player1);
        setPlayer2(player2);
        setPlayer3(player3);
        setPlayer4(player4);
        s1 = new ScoreCards(player1,player2,player3,player4);
        input = new Scanner (System.in);
    }
    // public boolean playTurn(Player player, Card card){

    // }
    // public boolean isTurnOf(Player player){

    // }

    // public int getScore(){

    // }


    // public int getTurnOffPlayerNo(){

    // }

    
    public int getWinner(ArrayList<Card> playedCards, ArrayList<Integer> whoPlayed){
        boolean specialCardExist = false;
        int biggestValue = 0;

        for ( int i = 0; i < playedCards.size(); i++){
            if ( playedCards.get(i).getSuit().equals(specialCard)){
                specialCardExist = true;
                if (playedCards.get(i).getFaceValue() > biggestValue  ){
                    biggestValue = playedCards.get(i).getFaceValue();
                    lastNo = whoPlayed.get(i);
                }
            }
        }
        if ( !specialCardExist ){
            String suit = playedCards.get(0).getSuit();
            biggestValue = playedCards.get(0).getFaceValue();
            lastNo = whoPlayed.get(0);
            for ( int i = 1; i < playedCards.size(); i++ ){
                if ( playedCards.get(i).getSuit().equals(suit) && playedCards.get(i).getFaceValue() > biggestValue){
                    lastNo = whoPlayed.get(i);
                }
            }
        }
        s1.update(lastNo);
        return lastNo;
    }
    public void orderMaker(int lastNo){
        if ( lastNo == 1){
            whoPlayed = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
            System.out.println("Oğuz's turn");
            player1.playCard(playedCards, specialCard);
            System.out.println("Hidayet's turn");
            player2.playCard(playedCards, specialCard);
            System.out.println("Zeynep's turn");
            player3.playCard(playedCards, specialCard);
            System.out.println("Sila's turn");
            player4.playCard(playedCards, specialCard);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");

            System.out.println();

        }else if( lastNo == 2 ){
            whoPlayed = new ArrayList<Integer>(Arrays.asList(2,3,4,1));
            System.out.println("Hidayet's turn");
            player2.playCard(playedCards, specialCard);
            System.out.println("Zeynep's turn");
            player3.playCard(playedCards, specialCard);
            System.out.println("Sila's turn");
            player4.playCard(playedCards, specialCard);
            System.out.println("Oğuz's turn");
            player1.playCard(playedCards, specialCard);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();

        }else if ( lastNo == 3 ){
            whoPlayed = new ArrayList<Integer>(Arrays.asList(3,4,1,2));
            System.out.println("Zeynep's turn");
            player3.playCard(playedCards, specialCard);
            System.out.println("Sila's turn");
            player4.playCard(playedCards, specialCard);
            System.out.println("Oğuz's turn");
            player1.playCard(playedCards, specialCard);
            System.out.println("Hidayet's turn");
            player2.playCard(playedCards, specialCard);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            
        }else{
            whoPlayed = new ArrayList<Integer>(Arrays.asList(4,1,2,3));
            System.out.println("Hidayet's turn");
            player2.playCard(playedCards, specialCard);
            System.out.println("Zeynep's turn");
            player3.playCard(playedCards, specialCard);
            System.out.println("Sila's turn");
            player4.playCard(playedCards, specialCard);
            System.out.println("Oğuz's turn");
            player1.playCard(playedCards, specialCard);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();

        }
    }

    public void run(){
        System.out.println(player1.getName() + " Cards ");
        System.out.println(player1.getPlayerCards());
        System.out.println(player2.getName() + " Cards ");
        System.out.println(player2.getPlayerCards());
        System.out.println(player3.getName() + " Cards ");
        System.out.println(player3.getPlayerCards());
        System.out.println(player4.getName() + " Cards ");
        System.out.println(player4.getPlayerCards());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        bet();
        System.out.println(lastBetter.getName() + "What type should be the special card type?");
        System.out.print("Choice: ");
        specialCard = input.nextLine().toLowerCase();
        boolean cont = true;
        while ( cont ){
            if ( specialCard.equals("heart") || specialCard.equals("spade") || specialCard.equals("diamond") || specialCard.equals("club")){
                cont = false;
            }else{
                System.out.print("Choice: ");
                specialCard = input.nextLine().toLowerCase();
            
            }
        }


        for ( int spin = 1; spin <= 13; spin++ ){
            s1.getScores();
            System.out.println("Round: " + spin);
            orderMaker(lastNo);
            lastNo = getWinner(playedCards,whoPlayed);
            playedCards.removeAll(playedCards);// to reset after every turn
            whoPlayed.removeAll(whoPlayed);// to reset after every turn
        }
        s1.getGameWinner();

    }

  
    /**
     * search for spade two
     * @param list players deck
     * @return isSpadetwo is this hand
     */
    public boolean isSpadeTwo(ArrayList<Card> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getSuit() == "spade"){
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
                    //lastBetter = player1;
                    if ( playerB1){
                        playerB1 = betQuestions(player1,1);
                    }
                    if ( playerB2){
                        playerB2 = betQuestions(player2,2);
                    }
                    if ( playerB3){
                        playerB3 = betQuestions(player3,3);
                    }
                    if ( playerB4){
                        playerB4 = betQuestions(player4,4);
                    }
    
                }else if(isSpadeTwo(player2.getPlayerCards())){
                    //lastBetter = player2;
                    if ( playerB2){
                        playerB2 = betQuestions(player2,2);
                    }
                    if ( playerB3){
                        playerB3 = betQuestions(player3,3);
                    }
                    if ( playerB4){
                        playerB4 = betQuestions(player4,4);
                    }
                    if ( playerB1){
                        playerB1 = betQuestions(player1,1);
                    }
    
                }else if(isSpadeTwo(player3.getPlayerCards())){
                    //lastBetter = player3;
                    if ( playerB3){
                        playerB3 = betQuestions(player3,3);
                    }
                    if ( playerB4){
                        playerB4 = betQuestions(player4,4);
                    }
                    if ( playerB1){
                        playerB1 = betQuestions(player1,1);
                    }
                    if ( playerB2){
                        playerB2 = betQuestions(player2,2);
                    }
                   
                }else if(isSpadeTwo(player4.getPlayerCards())) {
                    //lastBetter = player4;
                    if ( playerB4){
                        playerB4 = betQuestions(player4,4);
                    }
                    if ( playerB1){
                        playerB1 = betQuestions(player1,1);
                    }
                    if ( playerB2){
                        playerB2 = betQuestions(player2,2);
                    }
                    if ( playerB3){
                        playerB3 = betQuestions(player3,3);
                    }
    
                }
            }else{
                cont = false;

                return;
            } 
        }
    }

    
    public boolean betQuestions(Player who, int playerNo){
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
                    if( bet >= minimalBet && bet <= 13 ){
                        minimalBet = bet + 1;
                        biggestBet = bet;
                        lastBetter = who;
                        lastNo = playerNo;

    
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
    
}