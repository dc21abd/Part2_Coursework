import java.util.*;

/**
 * This class performs the score calculations based on the
 * scores stored in the Database_System class.
 *
 * @author Denisa-Maria Cretu
 * @version 29/12/2023
 */

public class ScoreCalculator {

    // double[] scores = competitor.getScoreArray();
    /**
    I added a scores arraylist in the UML diagram, but then I noticed this was not necessary as
    the scores are linked to the competitor, therefore I decided not to add it.
     */

    /**
    The scores have also been changed from int to double as I have seen that in the description
    of the second part of this assignment it shows that the scores are represented as of type
    double and not int
     */
    private ArrayList<DMC_Competitor> competitors = new ArrayList<DMC_Competitor>();
    private double averageScore;
    private double totalScore;
    private double maxScore;
    private double minScore;

    /** Constructor */
    public ScoreCalculator(ArrayList<DMC_Competitor> competitors)
    {
        competitors = competitors;
    }

    /**
     * Calculates the overall score
     *
     * @return int overall score
     */
    public double calculateOverallScore()
    {
        double totalOverallScore = 0;
        for (DMC_Competitor competitor : competitors) {
            totalOverallScore += competitor.getOverallScore();
        }
        return totalOverallScore / competitors.size();
    }

    /**
     * Calculates the max score
     *
     * @return int max score
     */
    public double calculateMaxScore()
    {
        double maxScore = 0;
        for (DMC_Competitor competitor : competitors) {
            double overallScore = competitor.getOverallScore();
            if (overallScore > maxScore) {
                maxScore = overallScore;
            }
        }
        return maxScore;
    }

    /**
     * Calculates the min score
     *
     * @return int min score
     */
    public double calculateMinScore()
    {
        double minScore = 0;
        for (DMC_Competitor competitor : competitors) {
            double overallScore = competitor.getOverallScore();
            if (overallScore < minScore) {
                minScore = overallScore;
            }
        }
        return minScore;
    }

    /**
     * Calculates the total score
     *
     * @return int total score
     */
    public double calculateTotalScore()
    {
        double totalScore = 0;
        for (DMC_Competitor competitor : competitors) {
            totalScore += competitor.getOverallScore();
        }
        return totalScore;
    }


    /**
     * Test
     * @param args
     */
    public static void main(String[] args)
    {

        double[] lauraScores = {1, 4.2, 5, 3.7, 2};
        Name laura = new Name("Laura", "Dorset", "Sanders");
        // Competitor Test Data
        DMC_Competitor Laura = new DMC_Competitor(1000, laura, "LDS", 23, "laurasanders@mail.com", "Junior", 1, lauraScores);

        double[] sueScores = {3, 5, 3.4, 2, 1.9};
        Name sue = new Name("Sue", "Tabolt", "Turner");
        DMC_Competitor Sue = new DMC_Competitor(1001, sue, "STT", 36, "sueturner@mail.com", "advanced", 2, sueScores);

        double[] ryanScores = {4.5, 3, 3, 2, 2.4};
        Name ryan = new Name("Ryan", "Martin", "Smith");
        DMC_Competitor Ryan = new DMC_Competitor(1002, ryan, "RMS", 41, "martinsmith@mail.com", "intermediate", 3, ryanScores);

        double[] zachScores = {3, 4, 4, 2, 1};
        Name zach = new Name("Zach", "Harrison", "Ward");
        DMC_Competitor Zach = new DMC_Competitor(1003, zach, "ZHW", 20, "zachward@mail.com", "intermediate", 3, zachScores);

        double[] erinScores = {1.8, 4.6, 4.6, 3.8, 5};
        Name erin = new Name("Erin", "Evelyn", "Dunn");
        DMC_Competitor Erin = new DMC_Competitor(1004, erin, "EED", 19, "erindunn@mail.com", "junior", 2, erinScores);

        double[] noraScores = {3, 3.5, 2.4, 4.7, 2};
        Name nora = new Name("Nora", "Page", "Stephens");
        DMC_Competitor Nora = new DMC_Competitor(1005, nora, "NPS", 43, "norastephens@mail.com", "junior", 1, noraScores);

        double[] susannaScores = {1, 2, 1, 1, 3};
        Name susanna = new Name("Susanna", "Burton", "Lawrence");
        DMC_Competitor Susanna = new DMC_Competitor(1006, susanna, "SBL", 54, "susannalawrence@mail.com", "junior", 1, susannaScores);

        double[] nateScores = {3, 4, 4, 2, 1.7};
        Name nate = new Name("Nate", "Owens", "Webb");
        DMC_Competitor Nate = new DMC_Competitor(1007, nate, "NOW", 33, "natewebb@mail.com", "advanced", 2, nateScores);

        double[] leeScores = {1.2, 1.4, 5, 4.3, 3.8};
        Name lee = new Name("Lee", "Nielsen", "Castillo");
        DMC_Competitor Lee = new DMC_Competitor(1008, lee, "LNC", 25, "leecastillo@mail.com", "intermediate", 2, leeScores);

        double[] philippaScores = {3.4, 3.3, 2.2, 2.7, 4.1};
        Name philippa = new Name("Philippa", "Diaz", "Carr");
        DMC_Competitor Philippa = new DMC_Competitor(1009, philippa, "PDC", 29, "philippacarr@mail.com", "intermediate", 3, philippaScores);

        double[] oisinScores = {2.2, 1.1, 5, 4, 4};
        Name oisin = new Name("Oisin", "Kaufman", "Jones");
        DMC_Competitor Oisin = new DMC_Competitor(1010, oisin, "OKJ", 38, "oisinjones@mail.com", "advanced", 3, oisinScores);

        double[] daniyalScores = {3, 4, 2, 5, 1};
        Name daniyal = new Name("Daniyal", "Schmidt", "Yoder");
        DMC_Competitor Daniyal = new DMC_Competitor(1011, daniyal, "DSY", 56, "daniyalyoder@mail.com", "advanced", 2, daniyalScores);

        double[] dewiScores = {1, 1, 3, 4, 2};
        Name dewi = new Name("Dewi", "Hernandez", "Mendez");
        DMC_Competitor Dewi = new DMC_Competitor(1012, dewi, "DHM", 60, "dewimendez@mail.com", "intermediate", 1, dewiScores);

        double[] azaanScores = {5, 4 ,3.4, 2.5, 3.8};
        Name azaan = new Name("Azaan", "Cormac", "Macias");
        DMC_Competitor Azaan = new DMC_Competitor(1013, azaan, "ACM", 47, "azaanmacias@mail.com", "advanced", 2, azaanScores);

        double[] maariyahScores = {1.6, 4.6, 3, 2, 5};
        Name maariyah = new Name("Maariyah", "Roth", "Stone");
        DMC_Competitor Maariyah = new DMC_Competitor(1014, maariyah, "MRS", 59, "maariyahstone@mail.com", "junior", 3, maariyahScores);


        // Test methods
        String lauraScr = DMC_Competitor.getCompetitorScores(Laura);
        String sueScr = DMC_Competitor.getCompetitorScores(Sue);

        System.out.println(lauraScr);
        System.out.println(sueScr);

    }

}
