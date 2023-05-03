
import javax.swing.JOptionPane;


public class ListaJugador {
    public Jugador lista;

    public ListaJugador() {
        lista = null;
    }

    public void Agregar(String nombreJugador, int numJugador, float peso, String nombreDeporte, String equipo, int cantidad){
        Jugador nuevo = new Jugador(nombreDeporte, numJugador, peso, nombreDeporte, equipo, cantidad);
        
        if(lista == null){
            lista = nuevo;
        }
        else{
            Jugador aux = lista;
            
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }
    
    public String recorrerLista(){
        Jugador aux = lista;
        String datos="";
        if(lista == null){
            System.out.println("La lista esta vacia. ");
        }
        else{
            while(aux != null){
                datos+= "EL nombre del jugador es : "+aux.getNombreJugador()+"\n";
                datos+= "EL numero del jugador es : "+aux.getNumJugador()+"\n";
                datos+= "EL peso del jugador es : "+aux.getPeso()+"\n";
                datos+= "EL nombre del deporte es : "+aux.getNombreDeporte()+"\n";
                datos+= "EL nombre del equipo es : "+aux.getEquipo()+"\n";
                datos+= "La cantidad de jugadores del deporte es : "+aux.getCantidad()+"\n";
                
                aux = aux.getAptSiguiente();
            }
        }
        return datos;
    }
    
    public String buscar(String nombre){
        String datos = "";
        Jugador aux = lista;
        if(lista == null){
           datos = "La lista esta vacia";
        }
        else{
            while(aux != null){
                
                if(nombre.equals(aux.getNombreJugador())){
                    datos+= "EL nombre del jugador es : "+aux.getNombreJugador()+"\n";
                    datos+= "EL numero del jugador es : "+aux.getNumJugador()+"\n";
                    datos+= "EL peso del jugador es : "+aux.getPeso()+"\n";
                    datos+= "EL nombre del deporte es : "+aux.getNombreDeporte()+"\n";
                    datos+= "EL nombre del equipo es : "+aux.getEquipo()+"\n";
                    datos+= "La cantidad de jugadores del deporte es : "+aux.getCantidad()+"\n";
                    break;
                }else{
                 datos+="Este dato no existe";
                }
                aux = aux.getAptSiguiente();
            }
        }
        
        
        return datos;
    }
    
 public boolean eliminar(String nombre){
    boolean eliminado = false;
    Jugador anterior = null;
    Jugador actual = lista;
    
    if(lista == null){
        eliminado = false;
    }
    else{
        while(actual != null){
            if(nombre.equals(actual.getNombreJugador())){
                if(anterior == null){ // El jugador a eliminar es el primero de la lista
                    lista = actual.getAptSiguiente();
                }else{
                    anterior.setAptSiguiente(actual.getAptSiguiente());
                }
                eliminado = true;
                break; // Se encontró el jugador a eliminar, se sale del ciclo while
            }
            anterior = actual;
            actual = actual.getAptSiguiente();
        }
    }
    
    return eliminado;
}   
}
