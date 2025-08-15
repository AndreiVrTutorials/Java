package Ejercicios.Ejercicios2;

        // programa que simule una carrera de 2 caballos, con la misma posibilidad de ganar
        // cada vez que avanza un caballo, lo hace en una unidad
        // ambos parten desde el valor 0 hasta la meta que se encuentra en un valor aleatorio entre 100 y 200
        
        // el caballo que llegue primero a la meta ganará
        
        // visualmente el avance de cada caballo se hará imprimiendo por consola '1' para el primer caballo, '2' para el segundo

public class CarreraDeCaballos {
    public static void main(String[] args) {
        
        int cab1 = 0; // contador caballo 1
        int cab2 = 0; // contador caballo 2
        int meta = (int)(100*Math.random()+100); // random entre 100 y 200
        int i;
        
        System.out.println("Meta" + meta);
        
        for (i=0; i < meta; i++) {//parte meta
            int avance = (int)(10*Math.random()); // random para avanzar al caballo
            
            if (avance%2==0) {
//                System.out.println(1);
                cab1++;
                
            } else {
//                System.out.println(2);
                cab2++;
            }
            //parte caballos
            int j;
            for (j = 0; j<cab1; j++) {
                System.out.print("1");
                
            }
            System.out.println("");
            
            for (j = 0; j<cab2; j++) {
                System.out.print("2");
           }
            System.out.println("");
        
    }
    }
}