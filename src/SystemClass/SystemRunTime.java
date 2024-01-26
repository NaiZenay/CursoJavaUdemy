package SystemClass;

import java.io.IOException;

public class SystemRunTime {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();//Representa la ejecucion actual de la aplicacion de java
        Process process;//Permite operar con procesos externos al programa de java

        try {
            if (System.getProperty("os.name").startsWith("Windows")){//Comprueba el SO

                process = rt.exec("notepad");//Ejecuta un comonado del SO(el bloc de notas)
            }else {
                process= rt.exec("gedit");
            }
            process.waitFor();//Hasta que se cierre la aplicacion

            //Manejo de errores
        } catch (IOException e) {
            System.err.println("Comando desconocido");
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("se cerro el editor");
        System.exit(0);

    }
}
