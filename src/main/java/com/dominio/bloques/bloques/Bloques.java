package com.dominio.bloques.bloques;

import com.dominio.bloques.bloques.logica.BloquesLetras;

public class Bloques {

    public static void main(String[] args) {
        boolean palabra = BloquesLetras.puedoObtenerPalabra("DORITO");
        if (palabra) {
            System.out.println("La palabra ingresada si se puede obtener en base a los bloques de referencia ya que es:  " + palabra );
        }else{
            System.out.println("No se puede obtener la palabra ingresada en base a los bloques de referencia ya que es:  " + palabra);
        } 
    }
}
