import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the backend of the GUI
 *
 * @author Denisa-Maria Cretu
 * @version 04/01/2024
 */

public class Registration_System {
    private ArrayList<DMC_Competitor> competitors = new ArrayList<DMC_Competitor>();
    private ArrayList<ScoreCalculator> calculator = new ArrayList<ScoreCalculator>();
    private ArrayList<Staff> staff = new ArrayList<Staff>();

    private Scanner scanner = new Scanner(System.in);

    /**
     * List all competitors for checking which have been added
     *
     * @return String competitor details
     */
    public String listAllCompetitors() {
        StringBuilder compInfo = new StringBuilder();
        for(DMC_Competitor comp: competitors)
        {
            compInfo.append(comp.getFullDetails());
        }
        return compInfo.toString();
    }

    /**
     * List all staff
     *
     * @return String staff details
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
     * Allows user to enter their name
     *
     * @return String name
     */
    public String enterCompName()
    {
        System.out.println("Enter your name: ");
        return scanner.nextLine();
    }

    /**
     * Allows user to enter their age
     *
     * @return int age
     */
    public int enterCompAge()
    {
        System.out.println("Enter your age: ");
        return scanner.nextInt();
    }

    /**
     * Allows user to enter their email
     *
     * @return String email
     */
    public String enterCompEmail()
    {
        System.out.println("Enter your email: ");
        return scanner.nextLine();
    }

    /**
     * Assigns a competitor number to a new competitor and add +1 to their ID based on
     * existing competitor numbers
     *
     * @return int competitor number
     */
    public int assignCompNo()
    {
        return competitors.size() + 1; // adds 1 based on existing competitors
    }


    /**
     * Assigns a category to a new competitor based on their age
     *
     * @return String category
     */
    public String assignCategory()
    {
        for(DMC_Competitor comp: competitors)
        {
            if(comp.getAge() >= 20 && comp.getAge() <= 30)
            {
                return "junior";
            }
            else if(comp.getAge() > 30 && comp.getAge() <= 40)
            {
                return "intermediate";
            }
            else{
                return "advanced";
            }
        }
        return "";
    }

    /**
     * Assigns a level to a new competitor based on their age
     *
     * @return int level
     */
    public int assignLevel()
    {
        for(DMC_Competitor comp: competitors)
        {
            if(comp.getAge() >= 20 && comp.getAge() <= 30)
            {
                return 1;
            }
            else if(comp.getAge() > 30 && comp.getAge() <= 40)
            {
                return 2;
            }
            else{
                return 3;
            }
        }
        return 0;
    }

    /**
     * Completes new competitor registration and adds them to the competitor's list
     *
     * @return
     */
    public void registerCompetitor(String name, int age, String email)
    {
        Name compName = new Name(name, "", "");
        int compNo = assignCompNo();
        String category = assignCategory();
        int level = assignLevel();

        double[] scores = {};

        DMC_Competitor newComp = new DMC_Competitor(compNo, compName, "", age, email, category, level, scores);
        competitors.add(newComp);

        System.out.println("Registration successful");
    }
}
