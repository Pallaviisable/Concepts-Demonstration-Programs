////////////////////////////////////////////////////////////
//
//  File Name  : Client.java
//  Description: This program demonstrates a simple TCP client 
//               chat application in Java. The client connects 
//               to the server and continuously sends messages 
//               until the user types "End". It receives and 
//               displays server responses in a loop.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.io.*;                                // Import input/output classes
import java.net.*;                               // Import networking classes

class ChatClientLoop
{
    public static void main(String[] args) throws Exception
    {
        Socket sobj = new Socket("localhost", 5100);         // Connect to server on port 5100
        System.out.println("Client is connected with server successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());               // Output stream to server
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));  // Input stream from server
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));            // Input stream from user

        System.out.println("---------------------------------------------------");
        System.out.println("----------------------CLIENT-----------------------");
        System.out.println("---------------------------------------------------");

        String str1 = null;                               // Message to send
        String str2 = null;                               // Message received from server

        System.out.println("Enter Message for Server:");
        while (!(str1 = bobj2.readLine()).equals("End"))  // Loop until user types "End"
        {
            pobj.println(str1);                           // Send message to server
            str2 = bobj1.readLine();                      // Read server response
            System.out.println("Server Says: " + str2);   // Display server response
            System.out.println("Enter Message for Server:");
        }

        sobj.close();                                     // Close socket after loop ends
    }
}