package PatronesDiseno.Composite;

public class EjemploCompiste {
    public static void main(String[] args) {
        Directorio dir = new Directorio("Docs");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("Patron Composite.docx"));
        Directorio stream = new Directorio("API Stream");
        stream.addComponente(new Archivo("Stream-map.docx"));

            java.addComponente(stream);
        dir.addComponente(java);
        dir.addComponente(new Archivo("CV.pdf"));
        dir.addComponente(new Archivo("Logo.jpeg"));

        System.out.println(dir.mostrar(0));
    }
}
