package Recursividad;

import Recursividad.models.Componente;

import java.util.stream.Stream;

public class EjemploComponentes {
    public static void main(String[] args) {
        Componente pc= new Componente("Gabinete PC");
        Componente fuentePoder= new Componente("Fuente Poder 700W");
        Componente motherBoard= new Componente("MainBoard Asus Sockets AMD");
        Componente cpu= new Componente("CPU AMD Ryzen 5 2800");
        Componente ventilador= new Componente("Ventilador CPU");
        Componente disipador= new Componente("Disipador");
        Componente tarjetaVideo= new Componente("NVIDIA RTX 3060");
        Componente gpu= new Componente("NVIDIA GPU RTX");
        Componente gpuRAM= new Componente("4GB");
        Componente gpuRAM2= new Componente("4GB");
        Componente ventiladores= new Componente("Ventiladores");
        Componente ram= new Componente("memoria RAM 32GB");
        Componente ssd= new Componente("Disco SSD 1TB");

        cpu.addComponente(ventilador)
                .addComponente(disipador);

        tarjetaVideo.addComponente(gpu)
                .addComponente(gpuRAM)
                .addComponente(gpuRAM2)
                .addComponente(ventiladores);

        motherBoard.addComponente(cpu)
                .addComponente(gpu)
                .addComponente(ram)
                .addComponente(ssd);

        pc.addComponente(fuentePoder)
                .addComponente(motherBoard)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        metodoRecursivoJAVA8(pc,0)
                .forEach(c-> System.out.println("\t".repeat(c.getNivel())+c.getNombre()));

    }
    public static Stream<Componente> metodoRecursivoJAVA8(Componente c, int nivel){
       c.setNivel(nivel);
       return Stream.concat(Stream.of(c),c.getHijos().stream().flatMap(hijo->metodoRecursivoJAVA8(hijo,nivel+1)));
    }

    public static void metodoRecursivo(Componente c,int nivel){
        System.out.println("\t".repeat(nivel)+c.getNombre());
        if (c.hasChildren()){
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo,nivel++);
            }
        }
    }

}
