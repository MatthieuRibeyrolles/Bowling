package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
    
    private final Game GAME = new Game();
    
    private int score, turn;

    public void setScore(int score) {
        this.score = score;
    }
        
    /**
     * Constructeur
     */
    public SinglePlayerGame() {
        score = 0;
        turn = 0;
    }

    /**
     * Cette méthode doit être appelée à chaque lancé de boule
     *
     * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
     * ce lancé
     */
    public void lancer(int nombreDeQuillesAbattues) {
        GAME.calculScore(nombreDeQuillesAbattues);
        
        score = GAME.getScore();
    }

    /**
     * Cette méthode donne le score du joueur
     *
     * @return Le score du joueur
     */
    public int score() {
        return score;
    }
}
