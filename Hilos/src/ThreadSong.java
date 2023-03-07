import java.applet.AudioClip;

public class ThreadSong extends Thread{
    @Override//Sobreescribir los metodos de la clase Thready
    public void run(){//Clase run por defecto de Threads 
        AudioClip song;//Varaiable con la clase AudioClip
        song = java.applet.Applet.newAudioClip(getClass().getResource("media/Temita.wav"));//Crear el clip y señalar la ruta
        song.play();//Reproducir clip
    }
}
