package problema02.models;

/**
 *
 * @author leona
 */
public class Pais {
    String pais;
    String sigla;
    String codigoTelefone;

    public Pais() {
    }

    public Pais(String pais, String sigla, String codigo) {
        this.pais = pais;
        this.sigla = sigla;
        this.codigoTelefone = codigo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    public String getCodigoTelefone() {
        return codigoTelefone;
    }

    public void setCodigoTelefone(String codigo) {
        this.codigoTelefone = codigo;
    }
}
