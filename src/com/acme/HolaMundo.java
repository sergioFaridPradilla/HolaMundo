package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Excdribe tu nombre: ");
        msg.saludar(nombre);


    }
}
