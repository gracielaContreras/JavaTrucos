package patrones_de_diseno.factory2;

import java.sql.Connection;

/**
 * Producto concreto
 */

public class MySQLAdapter implements DBAdapter{
    @Override
    public Connection getConnection() {
        Connection con = null;
        return con;
    }
}
