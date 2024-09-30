import java.util.ArrayList;

public class mainn {
    public static void main(String[] args) {
        Cards c1 = new Cards();
        ScoreCards s1 = new ScoreCards();
        Player p1 = new Player("Oğuz", c1.getPlayerCard1());
        Player p2 = new Player("Hidayet", c1.getPlayerCard2());
        Player p3 = new Player("Zeynep", c1.getPlayerCard3());
        Player p4 = new Player("Sila", c1.getPlayerCard4());
        CleverGame cG1 = new CleverGame(p1, p2, p3, p4);
        
        //cG1.bet();
        //System.out.println(cG1.getLastBetter());
        //System.out.println(cG1.getBiggestBet());

        ArrayList<Card> game = new ArrayList<>(); 

        // for checking every turn the cards showed are true or not in a certain way
        System.out.println(p1.getPlayerCards());
        System.out.println(p2.getPlayerCards());
        System.out.println(p3.getPlayerCards());
        System.out.println(p4.getPlayerCards());

        System.out.println();
        for(int i = 0; i < 13; i++){
            game.removeAll(game);// to reset after every turn
            p1.playCard(game, "Spade");
            p2.playCard(game, "Spade");
            p3.playCard(game, "Spade");
            p4.playCard(game, "Spade");
            System.out.println();
        }        
        //System.out.println(c1.getPlayerCard1());
        
        /*for ( int i = 0; i < c1.getPlayerCard1().size(); i++ ){
            System.out.println(c1.getPlayerCard1().get(i));
        }*/
    }
}