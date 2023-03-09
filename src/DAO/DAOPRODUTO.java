package DAO;
import FACTORY.Cfactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import MODELO.PRODUTOMODEL;


public class DAOPRODUTO {//Dentro do DAO é onde você gerencia todo o código para o Banco de Dados.
   

    public void create(PRODUTOMODEL P){
    Connection con = Cfactory.getConnetion();
    PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO cadprod (NOME,MARCA,CODIGO,VALIDADE,PRECO,CATEGORIA,MERCADORIA)VALUES(?,?,?,?,?,?,?)");
            
            stmt.setString(1,P.getNOME());
            stmt.setString(2,P.getMARCA());
            stmt.setInt(3,P.getCODIGO());
            stmt.setInt(4,P.getVALIDADE());
            stmt.setFloat(5,P.getPRECO());
            stmt.setString(6,P.getCATEGORIA()); 
            stmt.setString(7,P.getMERCADORIA()); 
            
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
    
     

    public List<PRODUTOMODEL> read() {

        Connection con = Cfactory.getConnetion();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PRODUTOMODEL> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cadprod");
            rs = stmt.executeQuery();

            while (rs.next()) {

                PRODUTOMODEL produto = new PRODUTOMODEL();

                produto.setNOME(rs.getString("NOME"));
                produto.setMARCA(rs.getString("MARCA"));
                produto.setCODIGO(rs.getInt("CODIGO"));
                produto.setVALIDADE(rs.getInt("VALIDADE"));
                produto.setPRECO(rs.getFloat("PRECO"));
                produto.setCATEGORIA(rs.getString("CATEGORIA"));
                produto.setMercadoria(rs.getString("MERCADORIA"));
                
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOPRODUTO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Cfactory.closeConnection(con, stmt);
        }

        return produtos;

    }
}
    
    
    
    
    

