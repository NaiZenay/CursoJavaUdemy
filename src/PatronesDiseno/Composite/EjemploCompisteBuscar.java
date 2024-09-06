package PatronesDiseno.Composite;

public class EjemploCompisteBuscar {
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

        boolean encontrado= dir.buscar("Cv.pdf");
        System.out.println("encontrado = " + encontrado);

        encontrado= java.buscar("API Strea");
        System.out.println("encontrado = " + encontrado);
    }


}
