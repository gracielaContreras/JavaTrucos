package patrones_de_diseno.factory2;

import java.sql.Connection;

/**
 * Producto
 */

public interface DBAdapter {
    Connection getConnection();
}
