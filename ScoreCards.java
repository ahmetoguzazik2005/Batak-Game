
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
    public int getGameWinner(){
        int biggestScore = 0;
        for ( int i = 0; i < ScoreCards.length; i++ ){
            if ( biggestScore < ScoreCards[i] ){
                biggestScore = ScoreCards[i];
                whoWhin = i + 1;
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
    public int getScore(int scoreNo){
        int score = ScoreCards[scoreNo - 1];
        return score;
    }

    public void update( int scoreNo ){
        ScoreCards[scoreNo - 1] = getScore(scoreNo) + 1;
    }    
}
