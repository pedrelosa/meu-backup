package aulaIwTraining.atividadeOO;

import java.time.LocalDate;

public class Curso {
    String nome;
    String turno;
    int cargaHoraria;
    LocalDate inicio;
    LocalDate fim;

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", turno='" + turno + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", inicio=" + inicio +
                ", fim=" + fim +
                '}';
    }
}
