package EstructurasDatos.ListCollection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStructure {
    public static void main(String[] args) {
        LinkedList <Alumno> ll = new LinkedList<>();
        ll.add(new Alumno("María", 8.5f));
        ll.add(new Alumno("Juan", 7.8f));
        ll.add(new Alumno("Ana", 9.2f));
        ll.add(new Alumno("Carlos", 6.9f));
        ll.add(new Alumno("Lucía", 8.7f));
        ll.add(new Alumno("Pedro", 7.3f));
        ll.add(new Alumno("Laura", 9.0f));
        ll.add(new Alumno("Sofía", 8.2f));
        ll.add(new Alumno("Miguel", 7.5f));
        ll.add(new Alumno("Elena", 8.8f));

        //Añadir primer y ultimo elemento
        //Obtener primer elemento
        ll.addFirst(new Alumno("Mafer", 9.8f));
        ll.addLast(new Alumno("Cyntia", 3.8f));

        //Obtener primer elemento
        System.out.println(ll.getFirst());
        //Obtener ultimo  elemento
        System.out.println(ll.getLast());
        //obtener por indice
        System.out.println(ll.get(6));
        //Extraer el primer y ultimo elemento de una lista (retorna el elemento eliminado
        ll.removeFirst();
        ll.removeLast();
        //eliminacion por indice
        ll.remove(3);

        //Elimina el primer y ultimo elemento de una lista (retorna el elemento eliminado
        ll.pollFirst();
        ll.removeLast();

        //devuelve el indice del elemento que se pasa por argumento
        ll.indexOf(new Alumno("Carlos", 6.9f));

//        Elimina el primer elemento de la lisa
        ll.pop();


        ListIterator<Alumno> li= ll.listIterator();
        while (li.hasNext()){
            Alumno a=li.next();
            System.out.println(a);

        }
    }
}
