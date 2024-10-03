
public class ScoreCards {
    private int[] ScoreCards;
    private int whoWhin;
    Player player1;
    Player player2;
    Player player3;
    Player player4;

    ScoreCards(Player player1, Player player2, Player player3, Player player4){
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;

        ScoreCards = new int[4];
        for ( int i = 0; i < ScoreCards.length; i++ ){
            this.ScoreCards[i] = 0;
        }
    }
<<<<<<< Updated upstream
    public int getGameWinner(Player better, int biggestBet){
        for ( int i = 0; i < ScoreCards.length; i++ ){
            if(player1 == better){
                if(biggestBet <= ScoreCards[0]){
                    System.out.println(player1.getName() + " won the game");
                }else{
                    System.out.println(player1.getName() + " lost the game");
                }
            }else if(player2 == better){
                if(biggestBet <= ScoreCards[1]){
                    System.out.println(player2.getName() + " won the game");
                }else{
                    System.out.println(player2.getName() + " lost the game");
                }
            }else if(player3 == better){
                if(biggestBet <= ScoreCards[2]){
                    System.out.println(player3.getName() + " won the game");
                }else{
                    System.out.println(player3.getName() + " lost the game");
                }
            }else{
                if(biggestBet <= ScoreCards[3]){
                    System.out.println(player4.getName() + " won the game");
                }else{
                    System.out.println(player4.getName() + " lost the game");
                }
            }
        }
        return whoWhin;
    }
    public void getScores(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Score board");
        for ( int i = 0; i < ScoreCards.length; i++){
            if ( i == 0 ){
                System.out.print(player1.getName() + "'s Score: ");
            }else if( i == 1){
                System.out.print(player2.getName() + "'s Score: ");
            }else if(i == 2){
                System.out.print(player3.getName() + "'s Score: ");
            }else if(i == 3){
                System.out.print(player4.getName() + "'s Score: ");
            }
            System.out.print(ScoreCards[i]);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
=======
    //public int getGameWinner(){

    //}
>>>>>>> Stashed changes
    public int getScore(int scoreNo){
        int score = ScoreCards[scoreNo - 1];
        return score;
    }

    public void update( int scoreNo ){
        ScoreCards[scoreNo - 1] = getScore(scoreNo) + 1;
    }    
}
