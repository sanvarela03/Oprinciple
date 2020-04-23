import model.EstadoTarea;
import model.Pendiente;

public class Tarea {
    
    EstadoTarea estadoTarea;

    public Tarea() {
        this.estadoTarea = new Pendiente();
    }

    public void finalizar(){
        System.out.println("Estado inicial de la tarea: "+ this.estadoTarea.getClass());
        estadoTarea = estadoTarea.cambiarEstado();
        System.out.println("Estado final de la tarea: "+ this.estadoTarea.getClass());
    }

    public EstadoTarea getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(EstadoTarea estadoTarea) {
        this.estadoTarea = estadoTarea;
    }
}
