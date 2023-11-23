package Variables;

public class Rules {
    public static void main(String[] args) {

        //Nombrar variables iniciando con una letra minuscula
        //No agregar acentos o ñ
        //Se puede crear sin un valor
        int num;

        //O se puede crear con un valor inicial
        int num2 = 0;

        //Puede reasignarse el valor de la variable
        num2 = 20;

        //Varaibles dentro de estructuras solo existen ahi
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //No leera i ya que solo existe dentro de la estructura for
        System.out.println(i);
        

    }
}
