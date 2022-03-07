package examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FechaTest {

    @Test
    void CasosVerdaderos() {
        Fecha f = new Fecha();
        assertTrue(f.validarFecha(2020, 2, 23));
        assertTrue(f.validarFecha(2019, 7, 25));
    }
    @Test
    void CasosFalsos(){
        Fecha f = new Fecha();
        assertFalse(f.validarFecha(2019, 12, 250));
        assertFalse(f.validarFecha(0, 12, 25));
    }



}