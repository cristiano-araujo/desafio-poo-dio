import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO em JavaScript");
        curso2.setDescricao("Descrição Curso POO em JavaScript");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java ");
        mentoria1.setDescricao("Descrição de java ");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript ");
        mentoria2.setDescricao("Descrição  de JavaScript");
        mentoria2.setData(LocalDate.now());

         /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devRenata = new Dev();
        devRenata.setNome("Renata");
        devRenata.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Renata" + devRenata.getConteudosInscritos());
        devRenata.progredir();
        devRenata.progredir();
        System.out.println("*_*");
        System.out.println("Conteudos Inscritos Renata" + devRenata.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Renata:" + devRenata.getConteudosConcluidos());
        System.out.println("XP: " + devRenata.calcularTotalXp());

        System.out.println(
                "_-_-_--_---"
        );


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("*-----*");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
















        Conteudo conteudo = new Conteudo() {
            @Override
            public double calcularXp() {
                return 0;
            }
        };
    }
}
