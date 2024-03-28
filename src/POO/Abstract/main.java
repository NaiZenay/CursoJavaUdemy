package POO.Abstract;

import POO.Abstract.elementos.ElementForm;
import POO.Abstract.elementos.InputForm;
import POO.Abstract.elementos.SelectForm;
import POO.Abstract.elementos.TextAreaForm;
import POO.Abstract.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //La unica forma de "instanciar una clase abstracta es creando una clase anonima solo que esta es desechada despues de ser usada"
  /*
        ElementForm elementForm= new ElementForm() {
            @Override
            public String dibujarHTML() {
                return null;
            }
        };

   */

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm expLaboral = new TextAreaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java=new Opcion(1, "Java");
        java.setSeleccinado(true);
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion(2, "C"))
        .addOpcion(new Opcion(3, "C#"))
        .addOpcion(new Opcion(4, "Python"))
        .addOpcion(new Opcion(5, "JavaScript"))
        .addOpcion(new Opcion(6, "Rust"))
        .addOpcion(new Opcion(7, "C++"));

        username.setValor("Alex Flores");
        password.setValor("qwerty");
        email.setValor("alex@correo.com");
        edad.setValor("20");
        expLaboral.setValor("Lorem ipsum dolor sit amet consectetur adipiscing elit eu, viverra suspendisse malesuada mollis metus commodo montes, facilisi conubia accumsan quisque senectus pretium bibendum. Elementum odio facil.");

        List<ElementForm> elementos = new ArrayList<>();

        elementos.add(username);
        elementos.add(password);
        elementos.add(edad);
        elementos.add(email);
        elementos.add(expLaboral);
        elementos.add(lenguaje);

        //Implementacion del API para iterar elementos de ArrayList
        elementos.forEach(elemento -> System.out.println(elemento.dibujarHTML()+"\n<br>"));
    }
}
