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

    private ArrayList<DMC_Competitor> competitors = new ArrayList<DMC_Competitor>();
    private ScoreCalculator calculator;
    private ArrayList<Staff> staff = new ArrayList<Staff>();


    /**
     * Getter methods for summary statistics from ScoreCalculator class
     *
     * @return int total score, overall score, max score, min score
     */
    public double getTotalScore() {
        return calculator.calculateTotalScore();
    }

    public double getAverageScore() {
        return calculator.calculateOverallScore();
    }

    public double getMaxScore() {
        return calculator.calculateMaxScore();
    }

    public double getMinScore() {
        return calculator.calculateMinScore();
    }

    /**
     * Gets the competitor full details by using the getFullDetails() method from DMC_Competitor
     *
     * @return String competitor information
     */
    public String getCompetitorDetails() {
        StringBuilder info = new StringBuilder();

        for (DMC_Competitor comp : competitors) {
            info.append(comp.getFullDetails());
        }
        return info.toString();
    }

    /**
     * Gets the competitor short details by using the getShortDetails() method from DMC_Competitor
     *
     * @return String competitor information
     */
    public String getCompetitorShort() {
        StringBuilder info = new StringBuilder();

        for (DMC_Competitor comp : competitors) {
            info.append(comp.getShortDetails());
        }
        return info.toString();
    }

    /**
     * Gets the staff details by using the getStaffDetails() method from Staff
     *
     * @return String Staff information
     */
    public String listAllStaff()
    {
        StringBuilder staffInfo = new StringBuilder();
        for(Staff s: staff)
        {
            staffInfo.append(s.getStaffDetails());
        }
        return staffInfo.toString();
    }

    /**
     * Gets the competitor summary statistics
     *
     * @return String summary statistics
     */
    public String listAllSummaryStatistics(int Id) {
        return "Min scores: " + calculator.calculateMinScore() + "Max scores: " +
                calculator.calculateMaxScore() + "Overall scores: " + calculator.calculateOverallScore() +
                "Total scores: " + calculator.calculateTotalScore();

    }


}