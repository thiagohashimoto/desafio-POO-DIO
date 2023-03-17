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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}