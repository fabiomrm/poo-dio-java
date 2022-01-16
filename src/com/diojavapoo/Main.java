package com.diojavapoo;

import com.diojavapoo.dominio.Bootcamp;
import com.diojavapoo.dominio.Curso;
import com.diojavapoo.dominio.Dev;
import com.diojavapoo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java Bootcamp");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Python Bootcamp");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria do Bootcamp Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp para desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFabio = new Dev();
        devFabio.setNome("Fábio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devFabio.getNome() + ": " + devFabio.getConteudosInscritos());
        System.out.println(devFabio.calcularTotalXP());
        devFabio.progredir();
        System.out.println("Conteúdos concluídos " + devFabio.getNome() + ": " + devFabio.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos " + devFabio.getNome() + ": " + devFabio.getConteudosInscritos());
        System.out.println(devFabio.calcularTotalXP());

        System.out.println("===============");

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos " + devLaura.getNome() + ": " + devLaura.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devLaura.getNome() + ": " + devLaura.getConteudosConcluidos());
        System.out.println(devLaura.calcularTotalXP());





    }
}
