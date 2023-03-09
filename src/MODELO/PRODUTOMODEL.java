
package MODELO;

public class PRODUTOMODEL {
    
    private String NOME;
    private String MARCA;
    private int CODIGO; 
    private int VALIDADE;
    private float PRECO;
    private String CATEGORIA;

    public String getMercadoria() {
        return Mercadoria;
    }

    public void setMercadoria(String Mercadoria) {
        this.Mercadoria = Mercadoria;
    }
    private String Mercadoria;
    private int id;

    public int getid() {
        return id;
    }

    public void setid(int Id) {
        this.CODIGO = Id;
    }



    public String getMERCADORIA() {
        return MERCADORIA;
    }

    public void setMERCADORIA(String MERCADORIA) {
        this.MERCADORIA = MERCADORIA;
    }
    private String MERCADORIA;

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }

    public int getVALIDADE() {
        return VALIDADE;
    }

    public void setVALIDADE(int VALIDADE) {
        this.VALIDADE = VALIDADE;
    }

    public float getPRECO() {
        return  PRECO;
    }

    public void setPRECO(float PRECO) {
        this.PRECO = PRECO;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }
}

    
