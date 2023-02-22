package pkg8.pkg1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Hora hora1 = new Hora(11, 30);
        Hora hora2 = new Hora();
        System.out.println(hora1.toString());
        System.out.println("Indique la cantidad de minutos a incrementar.");
        int incremento = teclado.nextInt();
        System.out.println("Incrementamos " + incremento);
        for (int i = 0; i < incremento; i++) {
            hora1.inc();
        }
        System.out.println(hora1.toString());

        System.out.println("Vamos a crear una hora desde cero.");
        System.out.println("Introduzca una hora");
        int hora = teclado.nextInt();
        if (hora2.setHora(hora)) {
            System.out.println("Se ha podido modificar la hora.");
        } else {
            System.out.println("La hora indicada no es correcta, no se pudo modificar.");
        }
        System.out.println("Introduzca los minutos");
        int minutos = teclado.nextInt();
        if (hora2.setMinutos(minutos)) {
            System.out.println("Se han podido modificar los minutos.");

        } else {
            System.out.println("Los minutos indicados no son correctos, no se pudo modificar.");
        }
        System.out.println(hora2.toString());

        // Ejercicio 8.2
        HoraExacta hora3 = new HoraExacta();

        System.out.println("Ahora vamos a crear una hora con segundos para ser más exactos. ");
        System.out.println("Introduzca una hora");
        hora = teclado.nextInt();
        if (hora3.setHora(hora)) {
            System.out.println("Se ha podido modificar la hora.");
        } else {
            System.out.println("La hora indicada no es correcta, no se pudo modificar.");
        }
        System.out.println("Introduzca los minutos");
        minutos = teclado.nextInt();
        if (hora3.setMinutos(minutos)) {
            System.out.println("Se han podido modificar los minutos.");

        } else {
            System.out.println("Los minutos indicados no son correctos, no se pudo modificar.");
        }
        System.out.println("Añade los segundos");
        int segundos = teclado.nextInt();
        if (hora3.setSegundos(segundos)) {
            System.out.println("Se ha podido modificar los segundos");
            System.out.println(hora3.toString());
        } else {
            System.out.println("Los segundos indicados no son correctos, no se pudo modificar.");
        }
        System.out.println("Indique la cantidad de segundos que desea incrementar: ");
        incremento = teclado.nextInt();

        for (int i = 0; i < incremento; i++) {
            hora3.inc();
        }
        System.out.println("Incrementamos " + incremento);
        System.out.println(hora3.toString());
        
        //Ejercicio 8.3
        
        HoraExacta hora4 = new HoraExacta(15,30,25);
        HoraExacta hora5 = new HoraExacta(15,30,25);
        HoraExacta hora6 = new HoraExacta(15,30,45);
        System.out.println("Es la hora 4 igual a la hora 5: " +hora4.equals(hora5));
        System.out.println("Es la hora 4 igual a la hora 6: " +hora4.equals(hora6));;
        
        
    }
    

}
