////////////////////////////////////////////////////////////
//
//  File Name  : LoginFrameFinal.java
//  Description: This program demonstrates a simple Swing-based 
//               login GUI in Java. It takes a username and password 
//               and validates it against hardcoded credentials.
//               Username: Pallavi
//               Password: Pallavi@123
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics (GUI components)
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel UserLabel, PassLabel, ResultLabel;

    // Constructor to initialize GUI
    public MarvellousLogin(String Title, int Width, int Height)
    {
        fobj = new JFrame(Title);

        // Username label
        UserLabel = new JLabel("USERNAME");
        UserLabel.setBounds(50, 50, 100, 30);

        // Password label
        PassLabel = new JLabel("PASSWORD");
        PassLabel.setBounds(50, 100, 100, 30);

        // Username text field
        tobj = new JTextField();
        tobj.setBounds(150, 50, 150, 30);

        // Password field
        pobj = new JPasswordField();
        pobj.setBounds(150, 100, 150, 30);

        // Submit button
        bobj = new JButton("SUBMIT");
        bobj.setBounds(150, 150, 100, 30);

        // Result label
        ResultLabel = new JLabel("");
        ResultLabel.setBounds(150, 200, 250, 30);

        // Add components to frame
        fobj.add(UserLabel);
        fobj.add(PassLabel);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(bobj);
        fobj.add(ResultLabel);

        // Register button event
        bobj.addActionListener(this);

        // Frame settings
        fobj.setLayout(null);
        fobj.setSize(Width, Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Event handling for button click
    public void actionPerformed(ActionEvent aobj)
    {
        String uname = tobj.getText();
        String Pass = pobj.getText();

        if ((uname.equals("Pallavi")) && (Pass.equals("Pallavi@123")))
        {
            ResultLabel.setText("Login Successful");
        }
        else
        {
            ResultLabel.setText("Login Failed");
        }
    }
}

public class LoginFrameFinal
{
    public static void main(String[] args)
    {
        // Launch login GUI
        new MarvellousLogin("Login", 400, 300);
    }
}