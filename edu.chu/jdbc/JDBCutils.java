package jdbc;

/**
 * java database connection for mysql
 * 2022Äê3ÔÂ20ÈÕ
 * author£ºsudochu
 */

import java.sql.*;

public class JDBCutils {

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest?" +
                "serverTimezone=GMT&characterEncoding=utf8", "root", "password");
    }

    public static void getClose(ResultSet resultSet, Statement statement,Connection connection) {
        try {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
