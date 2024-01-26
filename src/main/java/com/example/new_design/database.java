package com.example.new_design;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/infoo","root","");
            return connect;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
