package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.existOrNot.eon;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService udj = new UserServiceImpl();
        udj.createUsersTable();
        udj.saveUser("Akzhol","Serikbek", (byte) 22);
        udj.saveUser("Dauletbaeva","Fariza", (byte) 21);
        udj.saveUser("Zhadrabek","Nurlan", (byte) 39);
        udj.saveUser("Shmanov","Ermek", (byte) 23);
        udj.getAllUsers().stream().forEach((c) -> System.out.println(c));
        udj.cleanUsersTable();
        udj.dropUsersTable();
    }
}
