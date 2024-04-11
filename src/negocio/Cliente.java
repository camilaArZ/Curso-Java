package negocio;

import java.util.ArrayList;

public class Cliente {
    public Integer numeroCliente;
    public String nombre;
    public String rfc;
    public String telefono;
    public String fechaNacimiento;
    public Domicilio domicilio;
    public ArrayList<Cuenta> cuentas;

    public Cliente(Integer numeroCliente, String nombre, String rfc, String telefono, String fechaNacimiento, Domicilio domicilio, ArrayList<Cuenta> cuentas) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.cuentas = cuentas;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", nombre='" + nombre + '\'' +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", domicilio=" + domicilio +
                ", cuentas=" + cuentas +
                '}';
    }
}
