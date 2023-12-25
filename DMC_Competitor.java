import java.util.*;

public class DMC_Competitor {
    private String competitorNo;
    private String name;
    private String initials;

    private String dob;
    private String email;
    private String category;
    private int level;
    // private ArrayList<DMC_Competitor> scores = new ArrayList<DMC_Competitor>();
    private int[] scores = {0, 1, 2, 3, 4, 5}; // array of size 6 with scores from 0 to 5

    // constructor
    public DMC_Competitor(String cNo, String nm, String birth_date, String mail, String cat, int lvl)
    {
        competitorNo = cNo;
        name = nm;
        dob = birth_date;
        email = mail;
        category = cat;
        level = lvl;

    }

    public String getCompetitorNo() {return competitorNo;}
    public String getName() {return name;}
    public String getInitials() {return initials;}
    public String getDateOfBirth() {return dob;}
    public String getEmail() {return email;}
    public String getCategory() {return category;}
    public int getLevel() {return level;}
    public int[] getScores() {return scores;}

    public int[] getScoreArray()
    {
        return scores;
    }

    public int getOverallScore()
    {
        int sumScores = 0;
        int overallScr = 0;
        for(int i = 0; i < scores.length; i++)
        {
            // Calculate the average score
            sumScores += scores[i];
        }
        overallScr = sumScores / scores.length;
        return overallScr;
    }


    public String getFullDetails()
    {
        return "\n******** Competitor Details ********" + "\nCompetitor Number: " + competitorNo + "\nName: " + name +
                "\nDate of Birth: " + dob + "\nEmail: " + email + "\nCategory: " + category + "\nLevel: " + level;
    }

    public String getShortDetails()
    {
        return "\n******** Competitor Short Details ********" + "\nCN: " + competitorNo + ". Initials: " + initials +
                " has overall score: " + overallScr;
    }


}

// Complete tests after managing Name class
/* public void test()
{
    DMC_Competitor Laura = new DMC_Competitor("1000", "Laura");
    DMC_Competitor Sue = new DMC_Competitor();
    DMC_Competitor Ryan = new DMC_Competitor();
    DMC_Competitor Zach = new DMC_Competitor();


}

public class Main {
    public static void main(String[] args)
    {
        DMC_Competitor tester = new DMC_Competitor();
        tester.test();
    }
}
*/