public class CuentaBancaria{
    private String titular;
    private double cantidad;

    public CuentaBancaria(String titular){
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public CuentaBancaria(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return "CuentaBancaria{" + "titular =" + titular + ", cantidad = " + cantidad + "}";
    }

    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
}