public class ComisionPersonalizada implements EstrategiaComision{
    private int cantidadLetras;

    public ComisionPersonalizada(String nombre) {
        this.cantidadLetras = nombre.length();
    }

    @Override
    public double calcularComision(double montoVenta){
        float porcentaje = 5+cantidadLetras;//5% por defecto + 1% por cada letra del primer nombre
        return montoVenta*(porcentaje/100);//Da lo mismo el parentesis pero por orden lo dejo
    };
}
