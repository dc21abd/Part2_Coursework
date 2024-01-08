import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * This class stores and manages the competitor details like CompetitorList
 *
 * @author Denisa-Maria Cretu
 * @version 04/01/2024
 */
public class Manager {

    private ArrayList<DMC_Competitor> competitors = new ArrayList<DMC_Competitor>();

    /**
     * Adds a competitor to the arraylist
     *
     * @return
     */
    public void addCompetitors(DMC_Competitor competitor)
    {
        competitors.add(competitor);
    }

    /**
     * Gets the competitor table
     *
     * @return ArrayList table
     */
    public ArrayList<String> getTable()
    {
        ArrayList<String> table = new ArrayList<>();
        for(DMC_Competitor competitor : competitors)
        {
            table.add(competitor.getFullDetails());
        }
        return table;
    }


    /**
     * Looks for the competitor with the best scores among all competitors
     *
     * @return String with top competitor details
     */
    public String getTopCompetitor()
    {
        DMC_Competitor topComp = competitors.get(0);
        for(DMC_Competitor competitor : competitors)
        {
            if(competitor.getOverallScore() > topComp.getOverallScore())
            {
                topComp = competitor;
            }
        }
        return topComp.getFullDetails();

    }

    /**
     * Gets the minimin, maximum, total and overall scores of the competitors.
     *
     * @return String stats
     */
    public String getSummaryStats()
    {
        StringBuilder stats = new StringBuilder("*****Summary Statistics*****\n");

        for(DMC_Competitor competitor : competitors)
        {
            double overallScr = competitor.getOverallScore();
            double minScr = competitor.getMinScore();
            double maxScr = competitor.getMaxScore();
            double totalScr = competitor.getTotalScore();

            stats.append("Competitor No: ").append(competitor.getCompetitorNo());
            stats.append(", Min score: ").append(minScr);
            stats.append(", Max score: ").append(maxScr);
            stats.append(", Total score: ").append(totalScr);
            stats.append(", Overall score: ").append(overallScr);
        }
        return stats.toString();
    }

    /*
    public String getFrequencyReport()
    {

    }
     */

    /**
     * It checks for a competitor's ID and then returns the short details
     *
     * @return String with short competitor details
     */
    public String giveShortDetails(int Id)
    {
        for(DMC_Competitor competitor : competitors)
        {
            if(competitor.getCompetitorNo() == Id)
            {
                return competitor.getShortDetails();
            }
        }
        return "Not found";
    }

    // Read details of each competitor
    public void readCompetitorFile(String file)
    {
        competitors = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {

            String line;
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");

                int competitorNo = Integer.parseInt(data[0]);
                Name name = new Name(data[1], data[2], data[3]);
                String initials = data[4];
                int age = Integer.parseInt(data[5]);
                String email = data[6];
                String category = data[7];
                int level = Integer.parseInt(data[8]);

                String[] scrs = data[9].split(",");
                double[] scr = new double[scrs.length];
                for(int i = 0; i < scrs.length; i++)
                {
                    scr[i] = Double.parseDouble(scrs[i]);
                }
                DMC_Competitor competitor = new DMC_Competitor(competitorNo, name, initials, age, email, category, level, scr);
                competitors.add(competitor);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error parsing numeric values");
            e.printStackTrace();
        }
    }


    // All competitor objects
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

}
