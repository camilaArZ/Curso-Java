package negocio;

public class CuentaCredito extends Cuenta {
    public Double costoManejoMensual;

    public CuentaCredito(Double costoManejoMensual, Integer numeroCuenta, String fechaApertura, Double saldo, String fechaCancelacion) {
        super(numeroCuenta, fechaApertura, saldo, fechaCancelacion);
        this.costoManejoMensual = costoManejoMensual;
    }

    public Double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(Double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaCredito{" +
                "costoManejoMensual=" + costoManejoMensual +
                ", numeroCuenta=" + numeroCuenta +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
