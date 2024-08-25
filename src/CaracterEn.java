public class CaracterEn {

    public static char caracterEn(String cadena, int posicion) throws Exception {

        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posición no válida: " + posicion + ". La longitud de esta cadena es igual a: " + cadena.length());
        }
    }
}
