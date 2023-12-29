import java.util.*;

public class DMC_Competitor {
    private int competitorNo;
    //private String firstName;
    //private String middleName;
    //private String surname;
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
    public DMC_Competitor(int cNo, Name nm/*String fNm, String mNm, String sNm*/, String ints, int a, String mail, String cat, int lvl, double[] scr) {
        competitorNo = cNo;
        //firstName = fNm;
        //middleName = mNm;
        //surname = sNm;
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
    //public String getFirstName() {return firstName;}
    //public String getMiddleName() {return middleName;}
    //public String getSurname() {return surname;}
    public Name getName() {return name;}
    public String getInitials() {return initials;}
    public int getAge() {return age;}
    public String getEmail() {return email;}
    public String getCategory() {return category;}
    public int getLevel() {return level;}
    public double[] getScoreArray() {return scores;}


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




    /* May need if array does not work
    for (int i=0; i<(num.length); i++ ) {
        for (int j=0;j<num[i].length;j++)
            System.out.println(num[i][j]);
}
     */

    /**
     * Creates a summary report of the competitor
     *
     * @return String with competitor details
     */
    public String getFullDetails() {
        return "\n******** Competitor Details ********" + "\nCompetitor Number: " + competitorNo + " with name: " + name +
                " and age: " + age + " competing in category: " + category + " and level: " + level +
                " has scores: " + scores + " and overall score: " + getOverallScore();
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
    // based on certain conditions which are not covered for this assignment.






    public static void main(String[] args)
    {

        double[] lauraScores = {1, 4.2, 5, 3.7, 2};
        Name laura = new Name("Laura", "Dorset", "Sanders");
        // Competitor Test Data
        DMC_Competitor Laura = new DMC_Competitor(1000, laura, "LDS", 23, "laurasanders@mail.com", "Junior", 1, lauraScores);

        double[] sueScores = {};
        Name sue = new Name("Sue", "Tabolt", "Turner");
        DMC_Competitor Sue = new DMC_Competitor(1001, sue, "STT", 36, "sueturner@mail.com", "advanced", 2, sueScores);

        double[] ryanScores = {};
        Name ryan = new Name("Ryan", "Martin", "Smith");
        DMC_Competitor Ryan = new DMC_Competitor(1002, ryan, "RMS", 41, "martinsmith@mail.com", "intermediate", 3, ryanScores);

        double[] zachScores = {};
        Name zach = new Name("Zach", "Harrison", "Ward");
        DMC_Competitor Zach = new DMC_Competitor(1003, zach, "ZHW", 20, "zachward@mail.com", "intermediate", 3, zachScores);

        double[] erinScores = {};
        Name erin = new Name("Erin", "Evelyn", "Dunn");
        DMC_Competitor Erin = new DMC_Competitor(1004, erin, "EED", 19, "erindunn@mail.com", "junior", 2, erinScores);

        double[] noraScores = {};
        Name nora = new Name("Nora", "Page", "Stephens");
        DMC_Competitor Nora = new DMC_Competitor(1005, nora, "NPS", 43, "norastephens@mail.com", "junior", 1, noraScores);

        double[] susannaScores = {};
        Name susanna = new Name("Susanna", "Burton", "Lawrence");
        DMC_Competitor Susanna = new DMC_Competitor(1006, susanna, "SBL", 54, "susannalawrence@mail.com", "junior", 1, susannaScores);

        double[] nateScores = {};
        Name nate = new Name("Nate", "Owens", "Webb");
        DMC_Competitor Nate = new DMC_Competitor(1007, nate, "NOW", 33, "natewebb@mail.com", "advanced", 2, nateScores);

        double[] leeScores = {};
        Name lee = new Name("Lee", "Nielsen", "Castillo");
        DMC_Competitor Lee = new DMC_Competitor(1008, lee, "LNC", 25, "leecastillo@mail.com", "intermediate", 2, leeScores);

        double[] philippaScores = {};
        Name philippa = new Name("Philippa", "Diaz", "Carr");
        DMC_Competitor Philippa = new DMC_Competitor(1009, philippa, "PDC", 29, "philippacarr@mail.com", "intermediate", 3, philippaScores);

        double[] oisinScores = {};
        Name oisin = new Name("Oisin", "Kaufman", "Jones");
        DMC_Competitor Oisin = new DMC_Competitor(1010, oisin, "OKJ", 38, "oisinjones@mail.com", "advanced", 3, oisinScores);

        double[] daniyalScores = {};
        Name daniyal = new Name("Daniyal", "Schmidt", "Yoder");
        DMC_Competitor Daniyal = new DMC_Competitor(1011, daniyal, "DSY", 56, "daniyalyoder@mail.com", "advanced", 2, daniyalScores);

        double[] dewiScores = {};
        Name dewi = new Name("Dewi", "Hernandez", "Mendez");
        DMC_Competitor Dewi = new DMC_Competitor(1012, dewi, "DHM", 60, "dewimendez@mail.com", "intermediate", 1, dewiScores);

        double[] azaanScores = {};
        Name azaan = new Name("Azaan", "Cormac", "Macias");
        DMC_Competitor Azaan = new DMC_Competitor(1013, azaan, "ACM", 47, "azaanmacias@mail.com", "advanced", 2, azaanScores);

        double[] maariyahScores = {};
        Name maariyah = new Name("Maariyah", "Roth", "Stone");
        DMC_Competitor Maariyah = new DMC_Competitor(1014, maariyah, "MRS", 59, "maariyahstone@mail.com", "junior", 3, maariyahScores);

        // Test Getter methods
        System.out.println(Laura.getCompetitorNo());
        System.out.println(Sue.getName());          // Method from DMC_Competitor class
        System.out.println(ryan.getFirstName());    // Method from Name class
        System.out.println(zach.getMiddleName());   // Method from Name class
        System.out.println(erin.getSurname());      // Method from Name class
        System.out.println(Nora.getInitials());
        System.out.println(Susanna.getAge());
        System.out.println(Nate.getEmail());
        System.out.println(Lee.getCategory());
        System.out.println(Philippa.getLevel());
        System.out.println(Oisin.getScoreArray());
        System.out.println(Daniyal.getScoreArray());

        // Test

    }


}
