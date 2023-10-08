package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Excribe tu nombre: ");
        String apellido = msg.solicitaDatos("Excribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellido);
        msg.saludar(p1);
    }
}
