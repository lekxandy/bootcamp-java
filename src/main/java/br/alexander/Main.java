package br.alexander;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;

import br.alexander.dominio.Bootcamp;
import br.alexander.dominio.Curso;
import br.alexander.dominio.Dev;
import br.alexander.dominio.Mentoria;

/**
 *
 * @author Alexander Roberto dos Santos
 */
public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        var out = new PrintStream(System.out, true, "UTF-8");

        var curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Exemplo de descrição do curso Java");
        curso1.setCargaHoraria(8);

        var curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Exemplo de descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        var mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Exemplo de descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        var bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Exemplo de descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        var dev1 = new Dev();
        dev1.setNome("Alexander");
        dev1.inscreverBootcamp(bootcamp);
        out.println("Conteúdos Inscritos Alexander:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        out.println("--");
        out.println("Conteúdos Inscritos Alexander:" + dev1.getConteudosInscritos());
        out.println("Conteúdos Concluídos Alexander:" + dev1.getConteudosConcluidos());
        out.println("XP:" + dev1.calcularTotalXp());

        out.println("------------");

        var dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        out.println("Conteúdos Inscritos Lucas:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        out.println("--");
        out.println("Conteúdos Inscritos Lucas:" + dev2.getConteudosInscritos());
        out.println("Conteúdos Concluídos Lucas:" + dev2.getConteudosConcluidos());
        out.println("XP:" + dev2.calcularTotalXp());

    }
}
