package com.dominio.bloques.bloques.logica;

import java.util.*;

public class BloquesLetras {

    private static final List<String[]> BLOQUESDEREFERENCIA = Arrays.asList(
            new String[]{"B", "O"}, new String[]{"X", "K"}, new String[]{"D", "Q"}, new String[]{"C", "P"},
            new String[]{"N", "A"}, new String[]{"G", "T"}, new String[]{"R", "E"}, new String[]{"T", "G"},
            new String[]{"Q", "D"}, new String[]{"F", "S"}, new String[]{"H", "U"}, new String[]{"V", "I"},
            new String[]{"A", "T"}, new String[]{"O", "B"}, new String[]{"E", "R"}, new String[]{"F", "S"},
            new String[]{"L", "Y"}, new String[]{"P", "C"}, new String[]{"Z", "M"}, new String[]{"J", "W"}
    );

    public static boolean puedoObtenerPalabra(String palabra) {
        try {
            if (palabra == null) {
                throw new IllegalArgumentException("La palabra ingresada no puede ser nula.");
            }

            if (palabra.trim().isEmpty()) {
                throw new IllegalArgumentException("La palabra no puede estar vacía o contener algun espacio");
            }
            if (!palabra.matches("^[a-zA-Z]+$")) {
                throw new IllegalArgumentException("Solo es permitido ingresar palabras , las cuales no deben contener numeros");
            }
            String palabraMayuscula = palabra.toUpperCase();
            List<String[]> bloquesDisponible = new ArrayList<>(BLOQUESDEREFERENCIA);
            for (char letra : palabraMayuscula.toCharArray()) {
                boolean letraEncontradaEnBloque = false;
                Iterator<String[]> iterator = bloquesDisponible.iterator();
                while (iterator.hasNext()) {
                    String[] letrasDelBloque = iterator.next();
                    if (letrasDelBloque[0].equals(String.valueOf(letra)) || letrasDelBloque[1].equals(String.valueOf(letra))) {
                        iterator.remove();
                        letraEncontradaEnBloque = true;
                        break;
                    }
                }
                if (!letraEncontradaEnBloque) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Texto ingresado no permitido por el siguiente motivo:  " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Se genero error al momento de comprar la palabra con los bloques de referencia  " + e);
            return false;
        }

    }
}
