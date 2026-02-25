////////////////////////////////////////////////////////////
//
//  File Name  : JDBC.java
//  Description: This program demonstrates a basic JDBC connection 
//               to a MySQL database. It performs the following steps:
//               1. Load the MySQL JDBC driver
//               2. Connect to the database
//               3. Create a statement object
//               4. Execute a SELECT query
//               5. Display the retrieved results
//  Author     : Pallavi Sable
//  Date       : 25/02/2026
//
////////////////////////////////////////////////////////////

import java.sql.*;

class JDBC
{
    public static void main(String[] args)
    {
        try
        {
            // Step 1: Load the MySQL database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect the driver with the database
            Connection cobj = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/PPA53", "root", ""
            );

            // Step 3: Create a Statement object
            Statement sobj = cobj.createStatement();

            // Step 4: Execute the query
            ResultSet robj = sobj.executeQuery("SELECT * FROM student");

            // Step 5: Display the results
            while(robj.next())
            {
                System.out.println("Roll number : " + robj.getInt("Rno"));
                System.out.println("Name        : " + robj.getString("Name"));
                System.out.println("City        : " + robj.getString("City"));
                System.out.println("Marks       : " + robj.getInt("Marks"));
                System.out.println("---------------------------------");
            }

            // Step 6: Close all resources
            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception eobj : " + eobj);
        }
    }
}