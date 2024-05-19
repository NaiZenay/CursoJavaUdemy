package POO.IntefaceRepository.generics;

public class CompararMayorObjeto {


    //Cualquier objeto q implemete la interfaz comparable
    public static <T extends Comparable<T>> T mayorObj (T a,T b,T c){
        T mayor=a.compareTo(b)>0?a:b;
        mayor=c.compareTo(mayor)>0?c:mayor;
        return mayor;
    }

}
