package POO.IntefaceRepository.generics;

public class CompararMayorObjeto {


    //Cualquier objeto q implemete la interfaz comparable
    public static <T extends Comparable> T mayorObj (T a,T b,T c){
        T mayor=a.compareTo(b)>0?a:b;
        mayor=mayor.compareTo((c)>0?mayor:c);
        return mayor;
    }

}
