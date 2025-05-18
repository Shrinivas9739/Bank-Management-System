package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;

    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaBank","root","2444666668888888@");
            statement = connection.createStatement();
        }catch (Exception e){

        }
    }
}
