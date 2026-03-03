package com.cursospring.moviesmanager.persistence;

import com.cursospring.moviesmanager.model.Genero;

public class GeneroDAO extends SessionManager{
    public static void create(Genero genero) {
        startSession();
        session.beginTransaction();
        session.persist(genero);
        session.getTransaction().commit();
        System.out.println("¡Genero creado/a con éxito!");
    }
}
