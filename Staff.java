import java.util.*;

public class Staff {

    private int[] scores = new int[5];
    private ArrayList<DMC_Competitor> competitor = new ArrayList<DMC_Competitor>();
    private int staffID;
    private Name name;
    private String email;
    private int telephoneNo;
    private int accessLevel;


    /** Constructor */
    public Staff(int iD, Name nm, String mail, int telNo, int aLvl)
    {
        staffID = iD;
        name = nm;
        email = mail;
        telephoneNo = telNo;
        accessLevel = aLvl;
    }

    /** Getter methods */
    public int getStaffID() {return staffID;}
    public Name getName() {return name;}
    public String getEmail() {return email;}
    public int getTelephoneNo() {return telephoneNo;}
    public int getAccessLevel() {return accessLevel;}



 /*
    public String printSummaryReport()
    {
        return competitor.getFullDetails();
    }

 */
}
