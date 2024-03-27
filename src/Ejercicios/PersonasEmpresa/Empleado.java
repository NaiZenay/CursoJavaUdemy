package Ejercicios.PersonasEmpresa;

public class Empleado extends Persona{
    private double remuneracion;
    private int IDempleado;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int IDempleado) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.IDempleado = IDempleado;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getIDempleado() {
        return IDempleado;
    }

    public void aumentarRemuneracion(int porcentaje){
        remuneracion+=(remuneracion*((double) porcentaje /100));
    }
    @Override
    public String toString() {
        return super.toString()+ "\nremuneracion=" + remuneracion +
                ", IDempleado=" + IDempleado;
    }
}
