import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        int NumeroBase = 0;
        int NumeroExp = 0;

        System.out.print("Ingrese el numero base: ");
        NumeroBase = leer.nextInt();

        System.out.print("Ingrese el numero exponente: ");
        NumeroExp = leer.nextInt();

        Recursividad rec = new Recursividad();
        System.out.println("Resultado = "+rec.Potencia(NumeroBase, NumeroExp)); 
    }
}