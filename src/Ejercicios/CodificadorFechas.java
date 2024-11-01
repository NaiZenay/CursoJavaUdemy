package Ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodificadorFechas {
    static Map<Character, String[]> anos = new HashMap<>();
    static Map<Character, String> meses = new HashMap<>();
    static Map<String, String> dias = new HashMap<>();

    public static void main(String[] args) {
        mapearAnos();
        mapearMeses();
        mapearDias();
        Character ano = buscarAno("2000");
        Character mes = buscarMes("April");
        String dia = buscarDia("20");
        System.out.println("Año");
        System.out.println(ano + ": " + Arrays.toString(anos.get(ano)));
        System.out.println("Mes");
        System.out.println(mes + ": " + (meses.get(mes)));
        System.out.println("Dia");
        System.out.println(dia + ": " + (dias.get(dia)));
        System.out.println("Resultado");
        System.out.println(ano+"/"+mes+"/"+dia);
    }


    private static void mapearAnos() {
        char i = 'A';
        int anoInicial = 2001;
        while (i < 'Y') {
            anos.put(i, getAnos(anoInicial));
            i++;
            anoInicial++;
        }
        anos.put('Y', getAnos(2000));
    }

    private static void mapearMeses() {
        char code = 'A';
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "Oktober", "November", "December"
        };

        for (String month : months) {
            meses.put(code, month);
            code++;
        }
    }

    private static void mapearDias() {
        char code = 'A';
        int dia = 1;
        while (code < 'W') {
            if (dia < 10) {
                dias.put(String.valueOf(dia), String.valueOf(dia));
//                System.out.println(dia+": "+dias.get(String.valueOf(dia)));
                dia++;
            } else {
                dias.put(String.valueOf(code), String.valueOf(dia));
//                System.out.println(code+": "+dias.get(String.valueOf(code)));
                code++;
                dia++;
            }
        }
    }

    private static Character buscarAno(String ano) {
        char i = 'A';
        while (i < 'Z') {
            if (anos.get(i)!=null&&Arrays.asList(anos.get(i)).contains(ano)) {
                return i;
            }
            i++;
        }
        return null;
    }

    private static Character buscarMes(String mes) {
        char code = 'A';
        while (code < 'Y') {
            if (meses.get(code)!=null&&meses.get(code).contains(mes)) {
                return code;
            }
            code++;
        }
        return null;
    }

    private static String buscarDia(String dia) {
        char i = 'A';
        int Numbercode = 1;
        while (i < 'Z') {
            if (dias.get(String.valueOf(Numbercode))!=null&&dias.get(String.valueOf(Numbercode)).contains(dia)) {
                return String.valueOf(Numbercode);
            } else if (dias.get(String.valueOf(i)).contains(dia)) {
                return String.valueOf(i);
            }
            if (Numbercode < 10) {
                Numbercode++;
            }
            i++;

        }
        return null;
    }

    //carga de años por codigo de 25 en 25
    public static String[] getAnos(int puntoPartida) {
        String[] anos = new String[5];
        for (int i = 0; i < 5; i++) {
            anos[i] = String.valueOf(puntoPartida);
            puntoPartida += 25;
        }
        return anos;
    }
}
