package aulaIwTraining.atividadeOO;

public class Endereco {
    String logradouro;
    String bairro;
    String cep;
    String municipio;
    String estado;
    String pais;

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", municipio='" + municipio + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
