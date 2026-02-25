////////////////////////////////////////////////////////////
//
//  File Name  : AdditionClient3.java
//  Description: This program demonstrates a simple TCP client 
//               in Java using Socket programming. The client 
//               connects to a server, sends two integers, 
//               receives the addition result, and displays it.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.util.*;                                // Import utility classes
import java.io.*;                                  // Import input/output classes
import java.net.*;                                 // Import networking classes

class AdditionClient3
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Client is Running");  // Notify client start

        Socket sobj = new Socket("localhost", 2100);  // Connect to server on port 2100
        System.out.println("Server Successfully connected");

        DataInputStream diobj  = new DataInputStream(sobj.getInputStream());    // Input stream from server
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());  // Output stream to server

        int iNo1 = 11;                             // First number to send
        int iNo2 = 10;                             // Second number to send

        doobj.writeInt(iNo1);                      // Send first number to server
        doobj.writeInt(iNo2);                      // Send second number to server

        int iSum = diobj.readInt();                // Receive addition result from server
        System.out.println("Addition is :" + iSum);  // Display result

        sobj.close();                              // Close socket connection

        System.out.println("Client Application Terminated");  // Notify client end
    }
}