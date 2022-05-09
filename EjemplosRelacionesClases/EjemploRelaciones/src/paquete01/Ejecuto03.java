
package paquete01;

public class Ejecuto03 {

    public static void main(String[] args) {
        
        String procesador = "Toshiba";
        double n = 200;
        UnidadDVD unidad = new UnidadDVD(procesador,n);
        
        Computadora computadora = new Computadora(procesador, unidad);
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());
        
    }

}

