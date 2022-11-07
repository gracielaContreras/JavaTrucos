package patrones_de_diseno.factory2;

/**
 * Creador y creador concreto
 */
public class DBFactory {
    public enum DBType { MYSQL, Oracle, PostgreSQL }

    public  static DBAdapter getDBAdapter(DBType tipo) {
      return switch (tipo){
            case MYSQL -> new MySQLAdapter();
            case Oracle -> new OracleAdapter();
            case PostgreSQL -> new PostgreSQLAdapter();
            default -> throw new IllegalArgumentException("No soportado");
        };
    }
}
