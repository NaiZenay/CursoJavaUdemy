package Ejercicios.CarroSupermercado;

import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto>{
    private List<T> data;
    private int max =5;

    public BolsaSupermercado() {
        this.data = new ArrayList<>();
    }

    public BolsaSupermercado<T> add(T t){
        if (data.size()< max){
            this.data.add(t);
        }else {
            System.out.println("Bolsa llena");
        }
        return this;
    }

    public List<T> getData(){
        return data;
    }
}
