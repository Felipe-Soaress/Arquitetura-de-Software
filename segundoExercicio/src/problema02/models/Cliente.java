package problema02.models;

/**
 *
 * @author leona
 */
public class Cliente {
    String nome;
    String telefone;
    float limiteCredito;
    Pais pais;

    public Cliente() {
    }

    public Cliente(String nome, String telefone, float limiteCredito, Pais pais) {
        this.nome = nome;
        this.telefone = telefone;
        this.limiteCredito = limiteCredito;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
