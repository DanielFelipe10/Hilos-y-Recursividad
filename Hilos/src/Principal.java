
public class Principal {
    public static void main(String[] args) throws InterruptedException{

        ThreadSong ts = new ThreadSong();
        ThreadPotencia tp = new ThreadPotencia();
        ThreadDraw td = new ThreadDraw();

        tp.start();
        try {
            tp.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo ThreadPotencia" + e);
        }
        ts.start();
        td.start();
    }
}
