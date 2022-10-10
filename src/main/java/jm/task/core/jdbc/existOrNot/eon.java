package jm.task.core.jdbc.existOrNot;

import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class eon {
    public static boolean tableExistsSQL() throws SQLException {
        DatabaseMetaData meta = Util.getConnection().getMetaData();
        ResultSet resultSet = meta.getTables(null, null, "user", new String[] {"TABLE"});
        return resultSet.next();
    }
}
