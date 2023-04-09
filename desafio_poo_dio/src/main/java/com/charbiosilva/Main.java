package com.charbiosilva;

import com.charbiosilva.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Devs devCamila = new Devs();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: Camila " + devCamila.getConteudosInscritos());
        System.out.println(" ");
        System.out.println("--\tData de inscrição e data limite para o término do curso\t---");
        for (Conteudo conteudo : devCamila.getConteudosInscritos()) {
            System.out.println(conteudo.getTitulo() +
                    " - Data Inicial: " + bootcamp.getDataInicial() +
                    " - Data Término: " + bootcamp.getDataFinal());
        }
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: Camila " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: Camila " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println(" ");
        System.out.println("--------");
        System.out.println(" ");

        Devs devJoao = new Devs();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: João " + devJoao.getConteudosInscritos());
        System.out.println(" ");
        System.out.println("--\tData de inscrição e data limite para o término do curso\t---");
        for(Conteudo conteudo: devJoao.getConteudosInscritos()) {
            System.out.println(conteudo.getTitulo() +
                    " - Data Inicial: " + bootcamp.getDataInicial() +
                    " - Data Final: " + bootcamp.getDataFinal());
        }
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: João " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: João " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        System.out.println(" ");
    }
}