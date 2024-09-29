public class mainn {
    public static void main(String[] args) {
        Cards c1 = new Cards();
        ScoreCards s1 = new ScoreCards();
        Player p1 = new Player("Oğuz", c1.getPlayerCard1());
        Player p2 = new Player("Hidayet", c1.getPlayerCard2());
        Player p3 = new Player("Zeynep", c1.getPlayerCard3());
        Player p4 = new Player("Sila", c1.getPlayerCard4());
        CleverGame cG1 = new CleverGame(p1, p2, p3, p4);
        cG1.bet();
        cG1.getLastBetter();
        cG1.getBiggestBet();

        
        //System.out.println(c1.getPlayerCard1());
        
        /*for ( int i = 0; i < c1.getPlayerCard1().size(); i++ ){
            System.out.println(c1.getPlayerCard1().get(i));
        }*/

    }
}
