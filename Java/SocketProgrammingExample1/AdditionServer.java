////////////////////////////////////////////////////////////
//
//  File Name  : AdditionServer3.java
//  Description: This program demonstrates a simple TCP server 
//               in Java using Socket programming. The server 
//               waits for a client connection, receives two 
//               integers, calculates their sum, and sends 
//               the result back to the client.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.util.*;                                                     // Import utility classes
import java.io.*;                                                       // Import input/output classes
import java.net.*;                                                      // Import networking classes

class AdditionServer3
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is Running");                     // Notify server start

        ServerSocket ssobj = new ServerSocket(2100);              // Create server socket at port 2100
        System.out.println("Server is waiting at Portnumber 2100");

        Socket sobj = ssobj.accept();                                   // Accept client connection
        System.out.println("Client request arrives and accepted by the server");

        DataInputStream diobj  = new DataInputStream(sobj.getInputStream());    // Input stream from client
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());  // Output stream to client

        int iNo1 = 0;                                                           // First number received
        int iNo2 = 0;                                                           // Second number received

        iNo1 = diobj.readInt();                                                 // Read first number from client
        iNo2 = diobj.readInt();                                                 // Read second number from client

        int iSum = iNo1 + iNo2;                                                 // Calculate sum

        doobj.writeInt(iSum);                                                   // Send sum back to client

        sobj.close();                                                           // Close client socket
        ssobj.close();                                                          // Close server socket

        System.out.println("Server Application Terminated");                 // Notify server end
    }
}