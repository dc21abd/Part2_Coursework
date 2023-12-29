import java.util.*;

/**
 * This class performs the score calculations based on the
 * scores stored in the Database_System class.
 *
 * @author Denisa-Maria Cretu
 * @version 29/12/2023
 */

public class ScoreCalculator {
    private ArrayList<DMC_Competitor> competitor = new ArrayList<DMC_Competitor>();
    // double[] scores = competitor.getScoreArray();
    /*
    I added a scores arraylist in the UML diagram, but then I noticed this was not necessary as
    the scores are linked to the competitor, therefore I decided not to add it.
     */

    /*
    The scores have also been changed from int to double as I have seen that in the description
    of the second part of this assignment it shows that the scores are represented as of type
    double and not int
     */
    private double averageScore;
    private double totalScore;
    private double maxScore;
    private double minScore;

    /** Constructor */
    public ScoreCalculator(double[] scores, double avScr, double tScr, double maxScr, double minScr)
    {


    }

    public int calculateOverallScore(){return 0;}
    public int calculateMaxScore(){return 0;}
    public int calculateMinScore(){return 0;}
    public int calculateTotalScore(){return 0;}






}
