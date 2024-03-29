package POO.Abstract;

import POO.Abstract.elementos.ElementForm;
import POO.Abstract.elementos.InputForm;
import POO.Abstract.elementos.SelectForm;
import POO.Abstract.elementos.TextAreaForm;
import POO.Abstract.elementos.select.Opcion;
import POO.Abstract.validador.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //La unica forma de "instanciar una clase abstracta es creando una clase anonima solo que esta es desechada despues de ser usada"
        //Un elemento que se utiliza una sola vez
        ElementForm elementForm = new ElementForm("Bienvenida") {
            @Override
            public String dibujarHTML() {
                return "<input name=\"saludo\" type=\"text\" value=\"Hola\" disabled> ";
            }
        };


        InputForm username = new InputForm("username");
        username.addValidador(new Requerido());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new NoNulo());

        InputForm email = new InputForm("email", "email");
        email.addValidador(new Email());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new Numerico());

        TextAreaForm expLaboral = new TextAreaForm("exp", 5, 9);
        expLaboral.addValidador(new Largo(20, 200));

        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion(1, "Java").setSeleccinado())
                .addOpcion(new Opcion(2, "C"))
                .addOpcion(new Opcion(3, "C#"))
                .addOpcion(new Opcion(4, "Python"))
                .addOpcion(new Opcion(5, "JavaScript"))
                .addOpcion(new Opcion(6, "Rust"))
                .addOpcion(new Opcion(7, "C++"));

        lenguaje.addValidador(new NoNulo());

        username.setValor("Alex Flores");
        password.setValor("qwerty");
        email.setValor("alex@correo.com");
        edad.setValor("20");
        expLaboral.setValor("Lorem ");

        List<ElementForm> elementos = new ArrayList<>();
        elementos.add(elementForm);
        elementos.add(username);
        elementos.add(password);
        elementos.add(edad);
        elementos.add(email);
        elementos.add(expLaboral);
        elementos.add(lenguaje);

        //Implementacion del API para iterar elementos de ArrayList
        elementos.forEach(elemento -> System.out.println(elemento.dibujarHTML() + "\n<br>"));
        elementos.forEach(elemento ->{

           if (!(elemento.esValido())){
               elemento.getErrores().forEach(System.out::println);
           }

        } );

    }
}
