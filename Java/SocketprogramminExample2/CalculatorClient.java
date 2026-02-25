////////////////////////////////////////////////////////////
//
//  File Name  : CalculatorClient.java
//  Description: This program demonstrates a GUI-based 
//               client calculator in Java using Swing. 
//               The client connects to a server over TCP, 
//               sends arithmetic operation requests, and 
//               displays results in real-time.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.util.*;                      
import java.io.*;                         
import java.net.*;                        
import java.awt.*;                         
import java.awt.event.*;                   
import javax.swing.*;                     

// GUI class for calculator with network operations
class Arithmetic implements ActionListener
{
    JFrame fobj;
    JLabel Number1, Number2, ResultLabel, ValueLabel;
    JButton AddButton, SubtractButton, MultiplyButton, DivideButton, ExitButton;
    JTextField Number1Field, Number2Field;

    DataInputStream diobj;                 // Input stream from server
    DataOutputStream doobj;                // Output stream to server

    public Arithmetic(String Title, int Width, int Height, DataInputStream diobj, DataOutputStream doobj)
    {
        this.diobj = diobj;
        this.doobj = doobj;

        fobj = new JFrame(Title);           // Create JFrame with title

        // Initialize labels
        Number1 = new JLabel("Number-1");
        Number1.setBounds(50, 50, 100, 30);
        Number2 = new JLabel("Number-2");
        Number2.setBounds(50, 100, 100, 30);
        ResultLabel = new JLabel("Result:");
        ResultLabel.setBounds(150, 200, 100, 30);
        ValueLabel = new JLabel("");
        ValueLabel.setBounds(250, 200, 100, 30);

        // Initialize text fields
        Number1Field = new JTextField();
        Number1Field.setBounds(150, 50, 150, 30);
        Number2Field = new JTextField();
        Number2Field.setBounds(150, 100, 150, 30);

        // Initialize buttons
        AddButton = new JButton("+");
        AddButton.setBounds(40, 150, 50, 30);
        SubtractButton = new JButton("-");
        SubtractButton.setBounds(100, 150, 50, 30);
        MultiplyButton = new JButton("*");
        MultiplyButton.setBounds(180, 150, 50, 30);
        DivideButton = new JButton("/");
        DivideButton.setBounds(240, 150, 50, 30);
        ExitButton = new JButton("Exit");
        ExitButton.setBounds(300, 150, 70, 30);

        // Add components to frame
        fobj.add(Number1);
        fobj.add(Number2);
        fobj.add(Number1Field);
        fobj.add(Number2Field);
        fobj.add(ResultLabel);
        fobj.add(ValueLabel);
        fobj.add(AddButton);
        fobj.add(SubtractButton);
        fobj.add(MultiplyButton);
        fobj.add(DivideButton);
        fobj.add(ExitButton);

        // Attach action listeners
        AddButton.addActionListener(this);
        SubtractButton.addActionListener(this);
        MultiplyButton.addActionListener(this);
        DivideButton.addActionListener(this);
        ExitButton.addActionListener(this);

        fobj.getContentPane().setBackground(Color.YELLOW);   // Set background color
        fobj.setLayout(null);                                // Absolute positioning
        fobj.setSize(Width, Height);                         // Set frame size
        fobj.setVisible(true);                               // Make frame visible
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            int iNo1 = Integer.parseInt(Number1Field.getText());   // Read first number
            int iNo2 = Integer.parseInt(Number2Field.getText());   // Read second number

            if(aobj.getSource() == AddButton)
            {
                doobj.writeInt(1); doobj.writeInt(iNo1); doobj.writeInt(iNo2);
                int iSum = diobj.readInt(); ValueLabel.setText(String.valueOf(iSum));
            }
            else if(aobj.getSource() == SubtractButton)
            {
                doobj.writeInt(2); doobj.writeInt(iNo1); doobj.writeInt(iNo2);
                int iSub = diobj.readInt(); ValueLabel.setText(String.valueOf(iSub));
            }
            else if(aobj.getSource() == MultiplyButton)
            {
                doobj.writeInt(3); doobj.writeInt(iNo1); doobj.writeInt(iNo2);
                int iMult = diobj.readInt(); ValueLabel.setText(String.valueOf(iMult));
            }
            else if(aobj.getSource() == DivideButton)
            {
                doobj.writeInt(4); doobj.writeInt(iNo1); doobj.writeInt(iNo2);
                if(iNo2 == 0) { ValueLabel.setText("Divide by zero"); return; }
                float iDiv = diobj.readFloat(); ValueLabel.setText(String.valueOf(iDiv));
            }
            else if(aobj.getSource() == ExitButton)
            {
                doobj.writeInt(0);   
                System.exit(0);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

// Client class to connect GUI calculator to server
class CalculatorClient
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Client is running...");
        Socket sobj = new Socket("localhost", 2100);               // Connect to server
        System.out.println("Connected to Server Successfully.");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());  // Input from server
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); // Output to server

        new Arithmetic("Calculator", 450, 300, diobj, doobj);     // Launch GUI calculator
    }
}