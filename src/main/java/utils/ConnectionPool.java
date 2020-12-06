package utils;

import org.apache.log4j.Logger;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionPool {

    public static final Logger logger = Logger.getLogger(ConnectionPool.class);

    private static InitialContext ic;

    private static DataSource ds;

    public static Connection getConnection() {
        Connection conn = null;
            try {
                ic = new InitialContext();
                ds = (DataSource) ic.lookup("java:/comp/env/jdbc/my_database");
                conn = ds.getConnection();
            } catch (Exception e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        logger.debug(conn);
        return conn;
    }
}
