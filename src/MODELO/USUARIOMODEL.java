
package MODELO;

import javax.swing.JTextField;


public class USUARIOMODEL {
    
    private int id;
    private String nome;
    private String Senha; 
    private String EMAIL;
    private String NIVEL;
    private int DATCAD;
    
    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNIVEL() {
        return NIVEL;
    }

    public void setNIVEL(String NIVEL) {
        this.NIVEL = NIVEL;
    }

    public int getDATCAD() {
        return DATCAD;
    }

    public void setDATCAD(int DATACAD) {
        this.DATCAD = DATACAD;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String usuario) {
        this.nome = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        this.Senha = senha;
    }

    public void getDATCAD(JTextField jTextField) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
