public class ComisionEstandar implements EstrategiaComision{
    @Override
    public double calcularComision(double montoVenta){
        return montoVenta*0.05;//retorna el 5% del monto de la venta 5/100=0.05
    }
}
