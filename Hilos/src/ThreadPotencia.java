import java.util.Scanner;

public class ThreadPotencia extends Thread{
    @Override
    public void run(){
        
        Scanner leer = new Scanner(System.in);

        int NumeroBase = 0;
        int NumeroExp = 0;

        System.out.println("   Potencia de un número");
        System.out.print("Ingrese el numero base: ");
        NumeroBase = leer.nextInt();

        System.out.print("Ingrese el numero exponente: ");
        NumeroExp = leer.nextInt();

        System.out.println("Potencia = "+Math.pow(NumeroBase, NumeroExp));


    }
}
