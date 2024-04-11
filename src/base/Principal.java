package base;

import negocio.Banco;

public class Principal {
    public static void main(String[] args) {

        Banco banco = new Banco("Bancolombia", "BAN458", "1523642899", "Calle 993",
                "0823", "Barrio 123", "Estado 123", "12345");
        System.out.printf("Nombre: %s\nRFC: %s\nTeléfono: %s\nDomicilio: %s\n",
                banco.getNombre(), banco.getRfc(), banco.getTelefono(), banco.getDomicilio());
    }
}