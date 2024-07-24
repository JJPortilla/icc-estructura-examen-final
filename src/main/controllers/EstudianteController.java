package main.controllers;

import java.util.HashMap;

import main.models.Estudiante;

public class EstudianteController {
    
    

    public HashMap <String nombre,int calificacion > procesarEstudiantes(Estudiante[] estudiantes){
        for (int i = 0; i < estudiantes.length; i++) {
            if(i > i+1){
                
            }
        }
    } return;




    private String obtenerCategoria(int calificacion){
        
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }

        return String("La categoria es: "+calificacion);
    }
}
