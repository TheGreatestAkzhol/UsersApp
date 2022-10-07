package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
    private final Logger LOGGER = Logger.getLogger(Util.class.getName());
    private final String HOST = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
            if(!connection.isClosed()){
                LOGGER.log(Level.INFO,"We've connected with database succesfully!)");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.log(Level.INFO,"Unfortunately we've not connected");
        }
        return connection;
    }
}
