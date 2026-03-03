package com.cursospring.moviesmanager;

import com.cursospring.moviesmanager.model.Genero;
import com.cursospring.moviesmanager.model.Pelicula;
import com.cursospring.moviesmanager.persistence.GeneroDAO;
import com.cursospring.moviesmanager.persistence.PeliculaDAO;

import java.util.ArrayList;
import java.util.List;

import static com.cursospring.moviesmanager.persistence.PeliculaDAO.*;

public class App {
    public static void main(String args[]) {
//        GeneroDAO.startSession();
//
//        //1. Creación de genero
//        Genero genero1 = new Genero("terror");
//        createGenero(genero1);
//
//
//
//        //2. Creación de Película
//
//
//
//        Pelicula pelí = new Pelicula("Pelí de Terror", "Kubbic", 2015, genero1);
//        create(pelí);
//
//        GeneroDAO.finishSession();

        PeliculaDAO.startSession();
        searchBeforeYear(2000).forEach(System.out::println);
        PeliculaDAO.finishSession();

        GeneroDAO.startSession();
        searchWithGenero("t").forEach(System.out::println);
        GeneroDAO.finishSession();
    }
    private static void createGenero(Genero genero) {
        GeneroDAO.create(genero);
    }
}
