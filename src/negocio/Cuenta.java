package negocio;

public abstract class Cuenta {
    public Integer numeroCuenta;
    public String fechaApertura;
    public Double saldo;
    public String fechaCancelacion;

    public Cuenta(Integer numeroCuenta, String fechaApertura, Double saldo, String fechaCancelacion) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.fechaCancelacion = fechaCancelacion;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
