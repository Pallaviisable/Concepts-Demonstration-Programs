////////////////////////////////////////////////////////////
//
//  File Name  : CalculatorServer.java
//  Description: This program implements a TCP server for a 
//               networked GUI calculator. It listens for 
//               client connections, receives arithmetic operation 
//               requests, performs the operations, and sends 
//               the results back to the client.
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.io.*;                      
import java.net.*;                     

class CalculatorServer
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is running...");
        ServerSocket ssobj = new ServerSocket(2100);                 // Start server at port 2100
        System.out.println("Server is waiting at port number 2100...");
        Socket sobj = ssobj.accept();                                // Accept client request
        System.out.println("Client request accepted by the server.");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());    // Input from client
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); // Output to client

        int iOperation, iNumber1, iNumber2;
        int iSum, iSub, iMult;
        float iDiv;

        do
        {
            iOperation = diobj.readInt();   // Read operation code from client
            if(iOperation == 0)             // Exit signal from client
            {
                System.out.println("Client terminated connection.");
                break;
            }

            iNumber1 = diobj.readInt();     // Read first number
            iNumber2 = diobj.readInt();     // Read second number

            switch(iOperation)              // Perform operation
            {
                case 1:  
                    iSum = iNumber1 + iNumber2;
                    doobj.writeInt(iSum);  // Send sum to client
                    break;

                case 2:  
                    iSub = iNumber1 - iNumber2;
                    doobj.writeInt(iSub);  // Send difference to client
                    break;

                case 3:  
                    iMult = iNumber1 * iNumber2;
                    doobj.writeInt(iMult); // Send product to client
                    break;

                case 4: 
                    if(iNumber2 == 0)       // Handle divide by zero
                    {
                        doobj.writeFloat(0);
                    }
                    else
                    {
                        iDiv = (float)iNumber1 / iNumber2;
                        doobj.writeFloat(iDiv); // Send division result to client
                    }
                    break;
            }
        } while(true);

        sobj.close();    // Close client socket
        ssobj.close();   // Close server socket
        System.out.println("Server Application Terminated.");
    }
}