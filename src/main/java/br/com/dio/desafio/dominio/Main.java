package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada a Objetos com Java");
        curso1.setDescricao("Curso destinado a desenvolver códigos com a prática de Programação Orientada a Objetos");
        curso1.setCargaHoraria(80);


        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição para curso de JavaScript");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do Java");
        mentoria1.setDescricao("Descrição da mentoria do Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Thiago: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos inscritos de Thiago: " + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXp());


        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}