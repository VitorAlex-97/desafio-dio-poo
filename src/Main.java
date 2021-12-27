import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Abstraindo curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição JavaScipt");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Vitor: "+ devVitor.getContedosInscritos());
        devVitor.progredir();
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluidos Vitor: "+ devVitor.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Vitor: "+ devVitor.getContedosInscritos());
        System.out.println("XP: " + devVitor.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: "+ devLucas.getContedosInscritos());
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluidos Lucas: "+ devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Lucas: "+ devLucas.getContedosInscritos());
        devLucas.progredir();
        System.out.println("XP: " + devLucas.calcularTotalXp());

    }
}
