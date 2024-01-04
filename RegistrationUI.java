import javax.xml.crypto.Data;
import java.util.*;
/**
 * This is the GUI
 *
 * @author Denisa-Maria Cretu
 * @version 04/01/2024
 */

public class RegistrationUI {
    private Scanner reader = new Scanner(System.in);
    private Database_System database = new Database_System();

    private void runUI()
    {
        int choice = getOption();
        while (choice != 0)
        {
            // process choice
            if      (choice == 1){();}
            else if (choice == 2){();}
            else if (choice == 3){();}
            else if (choice == 4){();}
            else if (choice == 5){();}
            else if (choice == 6){();}
            else if (choice == 7){();}
            else if (choice == 8){();}
            else if (choice == 9){();}

            // output menu & get choice

            choice = getOption();
        }
        System.out.println("\nThank-you");
    }

    private int getOption()
    {
        System.out.println("What would you like to do ?");
        System.out.println("0. Quit");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");

        System.out.println("Enter your choice");
        // read choice
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }

}
