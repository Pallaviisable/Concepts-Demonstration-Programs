////////////////////////////////////////////////////////////
//
//  File Name  : EventHandling.java
//  Description: This program demonstrates GUI event handling 
//               in Java using Swing with a separate ActionListener 
//               class. It creates a JFrame with a JButton and 
//               handles button clicks using the external listener.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import javax.swing.*;                            // Import Swing components
import java.awt.event.*;                          // Import event-handling classes

// Separate class implementing ActionListener for button clicks
class Listener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
    {
        JOptionPane.showMessageDialog(null, "Button Clicked.."); // Display message dialog on click
    }
}

class EventHandlingSeparateClassXX
{
    public static void main(String[] args)
    {
        JFrame fobj = new JFrame("PPA");                       // Create JFrame with title "PPA"

        JButton bobj = new JButton("OK");                      // Create JButton with label "OK"
        bobj.setBounds(100, 100, 150, 50);       // Set button position and size

        Listener mobj = new Listener();                             // Create listener object
        bobj.addActionListener(mobj);                               // Attach listener to button

        fobj.add(bobj);                                             // Add button to JFrame

        fobj.setSize(400, 300);                       // Set frame size
        fobj.setLayout(null);                              // No layout manager (absolute positioning)
        fobj.setVisible(true);                                   // Make frame visible

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // Close application on window close
    }
}