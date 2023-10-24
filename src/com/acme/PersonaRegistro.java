package com.acme;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        //Sergio comente la linea de codigo que considero se puede eliminar
        //System.out.println("Esta es una linea inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
