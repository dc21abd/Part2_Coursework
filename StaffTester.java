import java.util.*;

/**
 * This class tests the methods in the Staff class.
 *
 * @author Denisa-Maria Cretu
 * @version 04/01/2024
 */

public class StaffTester {
    public static void main(String[] args)
    {

        // Staff test data
        Name staff01 = new Name("Staff", "No", "One");
        Staff staffOne = new Staff(0001, staff01, "staffone@mail.com", 284652726, 1);

        Name staff02 = new Name("Staff", "No", "Two");
        Staff staffTwo = new Staff(0002, staff02, "stafftwo@mail.com", 823497597, 2);

        Name staff03 = new Name("Staff", "No", "Three");
        Staff staffThree = new Staff(0003, staff03, "staffthree@mail.com", 253417239, 2);

        Name staff04 = new Name("Staff", "No", "Four");
        Staff staffFour = new Staff(0004, staff04, "stafffour@mail.com", 237346423, 1);

        Name staff05 = new Name("Staff", "No", "Five");
        Staff staffFive = new Staff(0005, staff05, "stafffive@mail.com", 876453993, 1);


        // Competitor Test Data
        double[] lauraScores = {1, 4.2, 5, 3.7, 2};
        Name laura = new Name("Laura", "Dorset", "Sanders");
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


        // Add the competitors to the competitors arraylist
        Staff.addCompetitor(Laura);
        Staff.addCompetitor(Sue);
        Staff.addCompetitor(Ryan);
        Staff.addCompetitor(Zach);
        Staff.addCompetitor(Erin);
        Staff.addCompetitor(Nora);
        Staff.addCompetitor(Susanna);
        Staff.addCompetitor(Nate);
        Staff.addCompetitor(Lee);
        Staff.addCompetitor(Philippa);
        Staff.addCompetitor(Oisin);
        Staff.addCompetitor(Daniyal);
        Staff.addCompetitor(Dewi);
        Staff.addCompetitor(Azaan);
        Staff.addCompetitor(Maariyah);

        System.out.println(staffOne.findCompetitorById(1000));

        // Removing a competitor by ID
        staffOne.removeCompetitor(1000);
        //Adding the competitor back again
        Staff.addCompetitor(Laura);

        System.out.println(staffOne.printSummaryReport(1000));
        System.out.println(staffTwo.getStaffID());
        System.out.println(staffThree.getName());
        System.out.println(staffFour.getEmail());
        System.out.println(staffFive.getTelephoneNo());
        System.out.println(staffOne.getAccessLevel());


    }


}
