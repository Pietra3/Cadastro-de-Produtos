package DAO;
import FACTORY.Cfactory;
import MODELO.USUARIOMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class DAOUsuario {
 
    
public List<USUARIOMODEL> read() {

        Connection con = Cfactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<USUARIOMODEL> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                USUARIOMODEL usuario = new USUARIOMODEL();

                usuario.setnome(rs.getString("nome"));
                usuario.setEMAIL(rs.getString("EMAIL"));
                usuario.setNIVEL(rs.getString("NIVEL"));
                usuario.setDATCAD(rs.getInt("DATCAD"));
                
                usuarios.add(usuario);
                
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOPRODUTO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Cfactory.closeConnection(con, stmt);
        }

        return usuarios;

    }
    
public void atualizar(USUARIOMODEL A){
    Connection con = Cfactory.getConnetion();
    PreparedStatement stmt = null;
        try {
          stmt = con.prepareStatement("UPDATE usuario SET nome=?,senha=?,EMAIL=?,NIVEL=?,DATCAD=?");
            stmt.setString(1,A.getnome());
            stmt.setString(2,A.getSenha());
            stmt.setString(3,A.getEMAIL());
            stmt.setString(4,A.getNIVEL());
            stmt.setInt(5,A.getDATCAD());
            stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "ATUALIZADO SUCESSO!");
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR ,ERRO: " +e);
            Logger.getLogger(DAOPRODUTO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            Cfactory.closeConnection(con, stmt);
        }
}


       
    public void excluir(USUARIOMODEL U) throws SQLException{
    Connection con = Cfactory.getConnetion();
    PreparedStatement stmt = null;
        try {
            
           stmt = con.prepareStatement("DELETE FROM usuario WHERE idusuario=?");
            stmt.setInt(1,U.getid());
            
            stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "DELETADO COM SUCESSO!");
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR ,ERRO: " +e);
            Logger.getLogger(DAOPRODUTO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            Cfactory.closeConnection(con, stmt);
        }
        }   
    
    public void create(USUARIOMODEL U){
    Connection con = Cfactory.getConnetion();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO usuario(nome,Senha,EMAIL,NIVEL,DATCAD)VALUES(?,?,?,?,?)");
            
            stmt.setString(1,U.getnome());
            stmt.setString(2,U.getSenha());
            stmt.setString(3,U.getEMAIL());
            stmt.setString(4,U.getNIVEL());
            stmt.setInt(5,U.getDATCAD());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!ERRO : " +ex);
            Logger.getLogger(DAOPRODUTO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Cfactory.closeConnection(con, stmt);
        }
    }
    
    public boolean checkLogin(String nome, String senha) {

        Connection con = Cfactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome = ? and senha = ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {  
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Cfactory.closeConnection(con, stmt);
        }

        return check;
    }  


}
 


