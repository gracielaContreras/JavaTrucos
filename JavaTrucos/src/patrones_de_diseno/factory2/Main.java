package patrones_de_diseno.factory2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBAdapter dbAdapter = DBFactory.getDBAdapter(DBFactory.DBType.MYSQL);
        Connection connection = dbAdapter.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("SELECT * FROM TABLA");
    }
}
