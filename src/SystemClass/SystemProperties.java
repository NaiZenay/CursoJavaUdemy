package SystemClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream= new FileInputStream("src/SystemClass/config.properties");
            Properties properties = new Properties(System.getProperties());//CARGAR CONFIGURACIONES DEL SISTEMA


            try {
                properties.load(fileInputStream);
                properties.setProperty("My.Config","Valor guardado en el objeto properties");//Crear propiedad

                System.setProperties(properties);//Asignar propiedad
                System.getProperties().list(System.out);//listar propiedades
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
