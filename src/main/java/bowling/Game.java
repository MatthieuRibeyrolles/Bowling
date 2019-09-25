/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author Matthieu
 */
public class Game {
    private Score[] scores;
    private int manche;
    private int turn;
    
    public Game() {
        manche = 0;
        turn = 0;
        scores = new Score[12];
        
        for (int i = 0; i < 12; i++) scores[i] = new Score();
    }
    
    public int getScore() {
        int toReturn = 0;
        
        for (Score score : scores) toReturn += score.getTotal();
        
        return toReturn;

    }
    
    private void checkForBonus(int quilles) {
        for(Score score : scores) {
            if (score.getBonusPointsToAdd() > 0){
                score.addBonusPoints(quilles);
            }
        }
    }
    
    public void calculScore(int quilles) {
        checkForBonus(quilles);
        
        if (turn % 2 == 0) {
            turn++;
            scores[manche].setPremierTour((manche < 10) ? quilles : 0);
            
            if (quilles == 10) {
                if (manche < 10) scores[manche].setBonusPointsToAdd(2);
                
                turn = 0;
                manche++;
            }
        } else {
            scores[manche].setSecondTour(quilles);
            
            if (scores[manche].getTotal() == 10) {
                scores[manche].setBonusPointsToAdd(1);
            }
            
            turn = 0;
            manche++;
        }
    }
}
