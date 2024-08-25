public class NumNegativo extends Exception {

    public NumNegativo() {
        super("Numero negativo no permitido");
    }

    public NumNegativo(String mensaje) {
        super(mensaje);
    }
}
