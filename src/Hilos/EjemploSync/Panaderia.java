package Hilos.EjemploSync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa){
        //si hay pan disponible para consumir no horneara mas hasta q se notificado
        while(disponible){
            try {
                //espera a q el metodo sea notificado o despertado
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan=masa;
        System.out.println("Panadero esta horneando el pan: "+masa);
        disponible=true;
        notify();
    }

    public synchronized String consumir(){
        //Espera a q halla pan dispobnible para q  se pueda consumir
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: "+this.pan);
        disponible=false;
        notify();
        return pan;
    }
}
