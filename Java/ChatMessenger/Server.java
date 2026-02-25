////////////////////////////////////////////////////////////
//
//  File Name  : Server.java
//  Description: This program demonstrates a simple TCP server 
//               chat application in Java. The server waits 
//               for a client connection and continuously 
//               receives messages from the client and responds 
//               until the client disconnects.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.io.*;                                // Import input/output classes
import java.net.*;                               // Import networking classes

class ChatServerLoop
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);        // Create server socket at port 5100
        System.out.println("Server is waiting at port 5100");

        Socket sobj = ssobj.accept();                       // Accept client connection
        System.out.println("Client request is accepted successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());              // Output stream to client
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream())); // Input stream from client
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));           // Input stream from server console

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------SERVER------------------------");
        System.out.println("---------------------------------------------------");

        String str1 = null;                               // Message received from client
        String str2 = null;                               // Message to send to client

        while ((str1 = bobj1.readLine()) != null)         // Loop while client sends messages
        {
            System.out.println("Client says: " + str1);   // Display client message
            System.out.println("Enter Message for client:");
            str2 = bobj2.readLine();                      // Read server response
            pobj.println(str2);                           // Send response to client
        }

        sobj.close();                                     // Close client socket
        ssobj.close();                                    // Close server socket
    }
}