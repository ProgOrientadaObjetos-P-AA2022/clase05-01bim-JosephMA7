
package paquete01;

public class Computadora {

    private String tipoProcesador;
    private UnidadDVD unidadDvd;

    public Computadora(String a, UnidadDVD unidad) {
        tipoProcesador = a;
        unidadDvd = unidad;
    }

    public void establecerTipoProcesador(String aut) {
        tipoProcesador = aut;
    }

    public void establecerUnidadDvd(UnidadDVD u) {
        unidadDvd = u;
    }

    public String obtenerTipoProcesador() {
        return tipoProcesador;
    }

    public UnidadDVD obtenerUnidadDvd() {
        return unidadDvd;
    }

}
