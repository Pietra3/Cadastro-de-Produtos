package FACTORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuelson
 */
public class Cfactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/cadproduto";
    private static final String USER = "root";
    private static final String PASS = "123";
    public static PreparedStatement Connetion;

    public static  Connection getConnetion() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: " +ex);
        }
}
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cfactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cfactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//gerar PDF
     public Connection openConnectionPDF() {
    Connection connection = null;
    try {
      Class.forName(DRIVER);
      connection = DriverManager.getConnection(URL, USER, PASS);
    } catch (Exception ex) {
      return null;
    }

    return connection;
  }

  public void closeConnectionPDF(Connection  con) {
    if (con != null) {
      try {
        con.close();
      } catch (SQLException ex) {
      }
    }
  }

  public void closeConnectionPDF(Connection connection, PreparedStatement ps) {
    this.closeConnection(connection);
    if (ps != null) {
      try {
        ps.close();
      } catch (SQLException ex) {
      }
    }
  }

  public void closeConnection(Connection connection, PreparedStatement ps, ResultSet rs) {
    closeConnection(connection, ps);
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException ex) {
      }
    }
  }
}

