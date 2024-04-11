package negocio;

public class CuentaAhorros extends Cuenta{

    public Double tasaInteresMensual;
    public CuentaAhorros(Double tasaInteresMensual, Integer numeroCuenta, String fechaApertura, Double saldo, String fechaCancelacion) {
        super(numeroCuenta, fechaApertura, saldo, fechaCancelacion);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public Double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(Double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }
    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                ", numeroCuenta=" + numeroCuenta +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
