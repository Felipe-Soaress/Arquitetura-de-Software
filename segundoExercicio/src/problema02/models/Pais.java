package problema02.models;

/**
 *
 * @author leona
 */
public class Pais {
    String pais;
    String sigla;

    public Pais() {
    }

    public Pais(String pais, String sigla) {
        this.pais = pais;
        this.sigla = sigla;
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
}
