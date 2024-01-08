import javax.xml.crypto.Data;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the GUI
 *
 * @author Denisa-Maria Cretu
 * @version 04/01/2024
 */

public class RegistrationUI extends JFrame {
    private Registration_System registration;

    private JTextField name;
    private JTextField age;
    private JTextField email;
    private JTextField button;

    public RegistrationUI(Registration_System registration)
    {
        this.registration = registration;
        setTitle("Registration System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setLayout(new GridLayout(5, 2));

        initUI();
    }

    private void initUI()
    {
        add(new JLabel("Name: "));
        name = new JTextField();
        add(name);

        add(new JLabel("Age: "));
        age = new JTextField();
        add(age);

        add(new JLabel("Email: "));
        email = new JTextField();
        add(email);

        add(new JButton("Register"));
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerComp();
            }
        });
    }

    private void registerComp()
    {
        String nameIn = name.getText();
        int ageIn = Integer.parseInt(age.getText());
        String emailIn = email.getText();

        registration.registerCompetitor(nameIn, ageIn, emailIn);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                Registration_System registration = new Registration_System();
                RegistrationUI ui = new RegistrationUI(registration);
                ui.setVisible(true);
            }
        });
    }


}
