package com.revature.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection connection;

    public ConnectionFactory(){
        try{
            ResourceBundle creds = ResourceBundle.getBundle("DBCreds");

            connection = DriverManager.getConnection(creds.getString("url"),creds.getString("userName"),creds.getString("password"));
            connection.setSchema(creds.getString("schema"));


        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
