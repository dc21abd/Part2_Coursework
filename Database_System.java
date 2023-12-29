import java.util.ArrayList;

/**
 * This class stores the competitor and score data. It uses the DMC_Competitor and ScoreCaculator
 * classes to obtain information about the competitors and to store the scores calculated by the
 * ScoreCalculator.
 *
 * Database_System does not perform any score calculations.
 *
 *
 * @author Denisa-Maria Cretu
 * @version 29/12/2023
 */
public class Database_System {

    private ArrayList<DMC_Competitor> competitor = new ArrayList<DMC_Competitor>();
    private ArrayList<ScoreCalculator> calculator = new ArrayList<ScoreCalculator>();

    /** Constructor */
    public Database_System()
    {
        // Need to add competitorID and their scores
    }

    /** Getter and setter methods */
    /*
    I have added and modified a few methods based on new requirements present in part two
    of the assigment brief
    */
    public double getTotalScore(int Id) // change to score calc
    {
        for (int i = 0; i < competitor.size(); i++)
        {
            DMC_Competitor comp = competitor.get(i);
            if (Id == comp.getCompetitorNo())
            {
                double overallScore = comp.getOverallScore();
                return overallScore;
            }

        }
        return 0;
    }
    public double getAverageScore(){return 0;}
    public double getMaxScore(){
        // find competitor by id
        // then get the scores for that competitor
        return 0;
    }
    public double getMinScore(){return 0;}
    // since staff can do this, and database is a parent class to staff and competitor, these
    // methods are instead added to database class since this is where the staff will login and
    // add/ remove scores, not from the staff class
    public double addScore(){return 0;}
    public double removeScore(){return 0;}


    // public DMC_Competitor addCompetitor(){return competitor;}
    // public DMC_Competitor removeCompetitor(){return competitor;}

    /**
     * Looks for the competitor based on their competitor number
     * @param Id
     * @return competitor
     */
    public DMC_Competitor findCompetitorById(int Id){

        for (int i = 0; i < competitor.size(); i++)
        {
            DMC_Competitor comp = competitor.get(i);
            if (Id == comp.getCompetitorNo())
            {return comp;}
        }
        return null;
    }






}
