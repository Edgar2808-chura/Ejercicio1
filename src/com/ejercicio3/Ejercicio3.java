package com.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] name = {"Edgar", "Luis", "David", "Juan", "Esteban"};

        String concatenacion = "";

        for (int i = 0; i < name.length; i++) {
            concatenacion += " "+name[i];
            //concatenacion += name[i].concat(" ");
        }
        System.out.println("Los nombres de los amigos son:"+concatenacion);
    }
}
