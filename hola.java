public class Congelado extends Producto {
    double temp;


    public Congelado(double date, int num, String pais, double fechaEm, double temp){
        super(date, num, pais, fechaEm);
        this.temp = temp;
    }
}
