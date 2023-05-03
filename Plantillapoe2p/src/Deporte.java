
public class Deporte {
    private String nombreDeporte, equipo;
    private int cantidad;

    public Deporte(String nombreDeporte, String equipo, int cantidad) {
        this.nombreDeporte = nombreDeporte;
        this.equipo = equipo;
        this.cantidad = cantidad;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
