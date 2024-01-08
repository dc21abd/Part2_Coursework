import java.util.*;

/**
 * This class stores and manages the competitor details.
 *
 * @author Denisa-Maria Cretu
 * @version 29/12/2023
 */

public class DMC_Competitor {
    private int competitorNo;
    private Name name;
    private String initials;
    private int age; // This has been changed from DOB to age to aid in readability and testing
    private String email;
    private String category;
    private int level;
    private double[] scores = new double[5]; // array of size 6 with scores from 0 to 5

    /**
     * Constructor
     */
    public DMC_Competitor(int cNo, Name nm, String ints, int a, String mail, String cat, int lvl, double[] scr) {
        competitorNo = cNo;
        name = nm;
        initials = ints;
        age = a;
        email = mail;
        category = cat;
        level = lvl;
        scores = scr;
    }

    /**
     * Getter methods
     */
    public int getCompetitorNo() {return competitorNo;}
    public Name getName() {return name;}
    public String getInitials() {return initials;}
    public int getAge() {return age;}
    public String getEmail() {return email;}
    public String getCategory() {return category;}
    public int getLevel() {return level;}
    public double[] getScoreArray() {return scores;}

    /**
     * Returns the scores of the competitors as a String. This method has been added because
     * when calling getScoreArray(), the address of the array would be shown instead of the actual
     * values.
     *
     * @return String with competitor scores
     */
    public static String getCompetitorScores(DMC_Competitor competitor) {
        double[] scores = competitor.getScoreArray();
        StringBuilder scoresString = new StringBuilder();

        for (double score : scores) {
            scoresString.append(score).append(" ");
        }

        return scoresString.toString();
    }


    /**
     * Calculates the overall score from the scores in the array of scores
     *
     * @return int overall score
     */
    public double getOverallScore() {
        double sumScores = 0;
        double overallScr = 0;
        for (int i = 0; i < scores.length; i++) {
            // Calculate the average score
            sumScores += scores[i];
        }
        overallScr = sumScores / scores.length;
        return overallScr;
    }

    /**
     * Calculates the max score
     *
     * @return int max score
     */
    public double getMaxScore()
    {
        double maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            double overallScore = getOverallScore();
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
    public double getMinScore()
    {
        double minScore = 0;
        for (int i = 0; i < scores.length; i++) {
            double overallScore = getOverallScore();
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
    public double getTotalScore()
    {
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += getOverallScore();
        }
        return totalScore;
    }


    /**
     * Creates a summary report of the competitor
     *
     * @return String with competitor details
     */
    public String getFullDetails() {
        String compInfo = "\n******** Competitor Details ********" + "\nCompetitor Number: " + competitorNo + " with full name: " + name.toString() +
                " and age: " + age + " competing in category: " + category + " and level: " + level +
                " has scores: ";

                for (int i = 0; i < scores.length; i++) {
                    compInfo = compInfo + scores[i];
                    if (i < scores.length - 1) {
                        compInfo = compInfo + ", ";
                    }
                }
        compInfo = compInfo + " and overall score: " + getOverallScore();

        return compInfo;
    }

    /**
     * Creates a short summary report of the competitor
     *
     * @return String with short competitor details
     */
    public String getShortDetails() {
        return "\n******** Competitor Short Details ********" + "\nCN: " + competitorNo + ". Initials: " + initials +
                " has overall score: " + getOverallScore();
    }


    /**
     * Disclaimer: All competitor details, especially names, have been made randomly and have no connection or relation to
     * real-life. Any relation and/or connection is purely coincidental and has not been done on purpose.
     */

    // categories: junior, intermediate, advanced
    // levels: 1 - 3. The levels say how advanced each competitor is in the category they are in and how much they are far from
    // reaching the next category. It goes from 1 being the lowest level to 3 the highest. They are promoted to the next category
    // based on age.

    /**
     * Test
     * @param args
     */
    public static void main(String[] args)
    {

        double[] lauraScores = {1, 4.2, 5, 3.7, 2};
        Name laura = new Name("Laura", "Dorset", "Sanders");
        // Competitor Test Data
        DMC_Competitor Laura = new DMC_Competitor(1000, laura, "LDS", 23, "laurasanders@mail.com", "junior", 1, lauraScores);

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
        System.out.println(Laura.getCompetitorNo());
        System.out.println(ryan.getFirstName());    // Method from Name class
        System.out.println(zach.getMiddleName());   // Method from Name class
        System.out.println(erin.getSurname());      // Method from Name class
        System.out.println(Nora.getInitials());
        System.out.println(Susanna.getAge());
        System.out.println(Nate.getEmail());
        System.out.println(Lee.getCategory());
        System.out.println(Philippa.getLevel());
        System.out.println(Maariyah.getFullDetails());
        System.out.println(Maariyah.getShortDetails());

        String lauraScr = getCompetitorScores(Laura);
        String sueScr = getCompetitorScores(Sue);
        System.out.println(lauraScr);
        System.out.println(sueScr);

    }


}
