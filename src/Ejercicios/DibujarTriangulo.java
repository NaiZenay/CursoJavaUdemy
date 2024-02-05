public class DibujarTriangulo {
    public static void main(String[] args) {
        String triangulo="";
        for (int i = 0; i < 5; i++) {
            triangulo+="\n";
            for (int j = 0; j<=i ; j++) {
                triangulo+="*";
            }
        }
        System.out.println(triangulo);
    }
}
