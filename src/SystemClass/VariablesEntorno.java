package SystemClass;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv = System.getenv();//Obtener las varibles de entorno del sistema en un MAP
        System.out.println("varEnv = " + varEnv);
                
        
        String userName= System.getenv("USERNAME");//Obtener una varible de entorno particular por su nombre
        System.out.println("userName = " + userName);

        String javaHome= System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String path= System.getenv("Path");
        System.out.println("path = " + path);
        
    }
}
