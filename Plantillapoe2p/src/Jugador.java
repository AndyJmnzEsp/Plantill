
public class Jugador extends Deporte {
    private String nombreJugador;
    private int numJugador;
    private float peso;
    private Jugador aptSiguiente;
    
    public Jugador(String nombreJugador, int numJugador, float peso, String nombreDeporte, String equipo, int cantidad) {
        super(nombreDeporte, equipo, cantidad);
        this.nombreJugador = nombreJugador;
        this.numJugador = numJugador;
        this.peso = peso;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Jugador getAptSiguiente() {
        return aptSiguiente ;
    }  
    
      public void setAptSiguiente(Jugador aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
    
}
