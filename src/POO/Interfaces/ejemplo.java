package POO.Interfaces;

public class ejemplo {
    public static void main(String[] args) {
        //"Instanciando" la interfaz como un clase anonima
        var imprimir= new Imprimible(){
            @Override
            public String imprimir() {
                return null;
            }
        };
        Curriculum cv= new Curriculum("Resumen laboral... ","Alex Flores","Ing. software");
        cv.addExperiencia("JavaScript")
        .addExperiencia("TypeScript")
        .addExperiencia("CSS")
        .addExperiencia("HTML");

        Libro libro= new Libro("Mani",Genero.SUSPENSO,"Libro de Suspenso");
        libro.addPagina(new Pagina("Capitulo 1"))
        .addPagina(new Pagina("Capitulo 2"))
        .addPagina(new Pagina("Capitulo 3"))
        .addPagina(new Pagina("Capitulo 4"))
        .addPagina(new Pagina("Capitulo 5"))
        .addPagina(new Pagina("Capitulo 6"));

        Informe informe= new Informe("Estudio sobre microservicios","Ricardo Tapia","BRuno Diaz");

        imprimir(cv);
        imprimir(libro);
        imprimir(informe);

        Imprimible.metodoOpcional();
        informe.imprimible();

    }
public static void imprimir(Imprimible imprimible){
    System.out.println(imprimible.imprimir());
}
}
