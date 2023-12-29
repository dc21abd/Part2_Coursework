
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

}
