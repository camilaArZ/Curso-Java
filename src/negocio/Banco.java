package negocio;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String rfc;
    private String telefono;
    private Domicilio domicilio;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, String rfc, String telefono, String calle, String numero, String colonia, String estado, String codigoPostal) {
        this.setNombre(nombre);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.clientes = new ArrayList<>();
    }

    public Banco(String nombre, String rfc, String telefono, Domicilio domicilio) {
        this.setNombre(nombre);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
        this.clientes = new ArrayList<>();
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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }
}
