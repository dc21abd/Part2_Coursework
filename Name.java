

public class Name {
    private String firstName;
    private String middleName;
    private String surname;

    public Name(String fName, String mName, String sName)
    {
        firstName = fName;
        middleName = mName;
        surname = sName;
    }

    public String getName() {return firstName;}
    public String getMiddleName() {return middleName;}
    public String surname() {return surname;}
}
