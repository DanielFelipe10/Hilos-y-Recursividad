import java.util.Scanner;

public class ThreadDraw extends Thread{
    @Override
    public void run(){
        Scanner leer = new Scanner(System.in);
        int filas;
        System.out.println();
        System.out.println("          Dibujar triangulo");
        System.out.print("Ingrese la cantidad de filas que desea: ");
        filas = leer.nextInt();

        System.out.println();
        for(int altura = 1; altura <= filas; altura++){
            for(int espacio = 1; espacio <= filas-altura; espacio++){//Espacios
                System.out.print(" ");
            }
            for(int dibujar = 1; dibujar <= (altura*2)-1; dibujar++){
                System.out.print("*");
                try {
                    ThreadDraw.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Error en la clase"+e);
                }
            }
            System.out.println();
            try {
                ThreadDraw.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase"+e);
            }
        }
    }
}
