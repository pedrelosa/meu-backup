package aulaIwTraining.atividadeOO;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class TestAluno {
    public static void main(String[] args) {
        Curso c01 = new Curso();
        Curso c02 = new Curso();
        Contato cont01 = new Contato();
        Endereco e01 = new Endereco();
        Estudante estudante = new Estudante();

        c01.nome = "Java";
        c01.turno = "Noite";
        c01.cargaHoraria = 120;
        c01.inicio = LocalDate.of(2022, Month.DECEMBER, 1);
        c01.fim = c01.inicio.plusMonths(c01.cargaHoraria / 16);

        c02.nome = "FrontEnd";
        c02.turno = "Noite";
        c02.cargaHoraria = 80;
        c02.inicio = LocalDate.of(2022, Month.AUGUST, 22);
        c02.fim = c02.inicio.plusMonths(c02.cargaHoraria / 16);

        cont01.telefone01 = "(85) 99787-2280";// USAR MASK
        cont01.telefone02 = "(85) 99986-1066";
        cont01.email = "pedrelosa@hotmail.com";


        e01.logradouro = "Padre Mororó, 2413";
        e01.bairro = "Benfica";
        e01.cep = "60015221";
        e01.municipio = "Fortaleza";
        e01.estado = "Ceará";
        e01.pais = "Brasil";


        estudante.endereco = e01;
        estudante.contato = cont01;
        estudante.dataDeNascimento = LocalDate.of(2002, Month.FEBRUARY, 9);
        estudante.cursos = new ArrayList<Curso>();

        estudante.cursos.add(c01);
        estudante.cursos.add(c02);


        System.out.println(estudante);

    }
}

