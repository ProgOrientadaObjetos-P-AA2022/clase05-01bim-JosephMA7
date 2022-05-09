
package paquete01;

public class UnidadDVD {

    private String marca;
    private double costo;
    
    public UnidadDVD(String a,double n) {
        marca = a;
        costo = n;
    }

    public void establecerMarca(String n) {
        marca = n;
        costo = 0;
    }
    public void establecerCosto(double n){
        costo = n;
        
    }

    public String obtenerMarca() {
        return marca;
    }
    public double obtenerCosto(){
        return costo;
    }
}
