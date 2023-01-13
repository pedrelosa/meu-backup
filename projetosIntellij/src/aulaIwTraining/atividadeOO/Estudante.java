package aulaIwTraining.atividadeOO;

import java.time.LocalDate;
import java.util.List;

public class Estudante {
    LocalDate dataDeNascimento;
    Endereco endereco;
    Contato contato;
    List<Curso> cursos;

    String transformaListEmString(List<Curso> curso) {

        String totalCursos = "";

        for (Curso value : curso) {
            totalCursos += value.nome + " ";
        }

        return totalCursos;
    }

    @Override
    public String toString() {
        return "Estudante: {  " + dataDeNascimento + ", " + endereco + ", " + contato + ", " + transformaListEmString(cursos) + " }";
    }

    /*@Override
    public String toString() {
        return "Estudante{" +
                "dataDeNascimento=" + dataDeNascimento +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", cursos=" + cursos +
                '}';
    }*/
}
