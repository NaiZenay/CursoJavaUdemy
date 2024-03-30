package POO.Interfaces;

public class ejemplo {
    public static void main(String[] args) {
        Curriculum cv= new Curriculum("Resumen laboral... ","Alex Flores","Ing. software");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("TypeScript");
        cv.addExperiencia("CSS");
        cv.addExperiencia("HTML");

        Libro libro= new Libro("Mani",Genero.SUSPENSO,"Libro de Suspenso");
        libro.addPagina(new Pagina("Capitulo 1"));
        libro.addPagina(new Pagina("Capitulo 2"));
        libro.addPagina(new Pagina("Capitulo 3"));
        libro.addPagina(new Pagina("Capitulo 4"));
        libro.addPagina(new Pagina("Capitulo 5"));
        libro.addPagina(new Pagina("Capitulo 6"));

        Informe informe= new Informe("Estudio sobre microservicios","Ricardo Tapia","BRuno Diaz");


        imprimir(cv);
        imprimir(libro);
        imprimir(informe);
    }
public static void imprimir(Imprimible imprimible){
    System.out.println(imprimible.imprimir());
}
}
