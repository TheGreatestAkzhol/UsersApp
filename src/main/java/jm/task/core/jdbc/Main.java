package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        Util util = new Util();
        Connection connection =  util.getConnection();
        Statement statement = connection.createStatement();
        UserDaoJDBCImpl udj = new UserDaoJDBCImpl(connection);
        udj.createUsersTable();
        udj.saveUser("Akzhol","Serikbek", (byte) 22);
        udj.saveUser("Zhadrabek","Nurlan", (byte) 39);
        udj.saveUser("Shmanov","Ermek", (byte) 23);
        udj.saveUser("Dauletbaeva","Fariza", (byte) 21);
        udj.getAllUsers().stream().forEach((c) -> System.out.println(c));
        udj.cleanUsersTable();
        udj.dropUsersTable();
    }
}
