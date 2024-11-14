package com.example.grouptest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection
{
    public Connection databaseLink;

    public Connection getConnection()
    {
        String databseName = " LectureFunctionalities";
        String databaseUser = "root";
        String databsePassword = "MOTHIBELI";
        String url = "jdbc:mysql://localhost:3307/" + databseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url ,databaseUser,databsePassword);
        } catch (Exception e)
        {
           e.printStackTrace();
        }
        return databaseLink;
    }
}