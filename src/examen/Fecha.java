package examen;
/**
 * @version 1.0
 * @author AlvaroZorrilla
 * Clase fecha con atributo publico booleano, y luego un metodo que se llama validar fecha donde se comprueba si la fecha es valida
 */

public class Fecha {
    /**
     * Atributo fechaValida que no esta inicializado
     */
    public Boolean fechaValida;
    /**
     * Metodo validarFecha que se le pasa por parametro Año, Med y dia, y devuelve true si la fecha es valida y false si la fecha no es valida
     * @param anio parametro año que indica el año de la fecha introducida
     * @param mes parametro mes que indica el mes de la fecha introducida
     * @param dia parametro dia que indica el dia de la fecha introducida
     * @return true o false si la fecha es valida o no
     */
    public  boolean validarFecha(int anio, int mes, int dia) {
        boolean fechaValida = false;
        if ((dia > 0) && (mes > 0) && (anio > 0)) {
            if ((mes <= 12) && (dia <= 31)) {
                if (mes == 2) {
                    fechaValida = dia <= 28;
                } else if (mes % 2 == 0) {
                    fechaValida = dia <= 30;
                } else {
                    fechaValida = dia <= 31;
                }
            }
        }
        return fechaValida;
    }
}