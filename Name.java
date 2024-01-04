/**
 * This class stores the competitor and staff full names.
 *
 * @author Denisa-Maria Cretu
 * @version 29/12/2023
 */
public class Name {
    private String firstName;
    private String middleName;
    private String surname;

    /** Constructor */
     public Name(String fName, String mName, String sName)
    {
        firstName = fName;
        middleName = mName;
        surname = sName;
    }

    /** Getter methods */
    public String getFirstName() {return firstName;}
    public String getMiddleName() {return middleName;}
    public String getSurname() {return surname;}

    /**
     * This method has been added to fix an error in DMC_Competitor where the getFullDetails()
     * method returns the address and not the name of the competitor.
     *
     * @return String with competitor full name
     */
    public String toString() {
        return firstName + " " + middleName + " " + surname;
    }
}
