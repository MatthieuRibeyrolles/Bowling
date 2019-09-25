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
public class Score {
    private int premierTour, secondTour;
    private int bonusPointsToAdd;
    private int total;

    public int getPremieTour() {
        return premierTour;
    }

    public int getSecondTour() {
        return secondTour;
    }

    public int getBonusPointsToAdd() {
        return bonusPointsToAdd;
    }

    public int getTotal() {
        return total;
    }

    public void setPremierTour(int premierTour) {
        this.premierTour = premierTour;
        this.total = premierTour;
    }
    
    public void setSecondTour(int secondTour) {
        this.secondTour = secondTour;
        this.total += secondTour;
    }

    public void setBonusPointsToAdd(int bonusPointsToAdd) {
        this.bonusPointsToAdd = bonusPointsToAdd;
    }

    public void addBonusPoints(int quilles) {
        this.total += quilles;
        this.bonusPointsToAdd--;
    }
    
    public Score() {
        this.premierTour = 0;
        this.secondTour = 0;
        this.bonusPointsToAdd = 0;
        this.total = 0;
    }
}
