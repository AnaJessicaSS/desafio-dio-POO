import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(14);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("---------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());

        System.out.println("---------------------------------------------------------");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jessica:" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("---------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Jessica:" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jessica:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());
    }
}
