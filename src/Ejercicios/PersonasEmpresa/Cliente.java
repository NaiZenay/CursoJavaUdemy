package Ejercicios.PersonasEmpresa;

public class Cliente extends Persona{
    private int IDcliente;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int IDcliente) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.IDcliente = IDcliente;
    }

    public int getIDcliente() {
        return IDcliente;
    }

    @Override
    public String toString() {
        return super.toString()+"\n" +
                "IDcliente=" + IDcliente;
    }
}
