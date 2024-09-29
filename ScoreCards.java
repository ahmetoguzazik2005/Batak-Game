import java.util.ArrayList;

public class ScoreCards {
    private int[] ScoreCards;
    
    ScoreCards(){
        ScoreCards = new int[4];
        for ( int i = 0; i < ScoreCards.length; i++ ){
            this.ScoreCards[i] = 0;
        }
    }
    public int getScore(int scoreNo){
        int score = ScoreCards[scoreNo];
        return score;
    }
    public void update( int scoreNo ){
        ScoreCards[scoreNo] = getScore(scoreNo) + 1;
    }    
}
