package com.dominio.bloques.bloques.logicatest;

import com.dominio.bloques.bloques.logica.BloquesLetras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import  static org.junit.jupiter.api.Assertions.assertTrue;

public class BloquesLetrasTest {
/* validas */
    @Test
    void caracterConBloquesTrue() {
        assertTrue(BloquesLetras.puedoObtenerPalabra("A"));
    }

    @Test
    void palabraConBloquesTrue(){
        assertTrue(BloquesLetras.puedoObtenerPalabra("DORITO"));
    }

    @Test
    void palabraConMayusculaYMinusculaTrue(){
        assertTrue(BloquesLetras.puedoObtenerPalabra("Libro"));
    }

    /*No validas*/

    @Test
    void palabraConBloquesFalse() {
        assertFalse(BloquesLetras.puedoObtenerPalabra("ARLEQUIN"));
    }

    @Test
    void palabraConBloquesRepetidosFalse() {
        assertFalse(BloquesLetras.puedoObtenerPalabra("BOZO"));
    }

    @Test
    void entradaNulaFalse() {
        assertFalse(BloquesLetras.puedoObtenerPalabra(null));
    }

    @Test
    void palabraVaciaFalse() {
        assertFalse(BloquesLetras.puedoObtenerPalabra(""));
    }

    @Test
    void palabraConNumerosFalse() {
        assertFalse(BloquesLetras.puedoObtenerPalabra("HELLO123"));
    }

    @Test
    void palabraConSimbolosFalse() {
        assertFalse(BloquesLetras.puedoObtenerPalabra("CAS@"));
    }

}
