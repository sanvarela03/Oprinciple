import model.EstadoTarea;
import model.Pendiente;

public class Tarea {
    
    private EstadoTarea estadoTarea;

    public Tarea() {
        this.estadoTarea = new Pendiente();
    }

    public EstadoTarea getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(EstadoTarea estadoTarea) {
        this.estadoTarea = estadoTarea;
    }
}
